package com.netnumeri.server.finance.finpojo

import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.YahooUtils
import grails.test.mixin.TestFor

@TestFor(PortfolioEntry)
class PortfolioEntryTest {

    def portfolioService

    void testSomething() {
        Portfolio portfolio = new Portfolio("SMA crossing", 10000)
        portfolio.save(failOnError: true, insert: true, flush: true)

        println "portfolio.id = $portfolio.id"

        Date da = DateUtils.Date("1/1/2007");
        Date a = DateUtils.today();
        Instrument stock = YahooUtils.downloadYahooData("AAPL", da, a);
        stock.save(failOnError: true, insert: true, flush: true)

        println "stock.id = $stock.id"

        PortfolioEntry item = new PortfolioEntry(stock, 100, portfolio);
        item.save(failOnError: true, insert: true, flush: true)
    }
}
