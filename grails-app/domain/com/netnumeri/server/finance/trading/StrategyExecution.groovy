package com.netnumeri.server.finance.trading

import com.netnumeri.server.finance.finpojo.Instrument
import com.netnumeri.server.finance.finpojo.Persistable

class StrategyExecution extends Persistable {

    static hasMany = [signals: Signal]
    static belongsTo = [instrument: Instrument]

    static constraints = {
    }

    static mapping = {
    }

}
