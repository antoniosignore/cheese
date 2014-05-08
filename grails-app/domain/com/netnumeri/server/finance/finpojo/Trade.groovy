package com.netnumeri.server.finance.finpojo

import com.netnumeri.server.finance.beans.FinConstants
import com.netnumeri.server.finance.beans.TradeEnum

public class Trade implements Serializable {

    TradeEnum tradeAction;

    static belongsTo = [portfolio: Portfolio, instrument: Instrument]

    Integer amount = 0;
    Double price = 0.0;
    Double cost = 0;
    Date tradeDate;
    String blog

    public Trade() {
    }

    public Trade(Instrument instrument, TradeEnum tradeAction, int amount, double price, Date tradeDate) {
        if (tradeDate == null) throw new IllegalArgumentException("date cannot be null");
        this.tradeDate = tradeDate;
        this.instrument = instrument;
        this.tradeAction = tradeAction;
        this.amount = amount;
        this.price = price;
        this.cost = 0
    }

    public Trade(Instrument instrument, TradeEnum tradeAction, int amount, double price, Date tradeDate, Double cost) {
        if (tradeDate == null) throw new IllegalArgumentException("date cannot be null");
        this.instrument = instrument;
        this.tradeDate = tradeDate;
        this.tradeAction = tradeAction;
        this.amount = amount;
        this.price = price;
        this.cost = cost;
    }

//    public Trade(Instrument instrument, TradeEnum tradeAction, int amount, double price, Date d, int t, Double cost) {
//        if (d == null) throw new IllegalArgumentException("d cannot be null");
//        if (cost == null) throw new IllegalArgumentException("cost cannot be null");
//        this.date = d;
//        this.instrument = instrument;
//        this.tradeAction = tradeAction;
//        this.amount = amount;
//        this.price = price;
//        this.cost = cost;
   // }

    public Trade(Instrument instrument,
                 TradeEnum tradeAction,
                 int amount,
                 Date tradeDate) {
        if (tradeDate == null) throw new IllegalArgumentException("date cannot be null");
        if (instrument == null) throw new IllegalArgumentException("instrument cannot be null");
        this.instrument = instrument;

        Daily daily = instrument.getDaily(tradeDate);
        if (daily != null && daily.valid()) {
            this.price = daily.price(FinConstants.CLOSE);
        } else {
            System.out.println("Trade. No valid daily data available for " + instrument.getName() + " " + tradeDate.toString());
            this.price = 0;
        }
        this.tradeDate = tradeDate;
        this.tradeAction = tradeAction;
        this.amount = amount;
        this.price = 0;
        this.cost = 0
    }

    public Trade(Instrument instrument, TradeEnum tradeAction, int amount, Date tradeDate, Double cost, FinConstants Option) {
        if (tradeDate == null) throw new IllegalArgumentException("date cannot be null");
        if (cost == null) throw new IllegalArgumentException("cost cannot be null");
        this.instrument = instrument;
        Daily daily = instrument.getDaily(tradeDate);
        this.price = daily.price(Option);
        this.tradeDate = tradeDate;
        this.tradeAction = tradeAction;
        this.amount = amount;
        this.cost = cost;
    }

    public String print() {
        StringBuffer sb = new StringBuffer();
        sb.append(getTradeDate().toString() + ": " + tradeAction.value);
        sb.append(" # " + amount);
        sb.append(" of " + instrument.getName());
        sb.append(" @ " + price);
        return sb.toString();
    }

    public double value() {
        return amount * price;
    }
}
