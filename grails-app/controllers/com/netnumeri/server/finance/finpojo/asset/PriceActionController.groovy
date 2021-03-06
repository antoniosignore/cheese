package com.netnumeri.server.finance.finpojo.asset

import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.ta.NormalizedSeriesIndicator
import com.netnumeri.server.finance.ta.PriceActionOverPeriodIndicator
import com.netnumeri.server.finance.utils.DateUtils

class PriceActionController {

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
        dailyService.dailyFromDatabase(stockInstance, da, a)
        TimeSeries closeSeries = stockInstance.buildCloseSeries()
        stockInstance.indicators.put("normalized", new NormalizedSeriesIndicator(closeSeries, "Normalized"))
        stockInstance.indicators.put("pa", new PriceActionOverPeriodIndicator(stockInstance, "Price action over integer1 indicator"))
        [
                startDate: da,
                endDate: a,
                stockInstance: stockInstance
        ]
    }
}
