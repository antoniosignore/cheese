package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.finpojo.Instrument

public class ChaikinMoneyFlowOverPeriodIndicator extends Indicator {

    int period

    public ChaikinMoneyFlowOverPeriodIndicator(Instrument instrument, String name, Integer period) {
        super(instrument, name);
        this.period = period;
        build();
    }

    public void build() {
        double[] highs = instrument.highSeries().convertToArray();
        double[] lows = instrument.lowSeries().convertToArray();
        double[] closes = instrument.closeSeries().convertToArray();
        double[] vols = instrument.volumeSeries().convertToArray();
        double[] ad = AccumulateDistribute.chaikinMoneyFlowOverPeriod(highs, lows, closes, vols, period);
        copyBackwords(ad);
    }

}


