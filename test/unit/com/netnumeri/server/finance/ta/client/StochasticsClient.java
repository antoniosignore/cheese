package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.Stochastics;

public class StochasticsClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                      ######################################");
        System.out.println("                      # Stochastics Console Client Example #");
        System.out.println("                      ######################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this example we provide a example for each  of  the  examples");
        System.out.println("    within the Stochastics Class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++");
        System.out.println(" + K Fast Stochastic +");
        System.out.println(" +++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    kFastStochastic( double[] high,");
        System.out.println("                     double[] low,");
        System.out.println("                     double close )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the 5-day K Fast Stochastic of the FTSE100 on  the  20  Aug");
        System.out.println("    2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4373.2, 4381.4, 4360.3, 4373.7, 4353.4}");
        System.out.println("    low = {4349.5, 4353.2, 4331.6, 4338.6, 4283.0}");
        System.out.println("    close = 4369.20");
        // Here we evaluate the 5-day K Fast Stochastic of the FTSE100 on the  20
        // Aug 2004
        double kFastStoch1 = Stochastics.kFastStochastic(
                new double[]{4373.2, 4381.4, 4360.3, 4373.7, 4353.4}, // high
                new double[]{4349.5, 4353.2, 4331.6, 4338.6, 4283.0}, // low
                4369.20 // close
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The K Fast Stochastic was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == kFastStoch1) ? "NaN" : "" + (int) (10000 * kFastStoch1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++");
        System.out.println(" + K Fast Stochastic Over Period +");
        System.out.println(" +++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    kFastStochasticPeriod( double[] highs,");
        System.out.println("                           double[] lows,");
        System.out.println("                           double[] close,");
        System.out.println("                           int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the 5-day K Fast Stochastic  of  the  FTSE100  between  the");
        System.out.println("    18-20 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    highs = {4373.2, 4381.4, 4360.3, 4373.7, 4353.4, 4360.3, 4365.7}");
        System.out.println("    lows = {4349.5, 4353.2, 4331.6, 4338.6, 4283.0, 4290.8, 4320.7}");
        System.out.println("    close = {4352.5, 4354.2, 4351.6, 4345.6, 4283.0, 4292.8, 4322.7}");
        System.out.println("    noOfPeriods = 5");
        // Here we evaluate the 5-day K Fast Stochastic of the FTSE100 on the  20
        // Aug 2004, 19 Aug 2004 and 18 Aug 2004.
        double[] kFastStochPer1 = Stochastics.kFastStochasticPeriod(
                new double[]{4373.2, 4381.4, 4360.3, 4373.7, 4353.4, 4360.3, 4365.7}, // highs
                new double[]{4349.5, 4353.2, 4331.6, 4338.6, 4283.0, 4290.8, 4320.7}, // lows
                new double[]{4352.5, 4354.2, 4351.6, 4345.6, 4283.0, 4292.8, 4322.7}, // close
                5 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The K Fast Stochastic was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(kFastStochPer1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++");
        System.out.println(" + %D Stochastic +");
        System.out.println(" +++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dStochastic( double[] stochastic,");
        System.out.println("                 int method )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the %D Stochastic when the last three Stochastic  where  60,");
        System.out.println("    74, 80; and the Simple Moving  Average  and  the  Linearly  Weighted");
        System.out.println("    Moving Average where used?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    stochastic = {60.0, 74.0, 80.0}");
        System.out.println("    method = 1");
        // Here we evaluate the %D Stochastic using a Simple Moving Average
        double dstoch11 = Stochastics.dStochastic(
                new double[]{60.0, 74.0, 80.0}, // stochastic
                1 // method
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The %D Stochastic when the Simple Moving Average was used is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == dstoch11) ? "NaN" : "" + (int) (10000 * dstoch11) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++");
        System.out.println(" + %D Stochastic +");
        System.out.println(" +++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dStochastic( double[] stochastic,");
        System.out.println("                 int method )");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    stochastic = {60.0, 74.0, 80.0}");
        System.out.println("    method = 3");
        // Here we evaluate the %D Stochastic using a Linwearly  Weighted  Moving
        // Average
        double dstoch12 = Stochastics.dStochastic(
                new double[]{60.0, 74.0, 80.0}, // stochastic
                3 // method
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The %D Stochastic when the Linearly Weighted Moving Average  was  used");
        System.out.println("    is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == dstoch12) ? "NaN" : "" + (int) (10000 * dstoch12) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++");
        System.out.println(" + %D Stochastic +");
        System.out.println(" +++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dStochastic( double[] stochastic,");
        System.out.println("                 int method,");
        System.out.println("                 int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the %D Stochastic when the last three Stochastic  where  60,");
        System.out.println("    74, 80; and the Simple Moving  Average  and  the  Linearly  Weighted");
        System.out.println("    Moving Average where used with a length of moving average of 3?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    stochastic = {60.0, 65.0, 70.0, 74.0, 80.0, 85.0, 90.0}");
        System.out.println("    method = 1");
        System.out.println("    lengthOfMA = 3");
        // Here we evaluate the %D Stochastic using a Simple Moving Average
        double[] dstoch21 = Stochastics.dStochastic(
                new double[]{60.0, 65.0, 70.0, 74.0, 80.0, 85.0, 90.0}, // stochastic
                1, // method
                3 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The %D Stochastic when the Simple Moving Average was used is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(dstoch21, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++");
        System.out.println(" + %D Stochastic +");
        System.out.println(" +++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dStochastic( double[] stochastic,");
        System.out.println("                 int method,");
        System.out.println("                 int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    stochastic = {60.0, 65.0, 70.0, 74.0, 80.0, 85.0, 90.0}");
        System.out.println("    method = 3");
        System.out.println("    lengthOfMA = 3");
        // Here we evaluate the %D Stochastic using a Linwearly  Weighted  Moving
        // Average
        double[] dstoch22 = Stochastics.dStochastic(
                new double[]{60.0, 65.0, 70.0, 74.0, 80.0, 85.0, 90.0}, // stochastic
                3, // method
                3 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The %D Stochastic when the Linearly Weighted Moving Average  was  used");
        System.out.println("    is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(dstoch22, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + %D Stochastic when the prices of the asset from  the  last  five  days +");
        System.out.println(" + are known                                                              +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dStochastic( double[] high,");
        System.out.println("                 double[] low,");
        System.out.println("                 double[] close,");
        System.out.println("                 int noOfPeriods,");
        System.out.println("                 int method,");
        System.out.println("                 int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the %D Stochastic when the last three Stochastic  where  60,");
        System.out.println("    74, 80; and the Simple Moving  Average  and  the  Linearly  Weighted");
        System.out.println("    Moving Average where used with a length of moving average of 3?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4373.2, 4377.4, 4367.3, 4356.2}");
        System.out.println("    low = {4349.5, 4360.8, 4344.4, 4335.9}");
        System.out.println("    close = {4362.6, 4355.2, 4358.7, 4336.7}");
        System.out.println("    noOfPeriods = 3");
        System.out.println("    method = 1");
        System.out.println("    lengthOfMA = 3");
        // Here we evaluate the %D Stochastic using a Simple Moving Average
        double[] dstoch31 = Stochastics.dStochastic(
                new double[]{4373.2, 4377.4, 4367.3, 4356.2}, // high
                new double[]{4349.5, 4360.8, 4344.4, 4335.9}, // low
                new double[]{4362.6, 4355.2, 4358.7, 4336.7}, // close
                3, // noOfPeriods
                1, // method
                3 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The %D Stochastic when the Simple Moving Average was used is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(dstoch31, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + %D Stochastic when the prices of the asset from  the  last  five  days +");
        System.out.println(" + are known                                                              +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dStochastic( double[] high,");
        System.out.println("                 double[] low,");
        System.out.println("                 double[] close,");
        System.out.println("                 int noOfPeriods,");
        System.out.println("                 int method,");
        System.out.println("                 int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4373.2, 4377.4, 4367.3, 4356.2}");
        System.out.println("    low = {4349.5, 4360.8, 4344.4, 4335.9}");
        System.out.println("    close = {4362.6, 4355.2, 4358.7, 4336.7}");
        System.out.println("    noOfPeriods = 3");
        System.out.println("    method = 3");
        System.out.println("    lengthOfMA = 3");
        // Here we evaluate the %D Stochastic using a Linwearly  Weighted  Moving
        // Average
        double[] dstoch32 = Stochastics.dStochastic(
                new double[]{4373.2, 4377.4, 4367.3, 4356.2}, // high
                new double[]{4349.5, 4360.8, 4344.4, 4335.9}, // low
                new double[]{4362.6, 4355.2, 4358.7, 4336.7}, // close
                3, // noOfPeriods
                3, // method
                3 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The %D Stochastic when the Linearly Weighted Moving Average  was  used");
        System.out.println("    is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(dstoch32, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++");
        System.out.println(" + Extreme Value Signal +");
        System.out.println(" ++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    extremeValueSignal( double extremeLow,");
        System.out.println("                        double extremeHigh,");
        System.out.println("                        double lastStochastic,");
        System.out.println("                        double previousStochastic )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    When we assign the extreme low and high values of the stochastic  to");
        System.out.println("    be 30, 70 respectively, we evaluate the  trading  signals  generated");
        System.out.println("    when:");
        System.out.println("    ");
        System.out.println("       - Last Stochastic = 75, Previous Stochastic = 60");
        System.out.println("       - Last Stochastic = 65, Previous Stochastic = 60");
        System.out.println("       - Last Stochastic = 25, Previous Stochastic = 40");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    extremeLow = 30");
        System.out.println("    extremeHigh = 70");
        System.out.println("    lastStochastic = 75");
        System.out.println("    previousStochastic = 60");
        // Here the Extreme Value Signal is evaluated
        int extremeValue1 = Stochastics.extremeValueSignal(
                30., // extremeLow
                70., // extremeHigh
                75., // lastStochastic
                60. // previousStochastic
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The trading signal generated  when  Last  Stochastic  =  75,  Previous");
        System.out.println("    Stochastic = 60; is:");
        System.out.println(" ");
        System.out.println("       " + extremeValue1);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++");
        System.out.println(" + Extreme Value Signal +");
        System.out.println(" ++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    extremeValueSignal( double extremeLow,");
        System.out.println("                        double extremeHigh,");
        System.out.println("                        double lastStochastic,");
        System.out.println("                        double previousStochastic )");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    extremeLow = 30");
        System.out.println("    extremeHigh = 70");
        System.out.println("    lastStochastic = 65");
        System.out.println("    previousStochastic = 60");
        // Here the Extreme Value Signal is evaluated
        int extremeValue2 = Stochastics.extremeValueSignal(
                30., // extremeLow
                70., // extremeHigh
                65., // lastStochastic
                60. // previousStochastic
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The trading signal generated  when  Last  Stochastic  =  65,  Previous");
        System.out.println("    Stochastic = 60; is:");
        System.out.println(" ");
        System.out.println("       " + extremeValue2);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++");
        System.out.println(" + Extreme Value Signal +");
        System.out.println(" ++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    extremeValueSignal( double extremeLow,");
        System.out.println("                        double extremeHigh,");
        System.out.println("                        double lastStochastic,");
        System.out.println("                        double previousStochastic )");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    extremeLow = 30");
        System.out.println("    extremeHigh = 70");
        System.out.println("    lastStochastic = 25");
        System.out.println("    previousStochastic = 40");
        // Here the Extreme Value Signal is evaluated
        int extremeValue3 = Stochastics.extremeValueSignal(
                30., // extremeLow
                70., // extremeHigh
                25., // lastStochastic
                40. // previousStochastic
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The trading signal generated  when  Last  Stochastic  =  25,  Previous");
        System.out.println("    Stochastic = 40; is:");
        System.out.println(" ");
        System.out.println("       " + extremeValue3);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++");
        System.out.println(" + Cross Signal +");
        System.out.println(" ++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    crossingSignal( double firstStochasticLast,");
        System.out.println("                    double firstStochasticPrevious,");
        System.out.println("                    double secondStochasticLast,");
        System.out.println("                    double secondStochasticPrevious )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What trading signal was generate by the Stochastic  Crossing  signal");
        System.out.println("    when: a smoothed Stochastics last value was  65,  and  the  previous");
        System.out.println("    value was 75; and a more sensitive  second  Stochastics  last  value");
        System.out.println("    was 45, and the previous value was 75?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    firstStochasticLast = 65");
        System.out.println("    firstStochasticPrevious = 75");
        System.out.println("    secondStochasticLast = 45");
        System.out.println("    secondStochasticPrevious = 75");
        // Here we evaluate what crossing trading signal was generated
        int crossSignal1 = Stochastics.crossingSignal(
                65., // firstStochasticLast
                75., // firstStochasticPrevious
                45., // secondStochasticLast
                75. // secondStochasticPrevious
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The trading signal generated was:");
        System.out.println(" ");
        System.out.println("       " + crossSignal1);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++");
        System.out.println(" + Cross Extreme Signal +");
        System.out.println(" ++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    crossingExtremeSignal( double extremeLow,");
        System.out.println("                           double extremeHigh,");
        System.out.println("                           double firstStochasticLast,");
        System.out.println("                           double firstStochasticPrevious,");
        System.out.println("                           double secondStochasticLast,");
        System.out.println("                           double secondStochasticPrevious )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What trading signal was generate by the Stochastic  Crossing  signal");
        System.out.println("    when: a smoothed Stochastics last value was  65,  and  the  previous");
        System.out.println("    value was 75; and a more sensitive  second  Stochastics  last  value");
        System.out.println("    was 45, and the previous value  was  75?  The  level  at  which  the");
        System.out.println("    Stochastic is believed to indicate an oversold level is 20  and  the");
        System.out.println("    level at which the  Stochastic  is  believed  to  indicate  an  over");
        System.out.println("    brought level is 70.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    extremeLow = 20");
        System.out.println("    extremeHigh = 70");
        System.out.println("    firstStochasticLast = 65");
        System.out.println("    firstStochasticPrevious = 75");
        System.out.println("    secondStochasticLast = 45");
        System.out.println("    secondStochasticPrevious = 75");
        // Here we evaluate what crossing extreme trading signal was generated
        int crossExtremeSignal1 = Stochastics.crossingExtremeSignal(
                20., // extremeLow
                70., // extremeHigh
                65., // firstStochasticLast
                75., // firstStochasticPrevious
                45., // secondStochasticLast
                75. // secondStochasticPrevious
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The trading signal generated was:");
        System.out.println(" ");
        System.out.println("       " + crossExtremeSignal1);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
