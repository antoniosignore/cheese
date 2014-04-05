package com.netnumeri.server.finance.finpojo.asset

import com.netnumeri.server.enums.IndicatorEnum
import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.strategy.SSASignal
import com.netnumeri.server.finance.strategy.Strategy
import com.netnumeri.server.finance.ta.Indicator
import com.netnumeri.server.finance.ta.MACDIndicator
import com.netnumeri.server.finance.ta.MACDSignal
import com.netnumeri.server.finance.ta.NormalizedSeriesIndicator
import com.netnumeri.server.finance.ta.PriceChannelLowerIndicator
import com.netnumeri.server.finance.ta.PriceChannelUpIndicator
import com.netnumeri.server.finance.utils.DateUtils

class MacdController {

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

        Indicator pcu = new PriceChannelUpIndicator(closeSeries, "PCUpper", 10, 2);
        Indicator pcl = new PriceChannelLowerIndicator(closeSeries, "PCLower", 10, 2);

        stockInstance.indicators.put("macd", new MACDIndicator(closeSeries, "MACD", 12, 24))
        stockInstance.indicators.put("macdsignal", new MACDSignal(closeSeries, "MACD Signal", 12, 24, 5))

        Strategy strategy = new SSASignal("test", stockInstance, da, a);

        [
                startDate: da,
                endDate: a,
                stockInstance: stockInstance,
                strategyInstance: strategy
        ]
    }
}
