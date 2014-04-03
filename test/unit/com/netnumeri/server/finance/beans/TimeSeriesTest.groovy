package com.netnumeri.server.finance.beans;


import com.netnumeri.server.finance.finpojo.asset.Stock
import com.netnumeri.server.finance.utils.DateUtils
import com.netnumeri.server.finance.utils.TestUtils
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4.class)
public class TimeSeriesTest extends GroovyTestCase {

    Stock stock;
    TimeSeries timeSeries;

    @Before
    public void setUp() throws Exception {
        try {
            stock = TestUtils.buildStock("SSRI");
            timeSeries = stock.getCloseSeries();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void getCloseSeriesIndexesAndBound() throws Exception {
//
//        Stock stock = TestUtils.buildStockTWOLines("SSRI");
//
//
//        Daily value = dailyarray.firstValue()
//
//
//        assertEquals(2, stock.getNDaily());
//
//        System.out.println("stock.firstDate() = " + stock.firstDate());
//        System.out.println("stock.lastDate() = " + stock.lastDate());
//
//        assertEquals(1, DateUtils.diffDays(stock.firstDate(), stock.lastDate()));
//
//        TimeSeries closeSeries = stock.getCloseSeries();
//
//        assertEquals(2, closeSeries.getNData());
//    }


    public void getCloseSeries() throws Exception {
        Stock stock = TestUtils.buildStockONELine("SSRI");
        assertEquals(1, stock.getNDaily());
        TimeSeries closeSeries = stock.getCloseSeries();
        System.out.println("stock.firstDate() = " + stock.firstDate());
        System.out.println("stock.lastDate() = " + stock.lastDate());
        assertEquals(0, DateUtils.diffDays(stock.firstDate(), stock.lastDate()));
        assertEquals(1, closeSeries.getNData());
        assertEquals(stock.getNDaily(), closeSeries.getNData());
//        assertEquals(stock.firstDate().toString(), buildCloseSeries.firstDate().toString());
//        System.out.println("buildCloseSeries = " + buildCloseSeries.lastDate());
    }


    public void testGetNRows() throws Exception {
        assertEquals(1, timeSeries.getNRows());
    }


    public void testGetStdDev() throws Exception {
        assertEquals(9.014983556431332, timeSeries.getStandardDeviation());
    }


    public void testGetStdErr() throws Exception {
        assertEquals(0.5039529012055818, timeSeries.getStandardError());
    }


    public void testIsEmpty() throws Exception {

    }


    public void testGetLastIndex() throws Exception {
        System.out.println("timeSeries.firstDate() = " + timeSeries.firstDate());
        System.out.println("timeSeries.getLastData() = " + timeSeries.getLastData());
        assertEquals(321, timeSeries.getNData());
    }


    public void testGetNData() throws Exception {
        assertEquals(321, timeSeries.getNData());
    }


    public void testGetNumberOfNotNullData() throws Exception {
        assertEquals(321, timeSeries.getNumberOfNotNullData(0));
    }


    public void testGetNextIndex() throws Exception {

        double lastData = timeSeries.getLastData();
        assertEquals(16.11, lastData);

        double lastValidData = timeSeries.getLastValidData();
        assertEquals(16.11, lastValidData);
    }


    public void testGetNextDate() throws Exception {
        Date firstDate = timeSeries.firstDate();
        assertTrue(DateUtils.isEqual(timeSeries.firstDate(), DateUtils.Date("1/2/2008")));
    }

}
