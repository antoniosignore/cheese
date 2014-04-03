package com.netnumeri.server.finance.finpojo


class Bet extends Persistable implements Serializable {

    double score;

    def transactions = new ArrayList<Trade>()

}
