package com.netnumeri.server.finance.finpojo.asset;

import com.netnumeri.server.finance.finpojo.Instrument

class Asset extends Instrument implements Serializable {

    static mapping = {
        tablePerHierarchy false
    }

    public Asset() {
    }

    public Asset(String name) {
        this.name = name
    }
}

