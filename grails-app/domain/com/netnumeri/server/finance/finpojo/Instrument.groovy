package com.netnumeri.server.finance.finpojo

import com.netnumeri.server.finance.beans.FinConstants
import com.netnumeri.server.finance.beans.GenericTimeSeries
import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.ta.Indicator
import com.netnumeri.server.finance.utils.DateUtils

class Instrument extends Persistable implements Serializable {

    GenericTimeSeries<Daily> dailyarray = new GenericTimeSeries<Daily>();
//    static hasMany = [dailyArray: Daily]

    static mapping = {
        tablePerHierarchy false
    }

    static transients = [
            "indicators",
            "priceSeries",
            "returnSeries",
            "logReturnSeries",
            "highSeries",
            "lowSeries",
            "openSeries",
            "closeSeries",
            "volumeSeries",
            "volumeReturnSeries",
            "priceSeries",
            "volumeLogReturnSeries",
            "lastQuote",
            "marketSpotShift",
            "marketVolatilityShift",
            "dailyarray",
            "delta",
            "spot",
            "volatility",
            "isSpotFixed",
            "isVolatilityFixed",
            "tempToday",
            "tempSpot",
            "tempVolatility",
            "isTempSpotFixed",
            "isTempVolatilityFixed",
            "lowerRangeDate",
            "upperRangeDate"
    ]

    Map<String, Indicator> indicators = new HashMap<>();
    TimeSeries priceSeries = null;
    TimeSeries returnSeries = null;
    TimeSeries logReturnSeries = null;
    TimeSeries highSeries = null;
    TimeSeries lowSeries = null;
    TimeSeries openSeries = null;
    TimeSeries closeSeries = null;
    TimeSeries volumeSeries = null;
    TimeSeries volumeReturnSeries = null;
    TimeSeries volumeLogReturnSeries = null;


    Double lastQuote;
    double marketSpotShift = 1.0;
    double marketVolatilityShift = 1.0;
    def delta = 1D;
    double spot;
    double volatility;
    boolean isSpotFixed;
    boolean isVolatilityFixed = false;
    def tempToday = new Date();
    double tempSpot;
    double tempVolatility;
    def isTempSpotFixed = false
    def isTempVolatilityFixed = false;

    def lowerRangeDate;
    def upperRangeDate;

    public void setRangeBounds(Date lowerDate, Date upperDate) {

        if (lowerRangeDate == null) lowerRangeDate = lowerDate;
        if (upperRangeDate == null) upperRangeDate = upperDate;

        if (lowerDate < this.lowerRangeDate) lowerRangeDate = lowerDate;
        if (upperDate > this.upperRangeDate) upperRangeDate = upperDate;
    }

    public boolean inRange(Date date) {
        boolean b1 = DateUtils.isGreaterEqual(date, lowerRangeDate);
        boolean b2 = DateUtils.isLessEqual(date, upperRangeDate);
        boolean b3 = b1 && b2;
        return b3;
    }

    public Instrument() {
        isSpotFixed = false;
        isVolatilityFixed = false;
        priceSeries = new TimeSeries("PriceSeries");
        returnSeries = new TimeSeries("ReturnSeries");
        logReturnSeries = new TimeSeries("LogReturnSeries");
        highSeries = new TimeSeries("HighSeries");
        lowSeries = new TimeSeries("LowSeries");
        openSeries = new TimeSeries("OpenSeries");
        closeSeries = new TimeSeries("CloseSeries");
        volumeSeries = new TimeSeries("VolumeSeries");
        volumeReturnSeries = new TimeSeries("VolumeReturnSeries");
        volumeLogReturnSeries = new TimeSeries("VolumeLogReturnSeries");
    }

    public double S() {
        return spot();
    }

    public double s() {
        return volatility();
    }

    public double historicalSpot() {
        double ret = 0;
        ret = historicalSpot(new Date());
        return ret;
    }

    public double historicalSpot(Date d) {
        return getPrice(d);
    }

