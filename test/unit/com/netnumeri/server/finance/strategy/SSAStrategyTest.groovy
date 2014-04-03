package com.netnumeri.server.finance.strategy

import com.netnumeri.server.finance.beans.GenericTimeSeries
import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.finpojo.Instrument
import com.netnumeri.server.finance.finpojo.Portfolio
import com.netnumeri.server.finance.finpojo.Trade
import com.netnumeri.server.finance.ta.TradeListEntry
import com.netnumeri.server.finance.trading.StrategyCatalog
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.YahooUtils
import com.netnumeri.server.utils.StockUtils
import dtmc.PortfolioService
import org.apache.commons.io.FileUtils
import org.junit.Test

import java.text.ParseException

public class SSAStrategyTest {


    public static final String TICKER = "BUD"
    String dir = "/home/antonio/timeplot/"

    @Test
    public void testStrategy() throws IOException, ParseException {

        PortfolioService tradeService = new PortfolioService();
        Portfolio portfolio = new Portfolio("SSA strategy", 10000);
        Date da = DateUtils.Date("1/1/2007");
        Date a = DateUtils.today();

        Instrument stock = YahooUtils.downloadYahooData(TICKER, da, a);

        TimeSeries closes = stock.getCloseSeries();

        FileUtils.writeStringToFile(new File(dir + "stock.txt"), closes.getTimeplotSeries())

        tradeService.add(portfolio, stock);

        StrategyCatalog strategy = new SSAStrategy("test", portfolio, da, a, 10000);
        strategy.run();

//        TransactionSeries series = strategy.transactionSeries

        BackTest trader = new BackTest(strategy, portfolio, 100000);
        double value = trader.test();

        System.out.println(trader.toXMLString())

        FileUtils.writeStringToFile(new File(dir + "/table.html"), trader.toXMLString())

        // TransactionSeries transactions = strategy.transactionSeries;
        GenericTimeSeries<Trade> array = transactions.transactionArray

        List<TradeListEntry> list = trader.getTradeList();

        StockUtils.printTimeplotIndicatorOnFile(dir, stock)

        TimeSeries pnlSeries = trader.getPnLSeries();
        StockUtils.printTimeSeriesOnFile(pnlSeries, dir)

        TimeSeries wealthSeries = trader.getWealthSeries();
        StockUtils.printTimeSeriesOnFile(wealthSeries, dir)

        StockUtils.printOnFile(dir, list)

        try {
            System.out.println(trader.accountWealth);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }


}
