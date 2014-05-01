package com.netnumeri.server.finance.finpojo

import Jama.Matrix
import com.netnumeri.server.enums.PortfolioTypeEnum
import com.netnumeri.server.finance.beans.FinConstants
import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.beans.TradeEnum
import com.netnumeri.server.finance.data.TransactionSeries
import com.netnumeri.server.finance.finpojo.asset.Asset
import com.netnumeri.server.finance.finpojo.derivative.Derivative
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.YahooUtils

class Portfolio extends Asset implements Serializable {

    static hasMany = [items: PortfolioEntry, trades: Trade]

    static mapping = {
        id generator: 'hilo', params: [table: 'hi_value', column: 'next_value', max_lo: 100]

        trades cascade: 'all-delete-orphan'
        items cascade: 'all-delete-orphan'
    }

    String description

    static transients = [
            "assetsToHold",
            "tempWeights",
            "correlationMatrix",
            "covarianceMatrix"]

    int assetsToHold = 0;
    double wealth = 0;
    double[] tempWeights;
    Matrix covarianceMatrix
    Matrix correlationMatrix
    Date firstDate;
    Date lastDate;
    PortfolioTypeEnum portfolioType

    Portfolio(String name, String description) {
        this.name = name
        this.description = description
    }

    Portfolio(String name, String description, double wealth) {
        this.name = name
        this.wealth = wealth;
        this.description = description
    }

    PortfolioEntry portfolioItemByName(String name) {
        PortfolioEntry item = null;
        if (items != null)
            items.each {
                PortfolioEntry portfolioItem = it
                if (portfolioItem.instrument.name.equalsIgnoreCase(name))
                    item = portfolioItem;
            }
        return item;
    }

    Portfolio clone() {
        Portfolio p = new Portfolio(getName(), "clone");

        items.each { item ->
            p.addToItems(item)
        }

        trades.each { transaction ->
            p.addToTrades(transaction)
        }

        p.assetsToHold = assetsToHold;
        p.wealth = wealth;
        p.tempWeights = tempWeights;
        if (covarianceMatrix != null) p.covarianceMatrix = (Matrix) covarianceMatrix.clone();
        if (correlationMatrix != null) p.correlationMatrix = (Matrix) correlationMatrix.clone();
        p.firstDate = firstDate;
        p.lastDate = lastDate;
        return p;
    }



}
