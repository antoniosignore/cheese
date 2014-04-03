package com.netnumeri.server.finance.trading

import com.netnumeri.server.finance.beans.TradeEnum
import com.netnumeri.server.finance.finpojo.Persistable

class Signal extends Persistable {

    Date day
    TradeEnum direction
    double value

    static belongsTo = { strategyExecution: StrategyExecution }

    @Override
    public String toString() {
        return "Signal{\n" +
                "day=" + day + "\n" +
                ", direction=" + direction + "\n" +
                '}';
    }
}
