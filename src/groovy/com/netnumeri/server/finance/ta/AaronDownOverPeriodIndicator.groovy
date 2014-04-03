package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.finpojo.Instrument

public class AaronDownOverPeriodIndicator extends Indicator {

    int period;

    public AaronDownOverPeriodIndicator(Instrument instrument, String name, Integer period) {
        super(instrument, name);
        this.period = period;
        build();
    }

    public void build() {
        double[] lows = instrument.lowSeries().convertToArray();
        double[] ad = Aroon.aroonDownOverPeriod(lows, period);
        copyBackwords(ad);
    }

}


