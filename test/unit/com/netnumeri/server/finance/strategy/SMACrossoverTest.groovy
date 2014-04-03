package com.netnumeri.server.finance.strategy

import com.netnumeri.server.finance.beans.FinConstants
import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.finpojo.Instrument
import com.netnumeri.server.finance.trading.Signal
import com.netnumeri.server.finance.ta.SMAIndicator
import com.netnumeri.server.finance.trading.StrategyCatalog
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.YahooUtils
import org.junit.Test

import java.text.ParseException

public class SMACrossoverTest {

    String dir = "/home/antonio/timeplot/"

    @Test
    public void testStrategy() throws IOException, ParseException {

//        Portfolio portfolio = new Portfolio("SMA crossing", "Description", 10000);
        Date da = DateUtils.Date("1/1/2007");
        Date a = DateUtils.today();

        Instrument stock = YahooUtils.downloadYahooData("AAPL", "Apple Computers", da, a);

        TimeSeries closes = stock.series(FinConstants.CLOSE);
        //FileUtils.writeStringToFile(new File(dir + "stock.txt"), closes.getTimeplotSeries())

        stock.indicators.put("upper", new SMAIndicator(closes, "SMA-" + 50, 50))
        stock.indicators.put("lower", new SMAIndicator(closes, "SMA-" + 10, 10))
        StrategyCatalog strategy = new SMACrossoverSignal("test", stock, da, a);
        strategy.run();
        def signals = strategy.signals
        strategy.signals.each {
            Signal signal = it
            println "signal = $signal"
        }

//        TransactionSeries series = strategy.transactionSeries

//        BackTest trader = new BackTest(strategy, 100000);
//        double value = strategy.tester.test();
//
//        System.out.println(trader.toXMLString())
//
//        FileUtils.writeStringToFile(new File(dir + "/table.html"), trader.toXMLString())
//
////        TransactionSeries transactions = strategy.transactionSeries;
//        GenericTimeSeries<Transaction> array = strategy.portfolio.transactions
//
//        List<TradeListEntry> list = trader.getTradeList();
//
//        StockUtils.printTimeplotIndicatorOnFile(dir, stock)
//
//        TimeSeries pnlSeries = trader.getPnLSeries();
//        StockUtils.printTimeSeriesOnFile(pnlSeries, dir)
//
//        TimeSeries wealthSeries = trader.getWealthSeries();
//        StockUtils.printTimeSeriesOnFile(wealthSeries, dir)
//
//        StockUtils.printOnFile(dir, list)

//        try {
//            System.out.println(trader.accountWealth);
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }


    }

    @Test
    public void testTimeplot() throws IOException, ParseException {

        Date da = DateUtils.Date("1/1/2011");
        Date a = DateUtils.today();

        Instrument stock = YahooUtils.downloadYahooData("AAPL", da, a);
        TimeSeries closes = stock.getCloseSeries();

        String series = closes.getTimeplotSeries();
        println "series = $series"

    }

}
