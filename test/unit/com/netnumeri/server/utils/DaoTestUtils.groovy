package com.netnumeri.server.utils;


import com.netnumeri.server.finance.finpojo.Portfolio

public class DaoTestUtils {

    public static Portfolio createTestPortfolio(String name, String email) {
        Portfolio portfolio = new Portfolio();
        portfolio.setId(null);
        portfolio.setName(name);
        return portfolio;
    }

}
