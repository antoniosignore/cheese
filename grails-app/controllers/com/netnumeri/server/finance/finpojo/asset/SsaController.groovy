package com.netnumeri.server.finance.finpojo.asset

import com.netnumeri.server.finance.beans.FinConstants
import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.indicator.UserIndicators
import com.netnumeri.server.finance.strategy.SSASignal
import com.netnumeri.server.finance.strategy.Strategy
import com.netnumeri.server.finance.ta.*
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.utils.StockUtils

class SsaController {

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

        List<Integer> components = [0]
        stockInstance.indicators.put("trend", new SSAComponentsIndicator(closeSeries, "SSA-0", 50, components))

        List<Integer> components1 = [1]
        stockInstance.indicators.put("comp1", new SSAComponentsIndicator(closeSeries, "SSA-1", 50, components1))

        List<Integer> components01 = [0, 1]
        stockInstance.indicators.put("comp01", new SSAComponentsIndicator(closeSeries, "SSA-01", 50, components01))

        List<Integer> components12 = [1, 2]
        stockInstance.indicators.put("comp12", new SSAComponentsIndicator(closeSeries, "SSA-12", 50, components12))

        Strategy strategy = new SSASignal("test", stockInstance, da, a);
//        strategy.run();

        [
                startDate: da,
                endDate: a,
                stockInstance: stockInstance,
                strategyInstance: strategy
        ]
    }
}
