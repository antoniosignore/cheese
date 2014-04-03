package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.utils.IndicatorUtils

public class SimpleMovingVarianceIndicator extends Indicator {

    int order;

    public SimpleMovingVarianceIndicator(TimeSeries series, String name, Integer order) {

        super(series, name);
        this.order = order;
        build();

    }

    public void build() {

        Date date = series.firstDate()
        int index = 0;
        while (index < getFirstIndicatorIndex()) {
            date = series.nextDate(date);
            index++;
        }

        while (date != null) {

            if (!series.isEmpty(date)) {

                add(date, IndicatorUtils.SMV(series, date, order));

            }
            date = series.nextDate(date)
        }

    }


    public int getFirstIndicatorIndex() {

        return (int) order;

    }

}


