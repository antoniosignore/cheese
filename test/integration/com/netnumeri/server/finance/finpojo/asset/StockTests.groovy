package com.netnumeri.server.finance.finpojo.asset

import com.netnumeri.server.finance.beans.FinConstants
import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.finpojo.Instrument
import com.netnumeri.server.finance.ta.*
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.YahooUtils
import com.netnumeri.server.utils.StockUtils
import org.junit.After
import org.junit.Before
import org.junit.Test

class StockTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {

        Date da = DateUtils.Date("11/1/2012");
        Date a = DateUtils.today();

        Instrument stockInstance = YahooUtils.downloadYahooData("AAPL", "desc", da, a);

        // last year
        StockUtils.lastYear(stockInstance);

        TimeSeries closes = stockInstance.series(FinConstants.CLOSE);

        int smoothing = 10;
        int smoothing1 = 10;
        int smoothing2 = 10;
        int smoothing3 = 10;
        int period = 10;
        int length = 10;
        int indicatorOrder = 10;
        int k = 10;
        double deviation = 10;

//        new SMAIndicator(closes, "Simple Moving Average", smoothing1);
//        new WMAIndicator(closes, "Weighted Moving Average", smoothing1);

        List<Integer> components = [0]
        SSAComponentsIndicator indicator = new SSAComponentsIndicator(closes, "SSA-0", period, components);

        println "indicator = $indicator"

//        components = [1]
//        new SSAComponentsIndicator(closes, "SSA-1", period, components);
//
//        components = [0, 1]
//        new SSAComponentsIndicator(closes, "SSA-01", period, components);
//        new PriceChannelUpIndicator(closes, "PC-Upper", indicatorOrder, k);
//        new PriceChannelLowerIndicator(closes, "PC-Lower", indicatorOrder, k);
//        new BollingerBandUpIndicator(closes, "BB-Upper", length, deviation);
//        new BollingerBandLowerIndicator(closes, "BB-Lower", length, deviation);
//        new SimpleMovingVarianceIndicator(closes, "Simple Moving variance", indicatorOrder);
//        new MomentumPctPeriodIndicator(stockInstance, "Momentum", period)
//        new MACDIndicator(closes, "MACD", smoothing1, smoothing2)
//        new MACDSignal(closes, "MACD-Signal", smoothing1, smoothing2, smoothing3)
//        new RateOfChangeOverPeriodIndicator(stockInstance, "MACD", period)
//        new RSIIndicator(closes, "RSI", period)
//        new RSI2Indicator(closes, "RSI", period)
//        new CommodityChannelIndicator(closes, "CCI", indicatorOrder)
//        new PriceChannelUpIndicator(closes, "PCI", indicatorOrder, k)
//        new PriceChannelLowerIndicator(closes, "PCI", indicatorOrder, k)
//        new TrueRangeOverPeriodIndicator(stockInstance, "TrueRange")
//        new MoneyFlowOverPeriodIndicator(stockInstance, "Money flow", period)
//        new AccumulateDistributionOverPeriodIndicator(stockInstance, "Accumulate Distribution", smoothing1)
//        new ChaikinOscillatorOverPeriodIndicator(stockInstance, "ChaikinOscillatorOverPeriodIndicator", smoothing1)
//        new ChaikinMoneyFlowOverPeriodIndicator(stockInstance, "ChaikinMoneyFlowOverPeriodIndicator", smoothing1)
//        new AaronOscillatorOverPeriodIndicator(stockInstance, "AaronOscillatorOverPeriodIndicator", period)
//        new AaronDownOverPeriodIndicator(stockInstance, "Aaron Down Over Period Indicator", period)
//        new AaronUpOverPeriodIndicator(stockInstance, "Aaron Up Over Period Indicator", period)
//        new TrueRangeOverPeriodIndicator(stockInstance, "true Range Over Period Indicator")
//        new KFastStochasticIndicator(stockInstance, "K Fast Stochastic Indicator", period)
//        new DStochasticIndicator(stockInstance, "D Stochastic Indicator", period, method, smoothing1)
//        new DStochasticSmoothedIndicator(stockInstance, "D Stochastic Smoothed Indicator", period, smoothing1)
//        new ChaikinVolatilityIndicator(stockInstance, "Chaikin Volatility Indicator", smoothing1, period)
//        new MACDSignal(closes, "MACD Signal Indicator", smoothing1, smoothing2, smoothing3)
//        new PlusDMIndicator(stockInstance, "Plus DMI Indicator")
//        new RateOfChangeOverPeriodIndicator(stockInstance, "Rate of Change Indicator", period)
//        new KairiIndicator(stockInstance, "Kairi Indicator", smoothing1)
//        new MomentumPctPeriodIndicator(stockInstance, "Momentum Pct Period Indicator", period)
//        new CommodityChannelIndicator(closes, "CCI", indicatorOrder)
//        new MarketFacilitationIndexIndicator(stockInstance, "Market Facilitation Index Indicator")
//        new BalanceOfPowerIndicator(stockInstance, "Balance of Power Indicator")
//        new PriceActionOverPeriodIndicator(stockInstance, "Price action over period indicator")

    }
}
