package com.netnumeri.server.servlets;

import com.netnumeri.server.finance.beans.GenericMatrix
import com.netnumeri.server.finance.beans.TimeSeries
import com.netnumeri.server.finance.finpojo.asset.Stock
import com.netnumeri.server.finance.utils.TestUtils

class GenericMatrixTest extends GroovyTestCase {

    GenericMatrix<Double> matrix;
    Stock stock;
    TimeSeries timeSeries;

    public void setUp() throws Exception {
        try {
            stock = TestUtils.buildStock("SSRI");
            timeSeries = stock.getCloseSeries();
            matrix = timeSeries.getMatrix();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    void testMap() {

        TreeMap<Date, Double> map = matrix.map(0);
        assertNotNull(map);
    }

    void testGet() {

        Date date = matrix.firstDate(0);
        Double daily = matrix.get(0, date);
        assertEquals(39.5, daily);

    }

    void testIsEmpty() {

        assertFalse(matrix.isEmpty(0));
        assertTrue(matrix.isEmpty(1));
    }


    void testGetLastValidData() {

        assertEquals(16.11, matrix.lastValidData(0));

    }

    void testIsValidRow() {

        assertTrue(matrix.isValidRow(0));
        assertFalse(matrix.isValidRow(1));

    }

    void testSize() {

        assertEquals(321, matrix.size(0));
    }

    void testCloneIt() {

        GenericMatrix<Double> matrixCloned = matrix.cloneIt();

        assertEquals(321, matrix.size(0));

        assertEquals(321, matrixCloned.size(0));

    }

    void testGetFirstDate() {
        assertEquals("Wed Jan 02 00:00:00 CET 2008", matrix.firstDate(0).toString());
        assertEquals("Thu Apr 09 00:00:00 CEST 2009", matrix.lastDate(0).toString());

        assertEquals(321, matrix.noElements(0));

        Date first = matrix.firstDate(0);
        Date next = matrix.nextDate(0, first)
        assertEquals("Thu Jan 03 00:00:00 CET 2008", next.toString());

        Date last = matrix.lastDate(0);
        Date prev = matrix.prevDate(0, last)
        assertEquals("Wed Apr 08 00:00:00 CEST 2009", prev.toString());

    }

    void testNoElements() {

    }
}
