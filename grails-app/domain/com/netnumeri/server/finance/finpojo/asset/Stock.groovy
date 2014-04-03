package com.netnumeri.server.finance.finpojo.asset

import com.netnumeri.server.finance.utils.YahooInstantSnapshot
import com.netnumeri.server.utils.OptionsChain

class Stock extends Asset implements Serializable {

    static mapping = {
        id generator: 'hilo',
                params: [table: 'hi_value', column: 'next_value', max_lo: 100]
    }

    static transients = [
            "chain",
            "snapshot"
    ]


    String description

    OptionsChain chain;
    YahooInstantSnapshot snapshot;

    public Stock(String name, String description) {
        this.name = name;
        this.description = description
    }

    public double modelPrice(int model) {
        return 0;
    }

}
