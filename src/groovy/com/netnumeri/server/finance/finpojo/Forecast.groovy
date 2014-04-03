package com.netnumeri.server.finance.finpojo


class Forecast extends Persistable implements Serializable {

    String ticker
    Double percent
    Date when

}
