package com.netnumeri.server.finance.strategy

import com.netnumeri.server.finance.beans.TradeEnum
import com.netnumeri.server.finance.finpojo.Instrument

class Signal {

    final Date day
    final TradeEnum direction
    final Instrument instrument
    final double value

    Signal(Date day, TradeEnum direction, Instrument instrument, double value) {
        println "SIGNAL = $day"
        println "direction = $direction.value"
        println "instrument = $instrument.name"
        this.day = day
        this.direction = direction
        this.instrument = instrument
        this.value = value
    }

    @Override
    public String toString() {
        return "Signal{\n" +
                "day=" + day + "\n" +
                ", direction=" + direction +   "\n" +
                ", instrument=" + instrument +  "\n" +
                '}';
    }
}
