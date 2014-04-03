package com.netnumeri.server.finance.utils

import com.netnumeri.server.finance.finpojo.asset.Stock
import com.netnumeri.server.utils.StockUtilsTest

public class TestUtils {

    public static Stock buildStock(String ticker) throws Exception {

        return StockUtilsTest.getStock("./test/resources/SSRI.csv", ticker);

    }

    public static Stock buildStock15(String ticker) throws Exception {

        return StockUtilsTest.getStock("./test/resources/SSRI-15.csv", ticker);

    }

    public static Stock buildStockONELine(String ticker) throws Exception {

        return StockUtilsTest.getStock("./test/resources/SSRI-ONE-LINE.csv", ticker);

    }

    public static Stock buildStockTWOLines(String ticker) throws Exception {

        return com.netnumeri.server.utils.StockUtilsTest.getStock("./test/resources/SSRI-TWO-LINES.csv", ticker);

    }


}