    public double historicalVolatility() {
        return getStandardDeviation(FinConstants.LOGRETURN) * Math.sqrt(365.0);
    }

    /**
     * Return spot premium. In case of derivative instruments usually return spot premium of the underlying instrument
     *
     * @return Return fixed value if spot premium is set with setSpot() call else return last historical spot value
     */
    public double spot() {
        if (isSpotFixed()) {
            return marketSpotShift * getSpot();
        } else {
            return marketSpotShift * historicalSpot();
        }
    }

    /**
     * Return volatility. In case of derivative instruments usually return volatility of the underlying instrument
     * Volatility is calculated as annualized standard deviation of instrument daily log returns
     *
     * @return Return fixed value if volatility is set with setVolatility() call else return historical volatility
     */
    public double volatility() {
        if (isVolatilityFixed()) {
            return marketVolatilityShift * getFixedVolatility();
        } else {
            return marketVolatilityShift * historicalVolatility();
        }
    }

    /**
     * Set spot value
     *
     * @param spot value
     */
    public void setSpot(double spot) {
        this.spot = spot;
        isSpotFixed = true;
    }

    /**
     * Set volatility value
     */
    public void setVolatility(double v) {
        volatility = v;
        isVolatilityFixed = true;
    }

    public void resetSpot() {
        isSpotFixed = false;
    }

    public void resetVolatility() {
        isVolatilityFixed = false;
    }

    public void storeSettings() {
        tempToday = new Date();
        tempSpot = spot;
        tempVolatility = volatility;
        isTempSpotFixed = isSpotFixed;
        isTempVolatilityFixed = isVolatilityFixed;
    }

    public void restoreSettings() {
        DateUtils.setToday(tempToday);
        spot = tempSpot;
        volatility = tempVolatility;
        isSpotFixed = isTempSpotFixed;
        isVolatilityFixed = isTempVolatilityFixed;
    }

    public void addDaily(Daily daily) {
        add(this, daily.dailydate,
                daily.getHigh(), daily.getLow(), daily.getOpenprice(), daily.getCloseprice(), daily.getVolume(),
                daily.getOpenInterest());
        setLowerRangeDate(DateUtils.min(daily.dailydate, getLowerRangeDate()));
        setUpperRangeDate(DateUtils.max(daily.dailydate, getUpperRangeDate()));
    }

    public void addDaily(Date date, double high, double low, double open, double close, int volume, int openInterest) {
        add(this, date, high, low, open, close, volume, openInterest);
        setLowerRangeDate(DateUtils.min(date, getLowerRangeDate()));
        setUpperRangeDate(DateUtils.max(date, getUpperRangeDate()));
    }

    public boolean isDataAvailable(Date date) {
        return dataAvailable(date);
    }


    public Daily getDaily(Date date) {
        return daily(date);
    }

    public double premium() {
        return price(new Date(), FinConstants.TYPICALPRICE);
    }

    public double getPrice(Date date) {
        return getPrice(date, FinConstants.TYPICALPRICE);
    }

    /**
     *  Option TYPICALPRICE, MEDIANPRICE , WEIGHTEDPRICE ,AVERAGEPRICE, LOGAVERAGEPRICE;
     */
    public double getPrice(Date date, FinConstants Option) {
        if (date == null) throw new IllegalArgumentException("date cannot be null");
        return value(date, Option);
    }

    public double getClose(Date date) {
        return dailyarray.get(date).closeprice;
    }

    public double getReturn(Date date) {
        if (date == null) throw new IllegalArgumentException("date cannot be null");
        return re(date);
    }

    public double getLogReturn(Date date) {
        if (date == null) throw new IllegalArgumentException("date cannot be null");
        return logReturn(date);
    }

    public int getVolume(Date date) {
        if (date == null) throw new IllegalArgumentException("date cannot be null");
        return dailyarray.get(date).volume;
    }

