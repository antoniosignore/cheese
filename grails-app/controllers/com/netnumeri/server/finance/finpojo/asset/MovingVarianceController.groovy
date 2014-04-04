package com.netnumeri.server.finance.finpojo.asset

import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.strategy.SSASignal
import com.netnumeri.server.finance.strategy.Strategy
import com.netnumeri.server.finance.ta.NormalizedSeriesIndicator
import com.netnumeri.server.finance.ta.RSIIndicator
import com.netnumeri.server.finance.ta.SimpleMovingVarianceIndicator
import com.netnumeri.server.finance.utils.DateUtils

class MovingVarianceController {

    def dailyService

    static allowedMethods = [show: "GET", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "show", params: params)
    }

    def show() {

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
        stockInstance.indicators.put("mv", new SimpleMovingVarianceIndicator(closeSeries, "Moving Variance",14))

        Strategy strategy = new SSASignal("test", stockInstance, da, a);

        [
                startDate: da,
                endDate: a,
                stockInstance: stockInstance,
                strategyInstance: strategy
        ]
    }
}
