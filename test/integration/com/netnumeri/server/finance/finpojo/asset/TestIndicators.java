package com.netnumeri.server.finance.finpojo.asset;

import com.netnumeri.server.finance.beans.FinConstants;
import com.netnumeri.server.finance.beans.TimeSeries;
import com.netnumeri.server.finance.finpojo.Instrument;
import com.netnumeri.server.finance.ta.*;
import com.netnumeri.server.finance.utils.DateUtils;
import com.netnumeri.server.finance.utils.YahooUtils;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

public class TestIndicators {


    @Test
    public void testSomething() throws IOException, ParseException {

        Date da = DateUtils.Date("11/1/2012");
        Date a = DateUtils.today();

        Instrument stockInstance = YahooUtils.downloadYahooData("AAPL", "desc", da, a);

        // last year
//        StockUtils.lastYear(stockInstance);

        TimeSeries closes = stockInstance.series(FinConstants.CLOSE);

        int smoothing = 10;
        int smoothing1 = 10;
        int smoothing2 = 10;
        int smoothing3 = 10;
        int period = 10;
        int length = 10;
        int indicatorOrder = 10;
        int k = 10;
        int method = 10;
        double deviation = 10;


        new SMAIndicator(closes, "Simple Moving Average", smoothing1);

        MomentumPctPeriodIndicator momentum = new MomentumPctPeriodIndicator(closes, "Momentum", period);


        new WMAIndicator(closes, "Weighted Moving Average", smoothing1);

        new PriceChannelUpIndicator(closes, "PC-Upper", indicatorOrder, k);
        new PriceChannelLowerIndicator(closes, "PC-Lower", indicatorOrder, k);
        new BollingerBandUpIndicator(closes, "BB-Upper", length, deviation);
        new BollingerBandLowerIndicator(closes, "BB-Lower", length, deviation);
        new SimpleMovingVarianceIndicator(closes, "Simple Moving variance", indicatorOrder);
        new MACDIndicator(closes, "MACD", smoothing1, smoothing2);
        new MACDSignal(closes, "MACD-Signal", smoothing1, smoothing2, smoothing3);
        new RateOfChangeOverPeriodIndicator(closes, "Rate of change", period);
        new RSIIndicator(closes, "RSI", period);
        new RSI2Indicator(closes, "RSI", period);
        new CommodityChannelIndicator(closes, "CCI", indicatorOrder);
        new PriceChannelUpIndicator(closes, "PCI", indicatorOrder, k);
        new PriceChannelLowerIndicator(closes, "PCI", indicatorOrder, k);
        new TrueRangeOverPeriodIndicator(stockInstance, "TrueRange");
        new AccumulateDistributionOverPeriodIndicator(stockInstance, "Accumulate Distribution", smoothing1);
        new ChaikinOscillatorOverPeriodIndicator(stockInstance, "ChaikinOscillatorOverPeriodIndicator", 0);
        new ChaikinMoneyFlowOverPeriodIndicator(stockInstance, "ChaikinMoneyFlowOverPeriodIndicator", 10);
        new AaronOscillatorOverPeriodIndicator(stockInstance, "AaronOscillatorOverPeriodIndicator", period);
        new AaronDownOverPeriodIndicator(stockInstance, "Aaron Down Over Period Indicator", period);
        new AaronUpOverPeriodIndicator(stockInstance, "Aaron Up Over Period Indicator", period);
        new TrueRangeOverPeriodIndicator(stockInstance, "true Range Over Period Indicator");
        new KFastStochasticIndicator(stockInstance, "K Fast Stochastic Indicator", period);
        new DStochasticIndicator(stockInstance, "D Stochastic Indicator", period, 1, smoothing1);
        new DStochasticSmoothedIndicator(stockInstance, "D Stochastic Smoothed Indicator", period, smoothing1);
        new ChaikinVolatilityIndicator(stockInstance, "Chaikin Volatility Indicator", smoothing1, period);
        new MACDSignal(closes, "MACD Signal Indicator", smoothing1, smoothing2, smoothing3);
        new PlusDMIndicator(stockInstance, "Plus DMI Indicator");
        new RateOfChangeOverPeriodIndicator(closes, "Rate of Change Indicator", period);
//        new KairiIndicator(stockInstance, "Kairi Indicator", 10);
        new MomentumPctPeriodIndicator(closes, "Momentum Pct Period Indicator", period);
        new CommodityChannelIndicator(closes, "CCI", indicatorOrder);
        new MarketFacilitationIndexIndicator(stockInstance, "Market Facilitation Index Indicator");
        new BalanceOfPowerIndicator(stockInstance, "Balance of Power Indicator");
        new PriceActionOverPeriodIndicator(stockInstance, "Price action over period indicator");

//        new MoneyFlowOverPeriodIndicator(stockInstance, "Money flow", 10);

    }
}
