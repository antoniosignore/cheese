package com.netnumeri.server.finance.strategy

import com.netnumeri.server.entity.OptionType
import com.netnumeri.server.finance.finpojo.asset.Stock
import com.netnumeri.server.finance.finpojo.derivative.equity.Vanilla
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.YahooUtils
import com.netnumeri.server.utils.StockUtils

import java.text.SimpleDateFormat

public class StrategyHelperTest extends GroovyTestCase {


    public void testGetAtTheMoneyCall() throws Exception {

        StrategyHelper helper = new StrategyHelper();
        Date da = DateUtils.Date("1/1/2004");
        Date a = new Date();
        Stock stock = YahooUtils.downloadYahooData("GOOG", da, a);
        StockUtils.refreshData(stock);

        List<Vanilla> atTheMoneyCall = helper.getAtTheMoneyList(stock, OptionType.CALL);
        for (int i = 0; i < atTheMoneyCall.size(); i++) {
            Vanilla option = atTheMoneyCall.get(i);
            System.out.println("atTheMoneyCall = " + option.toString());
        }

        List<Vanilla> atTheMoneyPut = helper.getAtTheMoneyList(stock, OptionType.PUT);
        for (int i = 0; i < atTheMoneyPut.size(); i++) {
            Vanilla option = atTheMoneyPut.get(i);
            System.out.println("atTheMoneyPut = " + option.toString());
        }

    }


    public void testName() throws Exception {
        StrategyHelper helper = new StrategyHelper();
    }

    public void testDateFormat() {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        def parsed = df.parse(
                "6/12/2012 0:0:0.0");


        print parsed
    }

}