    public double value(Date date, FinConstants option) {
        if (dailyarray.get(date) == null)
            return getLast(date)
        switch (option) {
            case FinConstants.HIGH:
                return high(date);
            case FinConstants.LOW:
                return low(date);
            case FinConstants.OPEN:
                return open(date);
            case FinConstants.CLOSE:
                return close(date);
            case FinConstants.VOLUME:
                return volume(date);
            case FinConstants.PRICE:
                return price(date);
            case FinConstants.MEDIANPRICE:
            case FinConstants.WEIGHTEDPRICE:
            case FinConstants.TYPICALPRICE:
                return dailyarray.get(date).price(option);
            case FinConstants.RETURN:
                return getReturn(date);
            case FinConstants.LOGRETURN:
                return getLogReturn(date);
        }
    }

    public double getLast(Date date) {
        if (date == null) throw new IllegalArgumentException("date cannot be null");
        Daily daily = getDaily(date);
        while (daily == null) {
            daily = getPrevDaily(date);
        }
        if (daily != null) {
            return daily.getCloseprice();
        } else {
            return 0;
        }
    }

    public double getLast() {
        Date lastDailyDate = lastDay();
        return getLast(lastDailyDate);
    }

    public TimeSeries priceSeries() {
//        if (priceSeriesChanged)
        priceSeries.clear();
        int firstIndex = getFirstIndex();
        int lastIndex = getLastIndex();

        for (int i = firstIndex; i <= lastIndex; i++) {
            Daily daily = getDaily(i);
            Date date = daily.getDailydate();
            double price = daily.price();
            if (daily != null && price != 0) {
                priceSeries.add(date, price);
            }
            //          priceSeriesChanged = false;
        }
        return priceSeries;
    }

    public TimeSeries series(FinConstants what) {
        return series(what, null, null);
    }

    public TimeSeries series(FinConstants what, Date firstD, Date lastD) {
        if (firstD == null) {
            firstD = firstDate();
        }
        if (lastD == null) {
            lastD = lastDate();
        }
        if (what == FinConstants.HIGH)
            return highSeries(firstD, lastD);
        else if (what == FinConstants.LOW)
            return lowSeries(firstD, lastD);
        else if (what == FinConstants.OPEN)
            return openSeries(firstD, lastD);
        else if (what == FinConstants.CLOSE)
            return closeSeries(firstD, lastD);
        else if (what == FinConstants.VOLUME)
            return volumeSeries(firstD, lastD);
        return null;
    }

    public TimeSeries highSeries() {
        return highSeries(null, null);
    }

    // Return high time series
    public TimeSeries highSeries(Date firstDate, Date lastDate) {
        if (firstDate == null) firstDate = firstDay();
        if (lastDate == null) lastDate = lastDay();
        highSeries = buildHighSeries(firstDate, lastDate);
        //       highSeriesChanged = false;
        return highSeries;
    }


    public TimeSeries lowSeries() {
        return lowSeries(null, null);
    }

    public TimeSeries lowSeries(Date firstDate, Date lastDate) {
        if (firstDate == null) firstDate = firstDay();
        if (lastDate == null) lastDate = lastDay();
        lowSeries = buildLowSeries(firstDate, lastDate);
        return lowSeries;
    }


    public TimeSeries closeSeries() {
        return closeSeries(null, null);
    }

    public TimeSeries closeSeries(Date firstDate, Date lastDate) {
        if (firstDate == null) firstDate = firstDay();
        if (lastDate == null) lastDate = lastDay();
        closeSeries = buildCloseSeries(firstDate, lastDate);
        return closeSeries;
    }

    public TimeSeries openSeries() {
        return openSeries(null, null);
    }

    public TimeSeries openSeries(Date firstDate, Date lastDate) {
        if (firstDate == null) firstDate = firstDay();
        if (lastDate == null) lastDate = lastDay();
        //  if (openSeriesChanged)
        openSeries = buildOpenSeries(firstDate, lastDate);
        //      openSeriesChanged = false;
        return openSeries;
    }

