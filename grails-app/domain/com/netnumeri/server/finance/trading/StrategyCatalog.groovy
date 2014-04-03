package com.netnumeri.server.finance.trading

public class StrategyCatalog {

    static hasMany = [subscriptions: StrategySubscription]

    String name

    Date dateCreated
    Date lastUpdated

    public StrategyCatalog(String name) {
        this.name = name
    }

}
