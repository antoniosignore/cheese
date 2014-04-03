package com.netnumeri.server.finance.utils;


import com.netnumeri.server.finance.finpojo.Portfolio

public class PogoUtils {

    public static Portfolio createTestPortfolio(String name, String email) {
        Portfolio portfolio = new Portfolio();
        portfolio.id = null;
        portfolio.username = email;
        portfolio.created = new Date();
        portfolio.name = name;
        return portfolio;
    }
}
