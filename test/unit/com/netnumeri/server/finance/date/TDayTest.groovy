package com.netnumeri.server.finance.date;


import com.netnumeri.server.finance.utils.DateUtils

public class TDayTest extends GroovyTestCase {


    public void testIsEqual() throws Exception {

        Date d1 = DateUtils.Date("03/27/2007");
        Date d2 = DateUtils.Date("3/27/2007");
        assertTrue(DateUtils.isEqual(d1, d2));
        assertTrue(DateUtils.isLessEqual(d1, d2));
        assertTrue(DateUtils.isGreaterEqual(d1, d2));

        Date date = DateUtils.Date("1/7/2008");
        Date lowerBoundTDay = DateUtils.Date("1/2/2008");
        System.out.println("date = " + date);
        System.out.println("lowerBoundDate = " + lowerBoundTDay);

        assertTrue(DateUtils.isGreaterEqual(date, lowerBoundTDay));

    }


    public void testIsLess() throws Exception {

        Date d1 = DateUtils.Date("3/26/2007");
        Date d2 = DateUtils.Date("3/27/2007");
        assertTrue(DateUtils.isLess(d1, d2));

    }


    public void testnextDate() throws Exception {

        Date d1 = DateUtils.Date("3/26/2007");
        Date d2 = DateUtils.Date("3/27/2007");

        Date date = DateUtils.nextDay(d1);

        assertEquals(date.toString(), d2.toString());

        assertTrue(DateUtils.isLess(d1, d2));
        assertTrue(DateUtils.isGreater(d2, d1));

    }


    public void testDiffDays() {

        Date d1 = DateUtils.Date("3/26/2007");
        Date d2 = DateUtils.Date("3/27/2007");

        assertEquals(1, DateUtils.diffDays(d1, d2));

        Date d3 = DateUtils.Date("3/28/2007");

        assertEquals(2, DateUtils.diffDays(d1, d3));

    }

}
