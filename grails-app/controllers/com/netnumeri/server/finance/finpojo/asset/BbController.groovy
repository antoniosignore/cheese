package com.netnumeri.server.finance.finpojo.asset

import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.indicator.UserIndicators
import com.netnumeri.server.finance.strategy.SSASignal
import com.netnumeri.server.finance.strategy.Strategy
import com.netnumeri.server.finance.ta.BollingerBandDiffIndicator
import com.netnumeri.server.finance.ta.BollingerBandLowerIndicator
import com.netnumeri.server.finance.ta.BollingerBandUpIndicator
import com.netnumeri.server.finance.ta.Indicator
import com.netnumeri.server.finance.ta.NormalizedSeriesIndicator
import com.netnumeri.server.finance.utils.DateUtils

class BbController {

    def dailyService

    static allowedMethods = [indicator: "GET"]

    def index() {
        redirect(action: "indicator", params: params)
    }

    def indicator() {

        def stockInstance = Stock.get(params.id as Long)
        if (!stockInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'stock.label', default: 'Stock'), params.id])
            redirect(action: "show")
            return
        }

        Date da = DateUtils.todayThreeMonthsAgo()
        Date a = DateUtils.today()
        dailyService.refreshStock(stockInstance, da, a)
        TimeSeries closeSeries = stockInstance.buildCloseSeries()
        stockInstance.indicators.put("normalized", new NormalizedSeriesIndicator(closeSeries, "Normalized"))

        Indicator bbu = new BollingerBandUpIndicator(closeSeries, "BB-Upper", 10, 2)
        Indicator bbl = new BollingerBandLowerIndicator(closeSeries, "BB-Lower", 10, 2)
        Indicator bbdiff = new BollingerBandDiffIndicator(closeSeries, "BB-Diff", 10, 2)

        stockInstance.indicators.put("bbl", bbl)
        stockInstance.indicators.put("bbup", bbu)
        stockInstance.indicators.put("bbdiff", bbdiff)

        Strategy strategy = new SSASignal("test", stockInstance, da, a);

        [
                startDate: da,
                endDate: a,
                stockInstance: stockInstance,
                strategyInstance: strategy
        ]
    }
}
