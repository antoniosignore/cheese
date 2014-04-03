package com.netnumeri.server.finance.indicator

import com.netnumeri.server.finance.beans.TimeSeries;

/**
 * Implementation reference: http://en.wikipedia.org/wiki/Force_Index
 *
 * @author Florent Guiliani
 */
public class ForceIndex {


    public static double calculate(TimeSeries closes, TimeSeries volumes, Date date) {

        int lastBar = closes.matrix.index(date);
        double previousBar = closes.matrix.value(lastBar - 1);

        double value = volumes.matrix.value(lastBar) * (closes.matrix.value(lastBar) - previousBar);
        return value;
    }
}
