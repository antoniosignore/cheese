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

//    void clear() {
//        this.items.clear();
//        this.trades.clear();
//    }
//
//    boolean isEmpty() {
//        if (this.items.size() == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public Date firstDay() {
//        if (this.firstDate != null) {
//            return this.firstDate;
//        }
//        Instrument instrument
//        this.items.each {
//            instrument = it.instrument
//            if (instrument instanceof Asset) {
//                if (instrument.firstDay() != null) {
//                    this.firstDate =
//                            DateUtils.max(this.firstDate, instrument.firstDay());
//                }
//            }
//        }
//        return this.firstDate;
//    }
//
//    public Date latestDay() {
//        Instrument instrument;
//        if (this.lastDate != null) {
//            return this.lastDate;
//        }
//
//        this.items.each {
//            instrument = it.instrument
//            if (instrument.lastDay() != null) {
//                this.lastDate = DateUtils.min(this.lastDate,
//                        instrument.lastDay());
//            }
//        }
//        return this.lastDate;
//    }
//
//    public void add(PortfolioEntry item) {
//
//        if (entry(item.instrument) != null) {
//            System.out.println("addEntry. Instrument: " + item.instrument.name + " already exists in portfolio " + name());
//            return;
//        }
//
//        if (item.instrument instanceof Asset)
//            this.setRangeBounds(item.instrument.lowerRangeDate(), item.instrument.upperRangeDate());
//
//        this.addToItems(item);
//    }
//
//
//    public void add( Instrument instrument) {
//        if (instrument == null) throw new IllegalArgumentException("instrument cannot be null");
//        add(instrument, 0);
//    }
//
//    public void add(Instrument instrument, int Amount) {
//        PortfolioEntry item = new PortfolioEntry(instrument, Amount, this);
//
//        add(item);
//    }
//
//    public void add(Trade transaction) {
//
//        if (transaction == null) throw new IllegalArgumentException("trades cannot be null");
//
//        if (transaction.portfolio.id) transaction.save(flush: true)
//
//        Instrument instrument = transaction.instrument;
//        PortfolioEntry entry = entry(instrument);
//
//        if (entry == null) {
//            entry = new PortfolioEntry(instrument, this);
//            if (transaction.tradeAction == TradeEnum.BUY) {
//                entry.setAmount(transaction.amount);
//            } else if (transaction.tradeAction == TradeEnum.SELL) {
//                System.out.println("addTransaction. No long position on sell for " + transaction.instrument.name + " in " + this.getName());
//                return;
//            } else if (transaction.tradeAction == TradeEnum.SELLSHORT) {
//                entry.setAmount(-transaction.getAmount());
//            } else if (transaction.tradeAction == TradeEnum.BUYSHORT) {
//                System.out.println("addTransaction. No short position on buy short for " + transaction.instrument.name + " in " + this.getName());
//                return;
//            }
//            transaction.portfolio.addToTrades(transaction);
//            add(entry);
//        } else {
//            int amount = 0;
//            if (transaction.tradeAction == TradeEnum.BUY) {
//                if (entry.amount < 0) {
//                    System.out.println("addTransaction. Short position on buy for " + transaction.instrument.name + " in " + this.getName());
//                    return;
//                }
//                amount = entry.amount + transaction.getAmount();
//            } else if (transaction.tradeAction == TradeEnum.SELL) {
//                amount = entry.amount- transaction.getAmount();
//                if (amount < 0) {
//                    System.out.println("addTransaction. Sell amount larger than long position for" + transaction.instrument.name + " in " + this.getName());
//                    return;
//                }
//            } else if (transaction.tradeAction == TradeEnum.SELLSHORT) {
//                if (entry.amount > 0) {
//                    System.out.println("addTransaction. Long position in instrument on sell short: " + this.getName());
//                    return;
//                }
//                amount = entry.amount - transaction.getAmount();
//            } else if (transaction.tradeAction == TradeEnum.BUYSHORT) {
//                if (entry.amount > 0) {
//                    System.out.println("addTransaction. Long position on buy short for " + transaction.instrument.name + " in " + this.getName());
//                    return;
//                }
//                amount = entry.amount + transaction.getAmount();
//                if (amount > 0) {
//                    System.out.println("addTransaction. Buy short amount larger than short position: " + this.getName());
//                    return;
//                }
//            }
//            addToTrades(transaction);
//
//            if (amount == 0) {
//                remove(instrument);
//            } else {
//                entry.setAmount(amount);
//            }
//        }
//    }
//
//    // add series of trade transactions
//    public void add( TransactionSeries series) {
//        if (series == null) throw new IllegalArgumentException("series cannot be null");
//        int N = series.getN();
//        for (int i = 0; i < N; i++) {
//            add(series.getTransaction(i));
//        }
//    }
//
//    // Return pointer to portfolio entry holding instrument
//    // Return null if there is no such entry in portfolio
//    public PortfolioEntry entry( Instrument instrument) {
//        if (instrument == null) throw new IllegalArgumentException("instrument cannot be null");
//        PortfolioEntry entry;
//        if (this.items != null)
//
//            this.items.each {
//                entry = it
//                if (entry.instrument.id == instrument.id) {
//                    return entry;
//                }
//            }
//
//        return null;
//    }
//
//    public PortfolioEntry entryByName( String name) {
//        PortfolioEntry entry;
//
//        this.items.each {
//            entry = it
//            if (entry.instrument.getName().compareToIgnoreCase(name) >= 0) {
//                return entry;
//            }
//        }
//
////        for (int i = 0; i < this.items.size(); i++) {
////            entry = item(portfolio, i);
////        }
//        return null;
//    }
//
//    public void invest( double wealth) {
//        invest(wealth, null);
//    }
//
//    // Invest wealth into portfolio according to current portfolio weights  todo
//    public void invest( double wealth, Date date) {
//
//        if (this.items == null || this.items.isEmpty())
//            throw new RuntimeException("no instruments to invest money into");
//
//        this.items.eachWithIndex {it, i ->
//            Instrument asset = it.instrument
//            double price = 0;
//            if (asset.isDataAvailable(date)) {
//                price = asset.getLast();
//            } else {
//                price = YahooUtils.getLastTradedValue(asset.name)
//            }
//            setAmount(it, (int) (getItemAmount(it) + wealth * weight(asset) / price));
//        }
//    }
//
//    public Trade buy( Instrument instrument, int amount) {
//        return buy(instrument, amount, null);
//    }
//
//    public Trade buy( Instrument instrument, int amount, Date date) {
//        if (date == null) date = new Date();
//        Trade transaction = new Trade(instrument, TradeEnum.BUY, amount, instrument.getPrice(date), date);
//        add(transaction);
//        return transaction;
//    }
//
//    public Trade sell( Instrument instrument, int amount) {
//        return sell(instrument, amount, new Date());
//    }
//
//    public Trade sell( Instrument instrument, int amount, Date date) {
//        if (date == null) date = new Date();
//        Trade transaction = new Trade(instrument, TradeEnum.SELL, amount, instrument.getPrice(date), date);
//        add(transaction);
//        return transaction;
//    }
//
//    public Trade sellShort( Instrument instrument, int amount) {
//        return sellShort(instrument, amount, null);
//    }
//
//    public Trade sellShort( Instrument instrument, int Amount, Date date) {
//        if (date == null) date = new Date();
//        Trade transaction = new Trade(instrument, TradeEnum.SELLSHORT, Amount, instrument.getPrice(date), date);
//        add(transaction);
//        return transaction;
//    }
//
//    public Trade buyShort( Instrument instrument, int Amount) {
//        return buyShort(instrument, Amount, new Date());
//    }
//
//    // Buy short
//    public Trade buyShort( Instrument instrument, int Amount, Date date) {
//        if (date == null) date = new Date();
//        Trade transaction = new Trade(instrument, TradeEnum.BUYSHORT, Amount, instrument.getPrice(date), date);
//        add(transaction);
//        return transaction;
//    }
//
//    public Trade sell( Instrument instrument) {
//        return sell(instrument, new Date());
//    }
//
//    // Sell everything - todo
//    public Trade sell( Instrument instrument, Date date) {
//        int amount;
//        PortfolioEntry entry = entry(instrument)
//        if (entry != null) {
//            amount = entry.amount
//        } else {
//            return null;
//        }
//        if (date == null) date = new Date();
//        Trade transaction = new Trade(instrument, TradeEnum.SELL, amount, instrument.getPrice(date), date);
//        add(transaction);
//        return transaction;
//    }
//
//    // delete instrument from portfolio
//    public void remove( Instrument instrument) {
//
//        this.items.each {
//            PortfolioEntry entry = it
//            if (entry.instrument == null) throw new RuntimeException("entry cannot have null name");
//            if (entry.instrument.id == instrument.id) {
//                this.items.remove(entry);
////                normalizeWeights(portfolio);
//            }
//        }
//    }
//
//    // Return weight of this instrument in the portfolio
//    // Return 0 if instrument is not in the portfolio
//    public double weight( Instrument instrument) {
//        PortfolioEntry entry = entry(instrument);
//        if (entry != null) {
//            return entry.amount;
//        } else {
//            return 0;
//        }
//    }
//
//    // Return position of this instrument in the portfolio
//    // Return 0 if instrument is not in the portfolio
//    public int position( Instrument instrument) {
//        PortfolioEntry entry = entry(instrument);
//        if (entry != null) {
//            return entry.position()
//        } else {
//            return 0;
//        }
//    }
//
//    // Return amount of this instrument in the portfolio
//    // Return 0 if instrument is not in the portfolio
//    public int amount( Instrument instrument) {
//        PortfolioEntry entry = entry(instrument);
//        if (entry != null) {
//            return entry.getAmount();
//        } else {
//            return 0;
//        }
//    }
//
//    public double amount() {
//        // Return amount of all items in portfolio
//        int Amount = 0;
//
//        this.items.each {
//            Amount += it.amount
//        }
//
//        return Amount;
//    }
//
////    public double wealth( int i) {
////        return wealth(portfolio, i, null);
////    }
//
//    // Return wealth for i-th asset in portfolio
//    public double wealth( Instrument asset, Date date) {
////        Instrument asset = getInstrument(portfolio, i);
//        double price = 0;
//        if (asset.isDataAvailable(date)) {
//            price = asset.premium();
//        } else {
//            price = YahooUtils.getLastTradedValue(asset.name)
//        }
//        return price * entryByName(asset.name).amount;
//    }
//
//
//    public double getWealth() {
//        return getWealth(null);
//    }
//
//    // Return wealth of portfolio
//    public double getWealth( Date date) {
//        double Wealth = 0;
//
//        this.items.each {
//            Wealth += wealth(it.instrument, date);
//
//        }
//
//        return Wealth;
//    }
//
//    // Normalize weigts of all stock in portfolio to keep
//    // weight sum equal to unity and satisfy boundary conditions
//    // Note that we exclude stock with zero weights from the portfolio,
//    // meaning that such stock will have zero weight after normalization
////    public void normalizeWeights() {
////        double WeightSum = 0;
////        int i = 0;
////        for (i = 0; i < this.items.size(); i++) {
////            WeightSum += getWeight(portfolio, i);
////        }
////        for (i = 0; i < this.items.size(); i++) {
////            setWeight(portfolio, i, getWeight(portfolio, i) / WeightSum);
////        }
////        WeightSum = 1;
////        boolean InBounds = true;
////        for (i = 0; i < this.items.size(); i++) {
////            if (getWeight(portfolio, i) != 0) {
////                if (getWeight(portfolio, i) < lowerBound(portfolio, i)) {
////                    InBounds = false;
////                    break;
////                }
////            }
////        }
////        if (!InBounds) {
////            double LowerBoundSum = 0;
////            for (i = 0; i < this.items.size(); i++) {
////                if (getWeight(portfolio, i) != 0) {
////                    LowerBoundSum += lowerBound(portfolio, i);
////                }
////            }
////            for (i = 0; i < this.items.size(); i++) {
////                if (getWeight(portfolio, i) != 0) {
////                    setWeight(portfolio, i, lowerBound(portfolio, i) + getWeight(portfolio, i) * (1 - LowerBoundSum) / WeightSum);
////                }
////            }
////        }
////    }
//
////    public void normalize( int Option) {
////        if (Option == FinConstants.kFixedWeight) {
////            normalizeWeights(portfolio);
////        } else {
////            double Wealth = getWealth(portfolio);
////            for (int i = 0; i < this.items.size(); i++) {
////                setWeight(portfolio, i, wealth(portfolio, i) / Wealth);
////            }
////        }
////    }
//
////    // Check boundary conditions. Return true if feasible
////    public boolean checkBounds() {
////        double lowsum = 0;
////        double upsum = 0;
////        for (int i = 0; i < this.items.size(); i++) {
////            lowsum += lowerBound(portfolio, i);
////            upsum += upperBound(portfolio, i);
////            if (lowerBound(portfolio, i) >= upperBound(portfolio, i)) {
////                System.out.println("CheckBounds LowerBound >= UpperBound for parameter " + i);
////                return false;
////            }
////        }
////        if (lowsum >= 1) {
////            System.out.println("CheckBounds LowerBoundSum >= 1");
////            return false;
////        }
////        if (upsum <= 1) {
////            System.out.println("CheckBounds UpperBoundSum <= 1");
////            return false;
////        }
////        return true;
////    }
//
//    // Calculate models premium of portfolio
//
//    public double getModelPrice( String Model, String printMode) {
//        double price = 0;
//        this.items.each {
//            price += it.instrument.premium() * it.amount * it.position();
//        }
//        return price;
//    }
//
////    // Return marked to market portfolio premium
////    // If we consider a portfolio as one
////    // financial instrument, its premium is
////    // equal to its value
////    public double price( int Entry) {
////        return m2m(Entry);
////    }
//
//    // Return marked to market portfolio premium If we consider a portfolio as one
//    // financial instrument, its premium is equal to its value
//    public double price( Date date) {
//        return m2m(date);
//    }
//
//    public double price() {
//        return m2m(new Date());
//    }
//
//    // Return portfolio premium If we consider a portfolio as one
//    // financial instrument, its premium is equal to its value
//    public double premium() {
//        return m2m();
//    }
//
//    // Return marked to market portfolio value
////    public double m2m( int index) {
////        Instrument instrument;
////        Daily daily;
////        int amount;
////        double value = 0;
////        this.items.each {
////            amount = it.amount
////            instrument = it.instrument
////            daily = instrument.getDaily();
////            if (!daily.valid()) {
////                daily = instrument.getPrevDaily(index);
////            }
////            if (daily != null) {
////                value += daily.getCloseprice() * amount;
////            } else {
////                System.out.println("getName. Out of data range :" + index);
////                return 0;
////            }
////        }
////        return value;
////    }
//
//    /**
//     * Mark 2 Market portfolio value
//     *
//     * @param date
//     */
//    public double m2m( Date date) {
//        if (date == null) {
//            throw new IllegalArgumentException("date cannot be null");
//        }
//        Instrument instrument;
//        Daily daily;
//        int amount;
//        double value = 0;
//        this.items.each {
//            amount = it.amount
//            instrument = it.instrument
//            if (instrument instanceof Asset) {
//                daily = instrument.getDaily(date);
//                if (daily == null) {
//                    daily = instrument.getPrevDaily(date);
//                }
//                if (daily != null) {
//                    value += daily.closeprice * amount;
//                } else {
//                    throw new IllegalArgumentException("date "+ date.toString()+ "not valid");
//                }
//            }
//            if (instrument instanceof Derivative) {
//                value += instrument.premium() * amount;
//            }
//        }
//        return value;
//    }
//
//    // Return portfolio value
//    public double m2m() {
//        double Value = 0;
//        this.items.each {
//            Value += it.value()
//        }
//        return Value;
//    }
//
//    public double getReturn( Date date) {
//        double price = price(date);
//        double previousPrice;
//        if (price == 0) {
//            return 1;
//        }
//        Date previousDate = getInstrument(portfolio, 0).prevDate(date);
//        if (previousDate == null) {
//            return 1;
//        } else {
//            previousPrice = price(portfolio, previousDate);
//            if (previousPrice == 0) {
//                return 1;
//            } else {
//                return price / previousPrice;
//            }
//        }
//    }
//
//    public double getLogReturn( Date date) {
//        return Math.log(getReturn(portfolio, date));
//    }
//
//    public TimeSeries logReturnSeries() {
//        TimeSeries logReturnSeries = new TimeSeries();
//        logReturnSeries.setOption(FinConstants.LOGRETURN);
//        Date firstDate = getInstrument(portfolio, 0).firstDate();
//        Date lastDate = getInstrument(portfolio, 0).lastDate();
//        for (Date date = firstDate;
//             DateUtils.isLessEqual(date, lastDate);
//             date = DateUtils.nextDay(date)) {
//            logReturnSeries.add(date, getLogReturn(portfolio, date));
//        }
//        return logReturnSeries;
//    }
//
//    public double minReturn() {
//        // Return min return
//        double MinReturn = getInstrument(portfolio, 0).expectedReturn();
//        for (int i = 0; i < this.items.size(); i++) {
//            if (getInstrument(portfolio, i).expectedReturn() < MinReturn) {
//                MinReturn = getInstrument(portfolio, i).expectedReturn();
//            }
//        }
//
//        return MinReturn;
//    }
//
//    public double maxReturn() {
//        // Return max return
//        double MaxReturn = getInstrument(portfolio, 0).expectedReturn();
//        for (int i = 0; i < this.items.size(); i++) {
//            if (getInstrument(portfolio, i).expectedReturn() > MaxReturn) {
//                MaxReturn = getInstrument(portfolio, i).expectedReturn();
//            }
//        }
//
//        return MaxReturn;
//    }
//
//    public double minVariance() {
//        // Return min variance
//        double MinVariance = getInstrument(portfolio, 0).getVariance(FinConstants.LOGRETURN);
//        for (int i = 0; i < this.items.size(); i++) {
//            if (getInstrument(portfolio, i).getVariance(FinConstants.LOGRETURN) < MinVariance) {
//                MinVariance = getInstrument(portfolio, i).getVariance(FinConstants.LOGRETURN);
//            }
//        }
//        return MinVariance;
//    }
//
//    public double maxVariance() {
//        // Return max variance
//        double MaxVariance = getInstrument(portfolio, 0).getVariance(FinConstants.LOGRETURN);
//        for (int i = 0; i < this.items.size(); i++) {
//            if (getInstrument(portfolio, i).getVariance(FinConstants.LOGRETURN) > MaxVariance) {
//                MaxVariance = getInstrument(portfolio, i).getVariance(FinConstants.LOGRETURN);
//            }
//        }
//        return MaxVariance;
//    }
//
//    public double expectedReturn() {
//        // Calculate portfolio expected return
//        double expectedReturn = 0;
//        double weight = 0;
//        this.items.each {
//            weight = it.amount
//            if (weight != 0) {
//                expectedReturn += it.instrument.expectedReturn() * weight;
//            }
//        }
//        return expectedReturn;
//    }
//
//    public void setNHoldAsset( int NHoldAsset) {
//        this.assetsToHold = NHoldAsset;
//    }
//
//    public void setInstrument( PortfolioEntry entry, Instrument instrument) {
//        entry.setInstrument(instrument);
//    }
//
//    public void setAmount( PortfolioEntry entry, int amount) {
//        entry.setAmount(amount);
//    }
//
//
//    public void setWealth( double Wealth) {
//        this.wealth = Wealth;
//    }
//
//    public double variance() {
//        // Calculate portfolio variance
//        Matrix matrix = covarianceMatrix(this);
//        double Variance = 0;
//        double Weight1 = 0;
//        double Weight2 = 0;
//
//        int i1 = 0
//        int i2 = 0
//
//        this.items.each {
//            Weight1 = it.amount
//            if (Weight1 != 0) {
//                this.items.each { item ->
//                    Weight2 = item.amount
//                    if (Weight2 != 0) {
//                        Variance += matrix.get(i1, i2) * Weight1 * Weight2;
//                    }
//                    i2++
//                }
//            }
//            i1++
//        }
//        return Variance;
//    }
//
//    // Calculate portfolio standard deviation
//
//    public double standardDeviation() {
//        return Math.sqrt(variance());
//    }
//
//    // Return annual expected return
//
//    public double annualExpectedReturn() {
//        return (Math.pow(expectedReturn(), 365) - 1);
//    }
//
//    public double annualVariance() {
//        // Calculate annual variance
//        return variance() * 365.0;
//    }
//
//    public double annualStandardDeviation() {
//        return standardDeviation() * Math.sqrt(365.0);
//    }
//
//    // Calculate CAPM beta with Benchmark representing market portfolio
//    public double beta( Portfolio index) {
//        double Beta = 0;
//        this.items.each {
//            Portfolio p = (Portfolio) it.instrument
//            double beta = beta(index);
//            Beta += beta * weight(it.instrument);
//        }
//        return Beta;
//    }
//
//    // Claculate CAPM expected return excess with Benchmark representing market portfolio
//    public double excess( Portfolio index, double InterestRate) {
//        return InterestRate + getBeta( index) * (index.annualExpectedReturn() - InterestRate);
//    }
//
//    public double sharpeIndex( double rate) {
//        return (annualExpectedReturn() - rate) / annualStandardDeviation();
//    }
//
//    public double treynorIndex( Portfolio index, double rate) {
//        return (annualExpectedReturn() - rate) / getBeta(index);
//    }
//
//
//    public double delta() {
//        this.items.each {
//            this.delta += it.instrument.getDelta() * it.amount;
//        }
//        return this.delta;
//    }
//
//    /**
//     * Calculate CAPM beta with Benchmark representing market portfolio
//     */
//    public double beta( Asset index) {
//        return getCovariance(index) / index.variance();
//    }
//
//    private double modelPrice() {
//        return 0;
//    }
//
//    public Matrix covarianceMatrix() {
//        this.covarianceMatrix = new Matrix(this.items.size(), this.items.size());
//
//        int i1 = 0
//        int i2 = 0
//        this.items.each { it1 ->
//            this.items.each { it2 ->
//                this.covarianceMatrix.set(i1, i2, it1.instrument.getCovariance(it2.instrument, FinConstants.LOGRETURN));
//                this.covarianceMatrix.set(i2, i1, this.covarianceMatrix.get(i1, i2));
//                i2++
//            }
//            i1++
//        }
//
////        for (int i1 = 0; i1 < this.items.size(); i1++) {
////            for (int i2 = i1; i2 < this.items.size(); i2++) {
////                this.covarianceMatrix.set(i1, i2, getInstrument(portfolio, i1).getCovariance(getInstrument(portfolio, i2), FinConstants.LOGRETURN));
////                this.covarianceMatrix.set(i2, i1, this.covarianceMatrix.get(i1, i2));
////            }
////        }
//        return this.covarianceMatrix;
//    }
//
//    // Build correlation matrix
//    public Matrix correlationMatrix() {
//        this.correlationMatrix = new Matrix(this.items.size(), this.items.size());
//        this.covarianceMatrix = covarianceMatrix();
//
//        int i1 = 0
//        int i2 = 0
//        this.items.each { it1 ->
//            this.items.each { it2 ->
//                this.correlationMatrix.set(i1, i2, this.covarianceMatrix.get(i1, i2) /
//                        (it1.instrument.getStandardDeviation(FinConstants.LOGRETURN) *
//                                it2.instrument.getStandardDeviation(FinConstants.LOGRETURN)));
//                this.correlationMatrix.set(i2, i1, this.correlationMatrix.get(i1, i2));
//                i2++
//            }
//            i1++
//        }
////        for (int i1 = 0; i1 < this.items.size(); i1++) {
////            for (int i2 = i1; i2 < this.items.size(); i2++) {
////                this.correlationMatrix.set(i1, i2, this.covarianceMatrix.get(i1, i2) /
////                        (getInstrument(portfolio, i1).getStandardDeviation(FinConstants.LOGRETURN) *
////                                getInstrument(portfolio, i2).getStandardDeviation(FinConstants.LOGRETURN)));
////                this.correlationMatrix.set(i2, i1, this.correlationMatrix.get(i1, i2));
////            }
////        }
//        return this.correlationMatrix;
//    }
//
//    public void onNewTrade() {
//        System.out.println("onNewTrade");
//        System.out.println("Price: " + premium());
//    }
//
//    public int nTransactions() {
//        return this.trades.size();
//    }
//
////    public Trade getTransaction( int i) {
////        return this.trades.get(i);
////    }
//
////    public PortfolioItem item( int i) {
////        return this.items.get(i);
////    }
//
//    public int nentries() {
//        return this.items.size();
//    }
//
//    public int nHoldAsset() {
//        return this.assetsToHold;
//    }
//
////    public Instrument getInstrument( int i) {
////        return this.items.get(i).instrument
////    }
////
////    public FinConstants getPosition( int i) {
////        return item(portfolio, i).position();
////    }
////
//    public int getItemAmount(PortfolioEntry item) {
//        return item.amount;
//    }
////
////    public double getModelPrice( int i) {
////        return item(portfolio, i).price()
////    }
//
//    public double getCovariance( int Row, int Col) {
//        return this.covarianceMatrix.get(Row, Col);
//    }
//
//    public List<PortfolioEntry> getInstruments() {
//        return this.items;
//    }
//
//    public Matrix toMatrixLogReturns() {
//        int dimension = getInstruments().size();
//        Matrix ret = null;
//        List entries = getInstruments();
//        for (int i = 0; i < entries.size(); i++) {
//            PortfolioEntry item = (PortfolioEntry) entries.get(i);
//            Instrument instrument = item.getInstrument();
//            double[] series = instrument.logReturnSeries().convertToArray();
//            if (ret == null) {
//                ret = new Matrix(dimension, series.length);
//            }
//            for (int x = 0; x < series.length; x++) {
//                double v = series[x];
//                ret.set(i, x, v);
//            }
//        }
//        return ret;
//    }
//
//    public Matrix toMatrixReturns() {
//        int dimension = getInstruments().size();
//        Matrix ret = null;
//        List entries = getInstruments();
//        for (int i = 0; i < entries.size(); i++) {
//            PortfolioEntry item = (PortfolioEntry) entries.get(i);
//            Instrument instrument = item.getInstrument();
//            double[] serie = instrument.returnSeries().convertToArray();
//            if (ret == null) {
//                ret = new Matrix(dimension, serie.length);
//            }
//            for (int x = 0; x < serie.length; x++) {
//                double v = serie[x];
//                ret.set(i, x, v);
//            }
//        }
//        return ret;
//    }

}
