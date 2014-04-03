package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.finpojo.Instrument
import com.netnumeri.server.finance.ssa.SSAItem
import com.netnumeri.server.finance.ssa.SSAStudy
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.YahooUtils
import com.netnumeri.server.utils.StockUtils
import junit.framework.TestCase
import org.apache.commons.io.FileUtils
import org.junit.Ignore
import org.junit.Test

import java.text.ParseException

public class IndicatorsTest extends TestCase {

    String dir = "/home/antonio/timeplot/"
    Instrument stock
    TimeSeries closes

    @Test
    public void setUp() throws IOException, ParseException {

        Date da = DateUtils.Date("11/1/2009");
        Date a = DateUtils.today();

        stock = YahooUtils.downloadYahooData("AAPL", "", da, a);

        closes = stock.buildCloseSeries();
//        stock.indicators.put("SMA-" + 50, new SMAIndicator(closes, "SMA-" + 50, 50, -1, -1, -1, -1))

        FileUtils.writeStringToFile(new File(dir + "stock.txt"), closes.getTimeplotSeries())
        FileUtils.writeStringToFile(new File(dir + "stock.raw"), closes.getNoDateSeries())

    }

    @Test
    public void testSSAIndicators() throws IOException, ParseException {

        def components = [0]
        Indicator ssa0 = new SSAComponentsIndicator(closes, "SSA-0", 50, components);
        stock.indicators.put(ssa0.name, ssa0)

        components = [1]
        Indicator ssa1 = new SSAComponentsIndicator(closes, "SSA-1", 50, components);
        stock.indicators.put(ssa1.name, ssa1)

        components = [0, 1]
        Indicator ssa01 = new SSAComponentsIndicator(closes, "SSA-01", 50, components);
        stock.indicators.put(ssa01.name, ssa01)

//        //components = [0,1]
//        Indicator ssa1Predict = new SSASeriesPredictionIndicator(closes, "SSA-1-predict", 50, 6, 128);
//        stock.indicators.put(ssa1Predict.name, ssa1Predict)
//
//        components = [2]
//        Indicator ssa2 = new SSAComponentsIndicator(closes, "SSA-2", 50, components);
//        stock.indicators.put(ssa2.name, ssa2)
//
//        components = [3]
//        Indicator ssa3 = new SSAComponentsIndicator(closes, "SSA-3", 50, components);
//        stock.indicators.put(ssa3.name, ssa3)
//
//        components = [0, 3]
//        Indicator ssa03 = new SSAComponentsIndicator(closes, "SSA-03", 50, components);
//        stock.indicators.put(ssa03.name, ssa03)
//
//        components = [0,1,2,3]
//        Indicator ssaPredict = new SSAPredictionIndicator(closes, "SSAStrategy-predict", 50, components, 64);
//        stock.indicators.put(ssaPredict.name, ssaPredict)

//        StockUtils.printTimeplotIndicatorOnFile(stock, dir)
//        StockUtils.printRawIndicatorOnFile(stock, dir)

//        double[] prediction = SSAMath.computeForecast(closes.convertToArray(), 64);
//        double[] predictedserie = Util.concatenateSeries(closes, prediction);
//        println "prediction = $prediction"
//        StockUtils.printArrayOnFile(prediction, "/home/antonio/timeplot/prediction.txt")

    }

