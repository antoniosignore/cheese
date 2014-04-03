package com.netnumeri.server.finance.utils;


import static com.netnumeri.server.finance.utils.YahooUtils.getCompanySnapshot

class YahooUtilsTest extends GroovyTestCase {


    public void testGetCompanySnapshot() {
        def snapshot = getCompanySnapshot("ibm");
        println snapshot.lastPrice
    }

    void testMapkey() {
        Date date = DateUtils.Date("3/27/2007")
        String key = YahooUtils.mapKey(date);
        assertEquals("2007-3", key)
        Date s = YahooUtils.fromKey(key);
        println "date = $s"

        assertEquals("Thu Mar 01 00:00:00 CET 2007", s.toString())
    }

}
