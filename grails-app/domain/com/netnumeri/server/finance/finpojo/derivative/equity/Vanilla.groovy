package com.netnumeri.server.finance.finpojo.derivative.equity;

import com.netnumeri.server.entity.OptionType
import com.netnumeri.server.finance.finpojo.Instrument
import com.netnumeri.server.finance.finpojo.derivative.Derivative

class Vanilla extends Derivative implements Serializable {

    static belongsTo = [underlying: Instrument]

    double interestRate;
    def expiration;
    def strike;
    def premium;
    def change;
    def dividend;
    public OptionType type;
    def contractSize;
    def openInterest;
    public Double bid;
    public Double ask;

    public Vanilla() {
    }

    @Override
    public Instrument underlying() {
        return underlying;
    }

    @Override
    public double interestRate() {
        return interestRate;
    }

    @Override
    public Date expiration() {
        return expiration;
    }

    @Override
    public double strike() {
        return strike;
    }

    @Override
    public double premium() {
        return premium;
    }

    @Override
    public int contractSize() {
        return contractSize;
    }

    @Override
    public int openInterest() {
        return openInterest;
    }

    @Override
    public double alpha(int model) {
        return alpha;
    }

    @Override
    public double beta(int model) {
        return beta;
    }

    @Override
    public double theta(int model) {
        return theta;
    }

    @Override
    public double rho(int model) {
        return rho;
    }

    @Override
    public double vega(int model) {
        return vega;
    }

    public Vanilla(String id,
                   String optionName,
                   String stockTicket,
                   OptionType type,
                   Double strike,
                   Date expiration) {

        this.id = id;
        this.name = optionName;
        this.underlying = stockTicket;
        this.type = (type);
        this.strike = (strike);
        this.expiration = (expiration);

    }

    public double modelPrice(int model) {
        return 0;
    }

    public Vanilla(String Name) {
        name = Name;
    }

    public double getPayoff(double instrumentPrice, boolean withPremium) {
        double payoff = 0;
        if (type == OptionType.CALL) {
            payoff = Math.max(0, instrumentPrice - strike);
        } else {
            payoff = Math.max(0, strike - instrumentPrice);
        }
        if (withPremium) {
            payoff -= premium;
        }
        return payoff;
    }

    @Override
    public String toString() {
        def jsonBuilder = new groovy.json.JsonBuilder()
        jsonBuilder.option(
                ticker: name,
                interestRate: interestRate,
                expirationDate: expiration().toGMTString(),
                strike: strike,
                premium: premium,
                change: change,
                dividend: dividend,
                type: type.toString(),
                contractSize: contractSize,
                openInterest: openInterest,
                alpha: alpha,
                beta: beta,
                theta: theta,
                rho: rho,
                vega: vega
        )
        return builder.toPrettyString()
    }

    public Double d() {
        return dividend;
    }
}