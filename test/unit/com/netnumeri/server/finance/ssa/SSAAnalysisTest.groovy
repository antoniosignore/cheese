package com.netnumeri.server.finance.ssa

import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.finpojo.Instrument
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.YahooUtils
import com.netnumeri.server.utils.StockUtils
import org.apache.commons.io.FileUtils
import org.junit.Test

import java.text.ParseException

class SSAAnalysisTest {

    public static final String TICKER = "IBM"
    public static final String TOP_DI = "/home/antonio/timeplot/"
    String dir
    Instrument stock
    TimeSeries closes

    @Test
    public void setUp() throws IOException, ParseException {

        Date da = DateUtils.Date("11/2/2009");
        Date a = DateUtils.today();

        stock = YahooUtils.downloadYahooData(TICKER, "test", da, a);
        closes = stock.closeSeries();
//        stock.indicators.put("SMA-" + 50, new SMAIndicator(closes, "SMA-" + 50, 50, -1, -1, -1, -1))

        dir = TOP_DI + stock.name + "/"

        FileUtils.writeStringToFile(new File(dir + "stock.txt"), closes.getTimeplotSeries())
        FileUtils.writeStringToFile(new File(dir + "stock.raw"), closes.getNoDateSeries())

        SSAStudy.analyze(stock, 50);

//        SSAAnalysis analysis = new SSAAnalysis(closes.convertToList(), 50)
//
//        def components = [0]
//        Indicator ssa0 = new SSAComponentsIndicator(closes,"SSA-0", analysis, components);
//        stock.indicators.put(ssa0.name, ssa0)
//
//        components = [1]
//        Indicator ssa1 = new SSAComponentsIndicator(closes,"SSA-1", analysis, components);
//        stock.indicators.put(ssa1.name, ssa1)
//
//        components = [0,1]
//        Indicator ssa01 = new SSAComponentsIndicator(closes,"SSA-01", analysis, components);
//        stock.indicators.put(ssa01.name, ssa01)
//
//        components = [2]
//        Indicator ssa2 = new SSAComponentsIndicator(closes,"SSA-2", analysis, components);
//        stock.indicators.put(ssa2.name, ssa2)
//
//        components = [3]
//        Indicator ssa3 = new SSAComponentsIndicator(closes,"SSA-3", analysis, components);
//        stock.indicators.put(ssa3.name, ssa3)
//
//        components = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14]
//        Indicator ssa05 = new SSAComponentsIndicator(closes,"SSA-05", analysis, components);
//        stock.indicators.put(ssa05.name, ssa05)

        //components = [0,5]
//        Indicator ssa1Predict = new SSASeriesPredictionIndicator(closes,"SSA-0-predict", 100, 3, components, 16);
//        stock.indicators.put(ssa1Predict.name, ssa1Predict)

        StockUtils.printTimeplotIndicatorOnFile(dir + "/" + stock.name + "/", stock)

    }


}