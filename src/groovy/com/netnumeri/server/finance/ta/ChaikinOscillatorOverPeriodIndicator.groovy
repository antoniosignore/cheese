package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.finpojo.Instrument

public class ChaikinOscillatorOverPeriodIndicator extends Indicator {

    int smoothing;

    public ChaikinOscillatorOverPeriodIndicator(Instrument instrument, String name, Integer smoothing) {
        super(instrument, name);
        this.smoothing = smoothing;
        build();
    }

    public void build() {
        double[] highs = instrument.highSeries().convertToArray();
        double[] lows = instrument.lowSeries().convertToArray();
        double[] vols = instrument.volumeSeries().convertToArray();
        double[] ad = AccumulateDistribute.chaikinOscillatorOverPeriod(highs, lows, vols, smoothing);
        copyBackwords(ad);
    }

}


