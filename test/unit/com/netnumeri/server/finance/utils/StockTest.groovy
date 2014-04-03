package com.netnumeri.server.finance.utils;


import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.finpojo.Portfolio
import com.netnumeri.server.finance.finpojo.asset.Stock

public class StockTest extends GroovyTestCase {


    public void test() {

        try {

            Portfolio portfolio = new Portfolio("chaos", 10000);
            Date da = DateUtils.Date("1/1/2004");
            Date a = new Date();
            Stock stock = YahooUtils.downloadYahooData("MSFT", da, a);
            TimeSeries closeSeries = stock.getCloseSeries();
            String timeplotSeries = closeSeries.getTimeplotSeries();

            System.out.println("timeplotSeries = " + timeplotSeries);

//            portfolio.add(YahooUtils.downloadYahooData("IBM", da, a));
/*
            portfolio.add(YahooUtils.downloadYahooData("GLW", da, a));
            portfolio.add(YahooUtils.downloadYahooData("IBM", da, a));
            portfolio.add(YahooUtils.downloadYahooData("MSFT", da, a));
            portfolio.add(YahooUtils.downloadYahooData("HPQ", da, a));
            portfolio.add(YahooUtils.downloadYahooData("GE", da, a));
            portfolio.add(YahooUtils.downloadYahooData("GM", da, a));
            portfolio.add(YahooUtils.downloadYahooData("STOCK_TICKER", da, a));
*/

//            SSAStrategy strategy = new SSAStrategy("test", portfolio, da, a, 10000, root);
//            strategy.setNumberOfTradingDays(500);
//            strategy.execute(parametersMap);
//
//            FileUtils.stringToFile(
//                    Dom4JXmlUtils.generateXmlFromDoc(document), "/home/antonio/graphs/signals.xml");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
