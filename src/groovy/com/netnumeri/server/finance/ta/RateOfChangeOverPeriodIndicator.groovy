package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.beans.TimeSeries

public class RateOfChangeOverPeriodIndicator extends Indicator {

    int period

    public RateOfChangeOverPeriodIndicator(TimeSeries instrument, String name, Integer period) {
        super(instrument, name);
        this.period = period;
        double[] ad = Oscillators.rateOfChangePeriod(
                instrument.convertToArray(),
                (int) period);
        copyBackwords(ad);
    }

}


