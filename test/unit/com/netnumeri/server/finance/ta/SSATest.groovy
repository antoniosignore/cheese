package com.netnumeri.server.finance.ta

import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.finpojo.asset.Stock
import com.netnumeri.server.finance.ssa.SSAItem
import com.netnumeri.server.finance.ssa.SSAStudy
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.YahooUtils
import junit.framework.TestCase
import org.apache.commons.io.FileUtils
import org.junit.Ignore
import org.junit.Test

import java.text.ParseException

public class SSATest extends TestCase {

    Stock stock

    @Test
    public void setUp() throws IOException, ParseException {


//        closes = stock.getCloseSeries()
//        stock.indicators.put("SMA-" + 50, new SMAIndicator(closes, "SMA-" + 50, 50, -1, -1, -1, -1))


    }

    @Test
    public void test1() {

        double[] input = new double[20]
        input[0] = (1.0135518)
        input[1] =(-0.7113242 as Double)
        input[2] =(-0.3906069 as Double)
        input[3] =(1.565203)
        input[4] =(0.0439317)
        input[5] =(-1.1656093 as Double)
        input[6] =(1.0701692)
        input[7] =(1.0825379)
        input[8] =(-1.2239744 as Double)
        input[9] =(-0.0321446 as Double)
        input[10] =(1.1815997)
        input[11] =(-1.4969448 as Double)
        input[12] =(-0.7455299 as Double)
        input[13] =(1.0973884)
        input[14] =(-0.2188716 as Double)
        input[15] =(-1.0719573 as Double)
        input[16] =(0.9922009)
        input[17] =(0.4374216)
        input[18] =(-1.6880219 as Double)
        input[19] =(0.2609807 as Double)

        SSAStudy ssa = new SSAStudy(input)
        List<SSAItem> analyze = ssa.analyze(4)

//        List<SSAItem> analyze = SSAStudy.analyze(4)

        for (int i = 0; i < analyze.size(); i++) {
            SSAItem item = analyze.get(i);
            println "Item: + " + item + "===> " + ssa.getColumn (item.reconstructed, 0)

        }

        double[] total = ssa.reconstructedAll(analyze)
        println "total ===> " + total

    }

    @Test
    public void test2() {

        Date da = DateUtils.Date("11/1/2012");
        Date a = DateUtils.today();

        stock = YahooUtils.downloadYahooData("AAPL", "", da, a)

        TimeSeries closeSeries = stock.buildCloseSeries()
        closeSeries.normalize()
        double[] arrayOfDoubles = closeSeries.convertToArray()

//        TimeSeries returns = stock.buildReturnSeries(null, null)
//        double[] arrayOfDoubles = returns.convertToArray()
        println "returns ===> " + arrayOfDoubles

        SSAStudy ssa = new SSAStudy(arrayOfDoubles)
        List<SSAItem> items = ssa.analyze(50)
        println "ssa.eigenvalueList = $ssa.eigenvalueList"
        double[] column = ssa.getColumn(items.get(0).reconstructed, 0)
        println "column = $column"

        double[] fullRebuilt = ssa.reconstructedAll(items)
        println "fullRebuilt ===> " + fullRebuilt


    }

}