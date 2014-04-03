package com.netnumeri.server.finance.finpojo

import com.netnumeri.server.finance.finpojo.asset.Asset
import com.netnumeri.server.finance.finpojo.derivative.Derivative

public class PortfolioEntry implements Serializable {

    static constraints = {
    }

    static belongsTo = [portfolio: Portfolio, instrument: Instrument]

    Integer amount = 0;

    public PortfolioEntry() {
    }

    private void init() {
        this.amount = 0;
    }

    public PortfolioEntry(Instrument instrument, Portfolio portfolio) {
        this.instrument = instrument;
        this.portfolio = portfolio;
    }

    // amount < 0 means taking short position in instrument
    public PortfolioEntry(Instrument instrument, Integer amount, Portfolio portfolio) {
        this.instrument = instrument;
        this.amount = amount;
        this.portfolio = portfolio;
    }

    public int position() {
        if (amount >= 0)
            return +1;
        else
            return -1;
    }

    public double price() {
        if (instrument instanceof Asset) {
            return instrument.getLast();
        } else if (instrument instanceof Derivative) {
            return instrument.premium();
        }
        return 0;
    }

    public double value() {
        return price() * amount;
    }

}
