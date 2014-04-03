package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.beans.TimeSeries

public class MomentumPctPeriodIndicator extends Indicator {

    int period;

    public MomentumPctPeriodIndicator(TimeSeries series, String name, Integer period) {
        super(series, name);
        this.period = period;
        double[] closes = series.convertToArray();
        double[] ar = Momentum.momentumPctPeriod(closes, period);
        copyBackwords(ar);
    }

}


