package dtmc

import com.netnumeri.server.finance.finpojo.Daily
import com.netnumeri.server.finance.finpojo.asset.Stock
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.utils.StockUtils
import grails.gorm.DetachedCriteria
import grails.transaction.Transactional

@Transactional
class DailyService {

    public void updateDailyDatabase() {

        Date da = DateUtils.todayThreeMonthsAgo()
        Date a = DateUtils.today()

        def all = Stock.findAll()

        all.each { stock ->

            List<Daily> dailies = Daily.findAllByInstrument(stock, [sort: "dailydate", order: "asc"])

            println "dailies.size() = " + dailies.size()

            if (dailies.size() > 0){
                println "dailies = " + dailies.get(0)
                println "dailies = " + dailies.get(dailies.size() -1 )

            }

            stock.dailyarray.clear()
            StockUtils.refreshDaily(stock, da, a);
        }

    }

    public void refreshStock (Stock stock, Date da, Date a){

       def criteria =  new DetachedCriteria(Daily).build {
                eq('instrument.id', stock.getId())
        }

        List<Daily> slides = criteria.list(sort: "dailydate", order: "asc")
        for (int i = 0; i < slides.size(); i++) {
            Daily daily = slides.get(i);
            stock.dailyarray.put(daily.dailydate, daily)
        }

    }


//        if (params.from != null) {
//            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy")
//            da = format.parse(params.from)
//            a = format.parse(params.to)
//        }


}
