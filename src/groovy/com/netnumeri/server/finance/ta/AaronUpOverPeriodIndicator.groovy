package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.finpojo.Instrument

public class AaronUpOverPeriodIndicator extends Indicator {

    int period;

    public AaronUpOverPeriodIndicator(Instrument instrument, String name, Integer param1) {
        super(instrument, name);
        period = param1;
        build();
    }

    public void build() {
        double[] highs = instrument.highSeries().convertToArray();
        double[] ad = Aroon.aroonUpOverPeriod(highs, period);
        copyBackwords(ad);
    }

}