    public TimeSeries volumeSeries() {
        return volumeSeries(null, null);
    }

    public TimeSeries volumeSeries(Date firstDate, Date lastDate) {
        if (firstDate == null) firstDate = firstDay();
        if (lastDate == null) lastDate = lastDay();
        volumeSeries = buildVolumeSeries(firstDate, lastDate);
        return volumeSeries;
    }

    public TimeSeries buildReturnSeries(Date firstDate, Date lastDate) {
        double fLastPrice = 0;
        boolean isFirst = true;
        for (Date treeKey : dailyarray.keySet()) {
            Daily daily = dailyarray.get(treeKey)

            if (isFirst) {
                fLastPrice = daily.closeprice
                returnSeries.add(treeKey, 0);
                isFirst = false
            } else {
                returnSeries.add(treeKey, (daily.closeprice - fLastPrice) / fLastPrice);
                fLastPrice = daily.closeprice;
            }
        }
        return returnSeries;
    }

    public TimeSeries logReturnSeries() {
        double fLastPrice = 0;
        boolean isFirst = true;
        for (Date treeKey : dailyarray.keySet()) {
            Daily daily = dailyarray.get(treeKey)

            if (isFirst) {
                fLastPrice = daily.closeprice
                logReturnSeries.add(treeKey, 0);
                isFirst = false
            } else {
                logReturnSeries.add(treeKey, Math.log((daily.closeprice - fLastPrice) / fLastPrice));
                fLastPrice = daily.closeprice;
            }
        }
        return logReturnSeries;
    }


    public TimeSeries volumeReturnSeries() {

        double value = 0;
        boolean isFirst = true;
        for (Date treeKey : dailyarray.keySet()) {
            Daily daily = dailyarray.get(treeKey)

            if (isFirst) {
                value = daily.volume
                volumeReturnSeries.add(treeKey, 0);
                isFirst = false
            } else {
                volumeReturnSeries.add(treeKey, ((daily.volume - value) / value));
                value = daily.volume;
            }
        }
        return volumeReturnSeries;
    }

    public TimeSeries volumeLogReturnSeries() {

        double value = 0;
        boolean isFirst = true;
        for (Date treeKey : dailyarray.keySet()) {
            Daily daily = dailyarray.get(treeKey)

            if (isFirst) {
                value = daily.volume
                volumeLogReturnSeries.add(treeKey, 0);
                isFirst = false
            } else {
                volumeLogReturnSeries.add(treeKey, Math.log((daily.volume - value) / value));
                value = daily.volume;
            }
        }
        return volumeLogReturnSeries;

    }

    public double expectedReturn() {
        return getExpectedReturn(FinConstants.RETURN);
    }

    public double getExpectedReturn(FinConstants option) {
        double Return = 0;
        switch (option) {
            case FinConstants.RETURN:
                Return = returnSeries().getMean();
                break;

            case FinConstants.LOGRETURN:
                Return = logReturnSeries().getMean();
                break;
        }
        return Return;
    }

    public double variance() {
        return getVariance(FinConstants.RETURN);
    }

    public double getVariance(FinConstants option) {
        double Variance = 0;
        switch (option) {
            case FinConstants.RETURN:
                Variance = returnSeries().getVariance();
                break;
            case FinConstants.LOGRETURN:
                Variance = logReturnSeries().getVariance();
                break;
        }
        return Variance;
    }

    public double standardDeviation() {
        return getStandardDeviation(FinConstants.RETURN);
    }

    public double getStandardDeviation(FinConstants option) {
        return Math.sqrt(getVariance(option));
    }

    public double annualExpectedReturn() {
        return (Math.pow(expectedReturn(), 365) - 1);
    }

    public double annualVariance() {
        return variance() * 365.0;
    }

    public double annualStandardDeviation() {
        return standardDeviation() * Math.sqrt(365.0);
    }