    @Test
    public void testIndicators() throws IOException, ParseException {

        stock.indicators.put("SMA-" + 50, new SMAIndicator(closes, "SMA-" + 50, 50))
        stock.indicators.put("SMA-" + 10, new SMAIndicator(closes, "SMA-" + 10, 10))
        stock.indicators.put("BBU", new BollingerBandUpIndicator(closes, "BBU", 20, 2));
        stock.indicators.put("BBL", new BollingerBandLowerIndicator(closes, "BBL", 20, 2));
        stock.indicators.put("RelativeStrengthIndex2", new RSIIndicator(closes, "RelativeStrengthIndex2", 14));

//        stock.indicators.put("MOM", new Indicator(closes, "MOM", 10, -1, -1, -1, -1));
//        stock.indicators.put("SMV", new Indicator(closes, "SMV", 10, -1, -1, -1, -1));
//        stock.indicators.put("SMD", new Indicator(closes, "SMD", 10, -1, -1, -1, -1));

//        System.out.println("last valid data" + bbup.lastValidData());
//
        Indicator pcup = new PriceChannelUpIndicator(closes, "PCU", 10, 2);
        stock.indicators.put("PCU", pcup);

        Indicator pcdw = new PriceChannelLowerIndicator(closes, "PCL", 10, 2);
        stock.indicators.put("PCL", pcdw);

//        StockUtils.printTimeplotIndicatorOnFile(stock, dir)

//
//        Indicator smv = new Indicator(closes, "SMV-" + sma14, sma14, -1, -1, -1, -1);
//        Indicator smd = new Indicator(closes, "SMD-" + sma14, sma14, -1, -1, -1, -1);
//        Indicator mom = new Indicator(closes, "MOM-" + sma14, sma14, -1, -1, -1, -1);
//        Indicator macd = new Indicator(closes, "MACD", 12, 26, -1, -1, -1);
//        Indicator d = new Indicator(macd, "SMA", 9, -1, -1, -1, -1);
//
//        Indicator to = new Indicator(closes, "TO", 4, 20, -1, -1, -1);
//        Indicator roc = new Indicator(closes, "ROC", sma10, -1, -1, -1, -1);
//        Indicator rsi = new Indicator(closes, "RelativeStrengthIndex", sma10, -1, -1, -1, -1);
//        Indicator cci = new Indicator(closes, "CCI", sma10, -1, -1, -1, -1);
//        Indicator osc = new Indicator(closes, "OSC", 4, 20, -1, -1, -1);
//        Indicator k = new Indicator(stock, "%K", sma10, -1, -1, -1, -1);
//        Indicator s = new Indicator(k, "SMA", sma10, -1, -1, -1, -1);
//        System.out.println("standard deviation:" + closes.getStandardDeviation());

    }


    @Test
    public void testMACD() throws IOException, ParseException {

        Indicator sma12 = new SMAIndicator(closes, "SMA-" + 12, 12);
        Indicator sma24 = new SMAIndicator(closes, "SMA-" + 24, 24)

        stock.indicators.put("SMA-" + 12, sma12)
        stock.indicators.put("SMA-" + 24, sma24)

        Indicator macd = new MACDIndicator(closes, "MACD", 12, 26);
        stock.indicators.put("MACD", macd);

        Indicator macdsignal = new MACDSignal(closes, "MACDSignal", 12, 26, 9);
        stock.indicators.put("MACDSignal", macdsignal);

//        StockUtils.printTimeplotIndicatorOnFile(stock, dir)
    }


    @Test
    public void testEndDate() throws IOException, ParseException {

        Date da = DateUtils.Date("11/1/2009");
        Date a = DateUtils.Date("11/1/2010");

        Instrument stock = YahooUtils.downloadYahooData("AAPL", "", da, a);
        TimeSeries closes = stock.buildCloseSeries();
        FileUtils.writeStringToFile(new File(dir + "stock.txt"), closes.getTimeplotSeries())

        Indicator sma12 = new SMAIndicator(closes, "SMA-" + 12, 12);
        Indicator sma24 = new SMAIndicator(closes, "SMA-" + 24, 24)

        stock.indicators.put("SMA-" + 12, sma12)
        stock.indicators.put("SMA-" + 24, sma24)

        Indicator macd = new MACDIndicator(closes, "MACD", 12, 26);
        stock.indicators.put("MACD", macd);

        Indicator macdsignal = new MACDSignal(closes, "MACDSignal", 12, 26, 9);
        stock.indicators.put("MACDSignal", macdsignal);

        StockUtils.printTimeplotIndicatorOnFile(dir, stock)
    }

    @Test
    public static void mat1in() {

        double[] input = new double[20]
        input[0] = (1.0135518)
        input[1] = (-0.7113242 as Double)
        input[2] = (-0.3906069 as Double)
        input[3] = (1.565203)
        input[4] = (0.0439317)
        input[5] = (-1.1656093 as Double)
        input[6] = (1.0701692)
        input[7] = (1.0825379)
        input[8] = (-1.2239744 as Double)
        input[9] = (-0.0321446 as Double)
        input[10] = (1.1815997)
        input[11] = (-1.4969448 as Double)
        input[12] = (-0.7455299 as Double)
        input[13] = (1.0973884)
        input[14] = (-0.2188716 as Double)
        input[15] = (-1.0719573 as Double)
        input[16] = (0.9922009)
        input[17] = (0.4374216)
        input[18] = (-1.6880219 as Double)
        input[19] = (0.2609807 as Double)

        List<SSAItem> analyze = SSAStudy.analyze(input, 4)
        println "===> " + SSAStudy.getColumn(analyze.get(0).reconstructed, 0)

    }

}