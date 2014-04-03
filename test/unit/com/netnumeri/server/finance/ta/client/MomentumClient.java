package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.Momentum;

public class MomentumClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                       ###################################");
        System.out.println("                       # Momentum Console Client Example #");
        System.out.println("                       ###################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this console client application we provide  one  example  for");
        System.out.println("    each of the methods within Momentum class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++");
        System.out.println(" + 5-Day Momentum +");
        System.out.println(" ++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    momentumIndicator( double close,");
        System.out.println("                       double nperiodPrice )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the 5-day Momentum of the FTSE100 on the 20 Aug  2004,  when");
        System.out.println("    the closing price on the 20 Aug 2005  =  4369.20,  and  the  closing");
        System.out.println("    price 5 previous trading days on the 13 Aug 2004 = 4301.50 ?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    close = 4369.20");
        System.out.println("    nperiodPrice = 4301.50");
        // Here we evaluate the 5-day Momentum
        double momemtum1 = Momentum.momentumIndicator(
                4369.20, // close
                4301.50 // nperiodPrice
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The 5-day Momentum was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == momemtum1) ? "NaN" : "" + (int) (10000 * momemtum1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++");
        System.out.println(" + 3-Day Momentum over period +");
        System.out.println(" ++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    momentumPeriod( double[] close,");
        System.out.println("                    int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the 3-day Momentum Over Period of the  FTSE100  between  the");
        System.out.println("    16-20 Aug 2004, when the closing prices were:");
        System.out.println("    ");
        System.out.println("       - 20 Aug 2004 = 4369.20");
        System.out.println("       - 19 Aug 2004 = 4301.50");
        System.out.println("       - 18 Aug 2004 = 4389.10");
        System.out.println("       - 17 Aug 2004 = 4369.30");
        System.out.println("       - 16 Aug 2004 = 4300.80");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    close = {4369.2, 4301.5, 4389.1, 4369.3, 4300.8}");
        System.out.println("    noOfPeriods = 3");
        // Here we evaluate the 3-day Momentum Period
        double[] momentumPeriod1 = Momentum.momentumPeriod(
                new double[]{4369.2, 4301.5, 4389.1, 4369.3, 4300.8}, // close
                3 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The 3-day Momentum Over Period was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(momentumPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++");
        System.out.println(" + 5-Day Momentum Percentage +");
        System.out.println(" +++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    momentumPct( double close,");
        System.out.println("                 double nperiodPrice )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the 5-day Momentum percentage of the FTSE100 on the  20  Aug");
        System.out.println("    2004, when the closing price on the 20 Aug 2005 = 4369.20,  and  the");
        System.out.println("    closing price 5 previous trading days on the 13 Aug 2004  =  4301.50");
        System.out.println("    ?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    close = 4369.20");
        System.out.println("    nperiodPrice = 4301.50");
        // Here we evaluate the 5-day Momentum percentage
        double momemtumPct1 = Momentum.momentumPct(
                4369.20, // close
                4301.50 // nperiodPrice
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The 5-day Momentum percentage was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == momemtumPct1) ? "NaN" : "" + (int) (10000 * momemtumPct1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + 3-Day Momentum Percentage over period +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    momentumPctPeriod( double[] prices,");
        System.out.println("                       int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the 3-day Momentum Percentage Over  Period  of  the  FTSE100");
        System.out.println("    between the 16-20 Aug 2004, when the closing prices were:");
        System.out.println("    ");
        System.out.println("       - 20 Aug 2004 = 4369.20");
        System.out.println("       - 19 Aug 2004 = 4301.50");
        System.out.println("       - 18 Aug 2004 = 4389.10");
        System.out.println("       - 17 Aug 2004 = 4369.30");
        System.out.println("       - 16 Aug 2004 = 4300.80");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {4369.2, 4301.5, 4389.1, 4369.3, 4300.8}");
        System.out.println("    noOfPeriods = 3");
        // Here we evaluate the 3-day Momentum Percentage Period
        double[] momentumPctPeriod1 = Momentum.momentumPctPeriod(
                new double[]{4369.2, 4301.5, 4389.1, 4369.3, 4300.8}, // prices
                3 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The 3-day Momentum Percentage Over Period was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(momentumPctPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++");
        System.out.println(" + The highest value +");
        System.out.println(" +++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    highest( double[] prices,");
        System.out.println("             int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the highest  value  over  the  three  days  of  the  FTSE100");
        System.out.println("    between the 16-20 Aug 2004? The  closing  prices  over  this  period");
        System.out.println("    were:");
        System.out.println("    ");
        System.out.println("       - 20 Aug 2004 = 4369.20");
        System.out.println("       - 19 Aug 2004 = 4301.50");
        System.out.println("       - 18 Aug 2004 = 4389.10");
        System.out.println("       - 17 Aug 2004 = 4369.30");
        System.out.println("       - 16 Aug 2004 = 4300.80");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {4369.2, 4301.5, 4389.1, 4369.3, 4300.8}");
        System.out.println("    noOfPeriods = 3");
        // Here we evaluate the highest value of a  given  prices  array  with  a
        // look back period of 3 days
        double highest1 = Momentum.highest(
                new double[]{4369.2, 4301.5, 4389.1, 4369.3, 4300.8}, // prices
                3 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The highest value over the three days period was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == highest1) ? "NaN" : "" + (int) (10000 * highest1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++");
        System.out.println(" + Highest over all sub-periods +");
        System.out.println(" ++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    highestPeriod( double[] prices,");
        System.out.println("                   int noPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What are the highest value over each of the  look  back  periods  of");
        System.out.println("    length 3?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {102.0, 101.0, 100.0, 103.0, 102.0}");
        System.out.println("    noPeriods = 3");
        // Here we evaluate the highest value over all look back periods.
        double[] highestPeriod1 = Momentum.highestPeriod(
                new double[]{102.0, 101.0, 100.0, 103.0, 102.0}, // prices
                3 // noPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The highest value over the 1st, 2nd etc look back periods is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(highestPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++");
        System.out.println(" + The lowest value +");
        System.out.println(" ++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    lowest( double[] prices,");
        System.out.println("            int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the lowest value over the three days of the FTSE100  between");
        System.out.println("    the 16-20 Aug 2004? The closing prices over this period were:");
        System.out.println("    ");
        System.out.println("       - 20 Aug 2004 = 4369.20");
        System.out.println("       - 19 Aug 2004 = 4301.50");
        System.out.println("       - 18 Aug 2004 = 4389.10");
        System.out.println("       - 17 Aug 2004 = 4369.30");
        System.out.println("       - 16 Aug 2004 = 4300.80");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {4369.2, 4301.5, 4389.1, 4369.3, 4300.8}");
        System.out.println("    noOfPeriods = 3");
        // Here we evaluate the lowest value of a given prices array with a  look
        // back period of 3 days
        double lowest1 = Momentum.lowest(
                new double[]{4369.2, 4301.5, 4389.1, 4369.3, 4300.8}, // prices
                3 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The lowest value over the three days period was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == lowest1) ? "NaN" : "" + (int) (10000 * lowest1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++");
        System.out.println(" + Lowest over all sub-periods +");
        System.out.println(" +++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    lowestPeriod( double[] prices,");
        System.out.println("                  int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What are the lowest value over each of  the  look  back  periods  of");
        System.out.println("    length 3?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {102.0, 101.0, 100.0, 103.0, 102.0}");
        System.out.println("    noOfPeriods = 3");
        // Here we evaluate the lowest value over all look back periods.
        double[] lowestPeriod1 = Momentum.lowestPeriod(
                new double[]{102.0, 101.0, 100.0, 103.0, 102.0}, // prices
                3 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The lowest value over the 1st, 2nd etc look back periods is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(lowestPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++");
        System.out.println(" + Position of the Highest price +");
        System.out.println(" +++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    highestPosition( double[] prices,");
        System.out.println("                     int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the position of the highest value over the look back  period");
        System.out.println("    of length 3?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {102.0, 101.0, 100.0, 103.0, 102.0}");
        System.out.println("    noOfPeriods = 3");
        // Here we evaluate the position of the highest value over the look  back
        // period.
        int highestPosition1 = Momentum.highestPosition(
                new double[]{102.0, 101.0, 100.0, 103.0, 102.0}, // prices
                3 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The position of the highest value (over the look back period) is:");
        System.out.println(" ");
        System.out.println("       " + highestPosition1);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++");
        System.out.println(" + Position of the Lowest price +");
        System.out.println(" ++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    lowestPosition( double[] prices,");
        System.out.println("                    int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the position of the lowest value over the look  back  period");
        System.out.println("    of length 3?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {102.0, 101.0, 100.0, 103.0, 102.0}");
        System.out.println("    noOfPeriods = 3");
        // Here we evaluate the position of the lowest value over the  look  back
        // period.
        int lowestPosition1 = Momentum.lowestPosition(
                new double[]{102.0, 101.0, 100.0, 103.0, 102.0}, // prices
                3 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The position of the lowest value (over the look back period) is:");
        System.out.println(" ");
        System.out.println("       " + lowestPosition1);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++");
        System.out.println(" + Trend Intensity Index +");
        System.out.println(" +++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    trendIntensityIndex( double[] prices,");
        System.out.println("                         int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the trend  intensity  index  using  the  three  days  simple");
        System.out.println("    moving average for the FTSE100 when the historical values fro 14  to");
        System.out.println("    19 Aug 2004 are taken into account?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    prices = {4337.9, 4314.4, 4350.9, 4312.2, 4328.1}");
        System.out.println("    lengthOfMA = 3");
        // Here we mesure the strength of the market by comparing  the  deviation
        // of the price with its corresponding moving average.
        double tintensityIndex1 = Momentum.trendIntensityIndex(
                new double[]{4337.9, 4314.4, 4350.9, 4312.2, 4328.1}, // prices
                3 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The trend intensity index was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == tintensityIndex1) ? "NaN" : "" + (int) (10000 * tintensityIndex1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