    public double getCovariance(Instrument instrument) {
        return getCovariance(instrument, FinConstants.RETURN);
    }

    public double getCovariance(Instrument instrument, FinConstants option) {
        double Covariance = 0;
        switch (option) {
            case FinConstants.RETURN:
                Covariance = returnSeries().getCovariance(instrument.returnSeries());
                break;
            case FinConstants.LOGRETURN:
                Covariance = logReturnSeries().getCovariance(instrument.logReturnSeries());
                break;
        }
        return Covariance;
    }

    public double getCorrelation(Instrument instrument) {
        return getCorrelation(instrument, FinConstants.RETURN);
    }

    public double getCorrelation(Instrument instrument, int option) {
        double Correlation = 0;
        switch (option) {
            case FinConstants.RETURN:
                Correlation = returnSeries().getCorrelation(instrument.returnSeries());
                break;
            case FinConstants.LOGRETURN:
                Correlation = logReturnSeries().getCorrelation(instrument.logReturnSeries());
                break;
        }
        return Correlation;
    }

    public int getNCorrelationPairs(Instrument instrument) {
        return returnSeries().getNCorrelationPairs(instrument.returnSeries());
    }



    public Date firstDay() {
        return firstDailyDate();
    }

    public Date lastDay() {
        return lastDailyDate();
    }

    public int getNDaily() {
        return length();
    }

    public Date getPrevDate(Date date) {
        return prevDate(date);
    }

    public Date getNextDate(Date date) {
        return nextDate(date);
    }

    public Daily getPrevDaily(Date date) {
        return prevDaily(date);
    }

    public Date firstDate() {
        return firstDailyDate();
    }

    public Date lastDate() {
        return lastDailyDate();
    }

    public Daily daily(Date date) {
        return dailyarray.get(date);
    }

    public boolean dataAvailable(Date date) {
        Daily daily = dailyarray.get(date);
        if (daily == null) return false;
        return true;
    }

    public Date prevDate(Date date) {
        return dailyarray.prevDate(date);
    }

    public Date nextDate(Date date) {
        return dailyarray.nextDate(date);
    }

    public Daily prevDaily(Date date) {
        Date prevDate = prevDate(date);
        if (prevDate == null)
            return null;
        else
            return daily(prevDate);
    }

    public Daily nextDaily(Date date) {
        Date nextDate = nextDate(date);
        if (nextDate == null)
            return null;
        else
            return daily(nextDate);
    }

    public double calculateReturn(Date date) {
        if (date == firstDate()) return 1;
        if (date == null) date = lastDate();
        Daily daily = daily(date);
        double Price = daily.price();
        Daily prevDaily = this.prevDaily(date);
        if (prevDaily != null)
            return Price / prevDaily.price();
        else
            return 1;
    }

    public double logReturn() {
        return logReturn(null);
    }

    public double logReturn(Date date) {
        return Math.log(calculateReturn(date));
    }

    public double re(Date date) {
        return calculateReturn(date);
    }

    public double price(Date date) {
        return price(date, FinConstants.TYPICALPRICE);
    }

    public double price(Date date, FinConstants Option) {
        return value(date, Option)
    }

    public double low(Date date) {
        return dailyarray.get(date).low;
    }

    public double high(Date date) {
        return dailyarray.get(date).high;
    }

    public double open(Date date) {
        return dailyarray.get(date).openprice;
    }

    public double close(Date date) {
        return dailyarray.get(date).closeprice;
    }

    public int volume(Date date) {
        return dailyarray.get(date).volume;
    }

    public int openInterest(Date date) {
        return dailyarray.get(date).openInterest;
    }

