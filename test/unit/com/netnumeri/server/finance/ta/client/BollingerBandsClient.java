package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.BollingerBands;

public class BollingerBandsClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                    #########################################");
        System.out.println("                    # BollingerBands Console Client Example #");
        System.out.println("                    #########################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this example we provide  an  example  for  each  one  of  the");
        System.out.println("    methods within the BollingerBands class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluation of the Lower Bollinger Band for a given interval +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    lowerBollingerBand( double[] prices,");
        System.out.println("                        double standardDeviationLevel )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the value of the Lower Bollinger Band on the  19  Aug  2004,");
        System.out.println("    at 1 standard deviation using a 3-day simple  moving  average?  Note");
        System.out.println("    that the number of prices given determines the length of the  moving");
        System.out.println("    average used.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {4337.9, 4314.4, 4350.9}");
        System.out.println("    standardDeviationLevel = 1");
        // Here we evaluate the Lower Bollinger over a period.
        double bollLower1 = BollingerBands.lowerBollingerBand(
                new double[]{4337.9, 4314.4, 4350.9}, // prices
                1. // standardDeviationLevel
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The value of the Lower Bollinger Band on the 19 Aug 2004 is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == bollLower1) ? "NaN" : "" + (int) (10000 * bollLower1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Position   of  Lower  Bollinger  Band  over  sub-periods  using  3-day +");
        System.out.println(" + (Simple) Moving Average                                                +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    lowerBollingerBands( double[] prices,");
        System.out.println("                         double standardDeviationLevel,");
        System.out.println("                         int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What are the values of the Lower Bollinger Band  within  the  period");
        System.out.println("    11-19 Aug 2004, at 1  standard  deviation  using  the  3-day  simple");
        System.out.println("    moving average?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {4337.9, 4314.4, 4350.9, 4312.2, 4328.1, 4301.5, 4350.2, 4358.7, 4355.2, 4362.6}");
        System.out.println("    standardDeviationLevel = 1");
        System.out.println("    lengthOfMA = 3");
        // Here we evaluate the Lower Bollinger Band,  at  1  standard  deviation
        // using the 3-day  simple  moving  average  for  the  FTSE100  when  the
        // historical values  from  6-19  Aug  2004,  inclusive  are  taken  into
        // account.
        double[] bollingerbandslower1 = BollingerBands.lowerBollingerBands(
                new double[]{4337.9, 4314.4, 4350.9, 4312.2, 4328.1, 4301.5, 4350.2, 4358.7, 4355.2, 4362.6}, // prices
                1., // standardDeviationLevel
                3 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The value of the Lower Bollinger Band on the 19 Aug 2004 is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(bollingerbandslower1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluation of the Upper Bollinger Band for a given interval +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    upperBollingerBand( double[] prices,");
        System.out.println("                        double standardDeviationLevel )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the value of the Upper Bollinger Band on the  19  Aug  2004,");
        System.out.println("    at 1 standard deviation using a 3-day simple  moving  average?  Note");
        System.out.println("    that the number of prices given determines the length of the  moving");
        System.out.println("    average used.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {4337.9, 4314.4, 4350.9}");
        System.out.println("    standardDeviationLevel = 1");
        // Here we evaluate the Lower Bollinger over a period.
        double bollUpper1 = BollingerBands.upperBollingerBand(
                new double[]{4337.9, 4314.4, 4350.9}, // prices
                1. // standardDeviationLevel
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The value of the Upper Bollinger Band on the 19 Aug 2004 is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == bollUpper1) ? "NaN" : "" + (int) (10000 * bollUpper1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Position   of  Upper  Bollinger  Band  over  sub-periods  using  3-day +");
        System.out.println(" + (Simple) Moving Average                                                +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    upperBollingerBands( double[] prices,");
        System.out.println("                         double standardDeviationLevel,");
        System.out.println("                         int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What are the values of the Higher Bollinger Band within  the  period");
        System.out.println("    11-19 Aug 2004, at 1  standard  deviation  using  the  3-day  simple");
        System.out.println("    moving average?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {4337.9, 4314.4, 4350.9, 4312.2, 4328.1, 4301.5, 4350.2, 4358.7, 4355.2, 4362.6}");
        System.out.println("    standardDeviationLevel = 1");
        System.out.println("    lengthOfMA = 3");
        // Here we evaluate the Higher Bollinger Band, at  1  standard  deviation
        // using the 3-day  simple  moving  average  for  the  FTSE100  when  the
        // historical values  from  6-19  Aug  2004,  inclusive  are  taken  into
        // account.
        double[] upperBollingerbands1 = BollingerBands.upperBollingerBands(
                new double[]{4337.9, 4314.4, 4350.9, 4312.2, 4328.1, 4301.5, 4350.2, 4358.7, 4355.2, 4362.6}, // prices
                1., // standardDeviationLevel
                3 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The values of the Upper Band on the 19 Aug 2004 is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(upperBollingerbands1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
