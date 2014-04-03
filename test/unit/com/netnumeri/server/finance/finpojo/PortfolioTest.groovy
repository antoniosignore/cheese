package com.netnumeri.server.finance.finpojo

import grails.test.mixin.TestFor

@TestFor(Portfolio)
class PortfolioTest {

    void testSave() {

        Portfolio portfolio = new Portfolio("SMA crossing", 10000)
        portfolio.save(failOnError: true, insert: true, flush: true)

        println "portfolio.id = $portfolio.id"

    }

}
