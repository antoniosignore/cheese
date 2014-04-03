package com.netnumeri.server.finance.strategy

import com.netnumeri.server.finance.finpojo.Bet
import com.netnumeri.server.finance.finpojo.Forecast


class StrategyEngineTest extends GroovyTestCase {

    void testAnalyze() {

        Forecast forecast = new Forecast();
        forecast.percent = 0.1
        forecast.type = ForecastType.bullish
        forecast.when = new Date();
        forecast.instrument_id = 1

        List<Bet> bets = StrategyEngine.analyze(forecast);

    }
}
