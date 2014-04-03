package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.finpojo.Instrument

public class AaronOscillatorOverPeriodIndicator extends Indicator {

    int period

    public AaronOscillatorOverPeriodIndicator(Instrument instrument, String name, Integer period) {
        super(instrument, name);
        this.period = period;
        build();
    }

    public void build() {
        double[] highs = instrument.highSeries().convertToArray();
        double[] lows = instrument.lowSeries().convertToArray();
        double[] ad = Aroon.aroonOscillatorOverPeriod(highs, lows, period);
        copyBackwords(ad);
    }

}