    public TimeSeries timeSeries(FinConstants What, Date firstDate, Date lastDate) {
        TimeSeries series = new TimeSeries();

        Date firstDailyDate = firstDailyDate();
        println "firstDailyDate = $firstDailyDate"

        Date lastDailyDate = lastDailyDate();
        println "lastDailyDate = $lastDailyDate"

        if (firstDate == null) firstDate = firstDailyDate;
        if (lastDate == null) lastDate = lastDailyDate;

        if (DateUtils.isLess(firstDate, firstDailyDate)) firstDate = firstDailyDate;
        if (DateUtils.isGreater(lastDate, lastDailyDate)) lastDate = lastDailyDate;
        double value;

        for (Date date = firstDate; DateUtils.isLessEqual(date, lastDate); date = DateUtils.addDays(date, 1)) {
            Daily daily = daily(date);
            if ((daily != null)) {
                value = daily.price(What);
                if (value != 0) {
                    series.add(daily.dailydate, value);
                }
            }
        }
        return series;
    }

    public TimeSeries buildHighSeries(Date firstDate, Date lastDate) {
        if (firstDate == null) firstDate = firstDailyDate();
        if (lastDate == null) lastDate = lastDay();
        return timeSeries(FinConstants.HIGH, firstDate, lastDate);
    }

    public TimeSeries buildLowSeries(Date firstDate, Date lastDate) {
        if (firstDate == null) firstDate = firstDailyDate();
        if (lastDate == null) lastDate = lastDay();
        return timeSeries(FinConstants.LOW, firstDate, lastDate);
    }

    public TimeSeries buildOpenSeries(Date firstDate, Date lastDate) {
        if (firstDate == null) firstDate = firstDailyDate();
        if (lastDate == null) lastDate = lastDay();
        return timeSeries(FinConstants.OPEN, firstDate, lastDate);
    }

    public TimeSeries buildCloseSeries(Date firstDate, Date lastDate) {
        if (firstDate == null) firstDate = firstDailyDate();
        if (lastDate == null) lastDate = lastDay();
        return timeSeries(FinConstants.CLOSE, firstDate, lastDate);
    }

    public TimeSeries buildVolumeSeries(Date firstDate, Date lastDate) {
        return timeSeries(FinConstants.VOLUME, firstDate, lastDate);
    }

    public TimeSeries buildHighSeries() {
        return timeSeries(FinConstants.HIGH, null, null);
    }

    public TimeSeries buildLowSeries() {
        return timeSeries(FinConstants.LOW, null, null);
    }

    public TimeSeries buildOpenSeries() {
        return timeSeries(FinConstants.OPEN, null, null);
    }

    public TimeSeries buildCloseSeries() {
        return timeSeries(FinConstants.CLOSE, null, null);
    }

    public TimeSeries buildLogAverageSeries() {
        return timeSeries(FinConstants.LOGAVERAGEPRICE, null, null);
    }

    public TimeSeries buildVolumeSeries() {
        return timeSeries(FinConstants.VOLUME, null, null);
    }

    public boolean dailyData(Date date) {
        if (dailyarray == null) {
            return false;
        }
        if (date == null) {
            return dailyarray.size() != 0;
        }
        return dataAvailable(date);
    }

    public int length() {
        return dailyarray.size();
    }

    public Date firstDailyDate() {
        dailyarray.firstDate()

        if (dailyarray == null || dailyarray.isEmpty()) {
            return null
        }
        Daily daily = (Daily) dailyarray.firstValue();
        if (daily != null)
            return daily.getDailydate();
        else
            return null;
    }

    public Date lastDailyDate() {
        if (dailyarray == null || dailyarray.isEmpty()) {
            return null
        }
        Daily daily = (Daily) dailyarray.lastValue();
        if (daily != null)
            return daily.getDailydate();
        else
            return null;

//        return dailyarray.lastDate();
    }

//    public void add(Daily daily) {
//        dailyarray.put(DateUtils.toKey(daily.dailydate), daily);
//    }

    public void add(Instrument instrument,
                    Date date,
                    double high,
                    double low,
                    double open,
                    double close,
                    int volume,
                    int openInterest) {
        Daily daily = new Daily(instrument, date, high, low, open, close, volume, openInterest);
        daily.save(flush: true)
//        add(daily);
    }
}
