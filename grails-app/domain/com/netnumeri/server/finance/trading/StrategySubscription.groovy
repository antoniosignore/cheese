package com.netnumeri.server.finance.trading

import com.dtmc.club.Member

class StrategySubscription {

    static constraints = {
    }

    static belongsTo = [user: Member, strategy: StrategyCatalog]

    static mapping = {
    }

    Date dateCreated
    Date lastUpdated


}
