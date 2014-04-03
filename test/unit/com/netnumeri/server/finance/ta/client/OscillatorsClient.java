package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.Oscillators;

public class OscillatorsClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                      ######################################");
        System.out.println("                      # Oscillators Console Client Example #");
        System.out.println("                      ######################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this example we provide  an  example  for  each  one  of  the");
        System.out.println("    methods within the Oscillators class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++");
        System.out.println(" + Money Flow Index +");
        System.out.println(" ++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    moneyFlowIndex( double[] high,");
        System.out.println("                    double[] low,");
        System.out.println("                    double[] closing,");
        System.out.println("                    double[] volume )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the Money Flow Index of  the  FTSE100  from  the  16-20  Aug");
        System.out.println("    2004, when the historical values of the FTSE100 were:");
        System.out.println("    ");
        System.out.println("       - 20-Aug-04: High 4373.20, Low  4349.50,  Close  4369.20,  Volume");
        System.out.println("       928,080,576");
        System.out.println("       - 19-Aug-04: High 4381.40, Low  4353.20,  Close  4362.60,  Volume");
        System.out.println("       1,228,037,760");
        System.out.println("       - 18-Aug-04: High 4360.30, Low  4331.60,  Close  4355.20,  Volume");
        System.out.println("       1,216,893,056");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4373.2, 4381.4, 4360.3}");
        System.out.println("    low = {4349.5, 4353.2, 4331.6}");
        System.out.println("    closing = {4369.2, 4362.6, 4355.2}");
        System.out.println("    volume = {214748.3647, 214748.3647, 214748.3647}");
        // Here we evaluate the Money Flow Index of the FTSE100  from  the  18-20
        // Aug 2004
        double moneyFlow1 = Oscillators.moneyFlowIndex(
                new double[]{4373.2f, 4381.4f, 4360.3f}, // high
                new double[]{4349.5f, 4353.2f, 4331.6f}, // low
                new double[]{4369.2f, 4362.6f, 4355.2f}, // closing
                new double[]{214748.3647f, 214748.3647f, 214748.3647f} // volume
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Money Flow Index was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == moneyFlow1) ? "NaN" : "" + (int) (10000 * moneyFlow1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++");
        System.out.println(" + Money Flow Index Over Period +");
        System.out.println(" ++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    moneyFlowIndexOverPeriod( double[] high,");
        System.out.println("                              double[] low,");
        System.out.println("                              double[] closing,");
        System.out.println("                              double[] volume,");
        System.out.println("                              int lengthOfPeriod )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the Money Flow Indexes of the IBM from the 1-28  March  2002");
        System.out.println("    over all sub-periods with a length 10, when  the  historical  values");
        System.out.println("    of the IBM were:");
        System.out.println("    ");
        System.out.println("       - Date Open High Low Close Volume");
        System.out.println("       - 3/28/2002 103.55 105.14 103.39 104 5347500");
        System.out.println("       - 3/27/2002 103.75 103.79 102.5 103.39 5602400");
        System.out.println("       - 3/26/2002 103.57 105.7 102.3 102.9 8144000");
        System.out.println("       - 3/25/2002 105.8 106.66 103.5 103.56 6277900");
        System.out.println("       - 3/22/2002 106.5 106.7 105.07 105.6 5507900");
        System.out.println("       - 3/21/2002 105.7 106.78 104.7 106.78 5113100");
        System.out.println("       - 3/20/2002 106.9 106.9 105.49 105.5 4844100");
        System.out.println("       - 3/19/2002 106.85 108.05 106.49 107.49 4614800");
        System.out.println("       - 3/18/2002 107.1 108.64 106.23 106.35 5301200");
        System.out.println("       - 3/15/2002 106.55 107.45 105.59 106.79 10864100");
        System.out.println("       - 3/14/2002 107.02 107.95 106.59 106.6 5335500");
        System.out.println("       - 3/13/2002 108.3 108.65 106.7 107.18 6409200");
        System.out.println("       - 3/12/2002 105.52 108.85 105.51 108.5 11059300");
        System.out.println("       - 3/11/2002 104.35 105.97 103.6 105.24 8639100");
        System.out.println("       - 3/8/2002 104.82 107.34 104.82 105.09 10726400");
        System.out.println("       - 3/7/2002 107.3 107.5 103.24 103.71 10971900");
        System.out.println("       - 3/6/2002 105.15 107.09 104.75 106.3 7687400");
        System.out.println("       - 3/5/2002 104.25 106.5 104.16 105.67 7562100");
        System.out.println("       - 3/4/2002 103.35 106.53 103.13 105.9 10767700");
        System.out.println("       - 3/1/2002 98.6 103.1 98.5 103.02 10492900");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9, 108.05, 108.64, 107.45, 107.95, 108.65, 108.85, 105.97, 107.34, 107.5, 107.09, 106.5, 106.53, 103.1}");
        System.out.println("    low = {103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49, 106.49, 106.23, 105.59, 106.59, 106.7, 105.51, 103.6, 104.8199, 103.24, 104.75, 104.16, 103.13, 98.5}");
        System.out.println("    closing = {104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5, 107.49, 106.35, 106.79, 106.6, 107.18, 108.5, 105.24, 105.09, 103.7099, 106.3, 105.67, 105.9, 103.02}");
        System.out.println("    volume = {214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        System.out.println("    lengthOfPeriod = 10");
        // Here we evaluate the Money Flow Index of the IBM stock from  the  1-28
        // March 2002 over all subperiods with a length 10.
        double[] moneyFlowOverPeriod1 = Oscillators.moneyFlowIndexOverPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9, 108.05, 108.64, 107.45, 107.95, 108.65, 108.85, 105.97, 107.34, 107.5, 107.09, 106.5, 106.53, 103.1}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49, 106.49, 106.23, 105.59, 106.59, 106.7, 105.51, 103.6, 104.8199, 103.24, 104.75, 104.16, 103.13, 98.5}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5, 107.49, 106.35, 106.79, 106.6, 107.18, 108.5, 105.24, 105.09, 103.7099, 106.3, 105.67, 105.9, 103.02}, // closing
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647}, // volume
                10 // lengthOfPeriod
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Money Flow Indexes was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(moneyFlowOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++");
        System.out.println(" + Rate of Change (ROC) Indicator +");
        System.out.println(" ++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    rateOfChange( double close,");
        System.out.println("                  double nPrice )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the 5-day Rate of Change (ROC) of the FTSE100 on the 20  Aug");
        System.out.println("    2004, when the closing price on the 20 Aug 2005 = 4369.20,  and  the");
        System.out.println("    closing price 5 previous trading days on the 13 Aug 2004  =  4301.50");
        System.out.println("    ?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    close = 4369.20");
        System.out.println("    nPrice = 4301.50");
        // Here we evaluate the 5-day Rate of Change Indicator of the FTSE100
        double rateOfChange1 = Oscillators.rateOfChange(
                4369.20, // close
                4301.50 // nPrice
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The 5-day Rate of Change was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == rateOfChange1) ? "NaN" : "" + (int) (10000 * rateOfChange1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Rate of Change for all periods (ROC) Indicator +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    rateOfChangePeriod( double[] closes,");
        System.out.println("                        int noPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the 5-day Rate of Change (ROC) of the  FTSE100  on  the  20,");
        System.out.println("    19, 18 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    closes = {4369.2, 4340.6, 4298.1, 4349.5, 4356.6, 4390.2, 4380.9, 4340.89}");
        System.out.println("    noPeriods = 5");
        // Here we evaluate the 5-day Rate of Change Indicator of the FTSE100
        double[] rateOfChange2 = Oscillators.rateOfChangePeriod(
                new double[]{4369.2, 4340.6, 4298.1, 4349.5, 4356.6, 4390.2, 4380.9, 4340.89}, // closes
                5 // noPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The 5-day Rate of Change was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(rateOfChange2, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++");
        System.out.println(" + Relative Strength Index (RelativeStrengthIndex) +");
        System.out.println(" +++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    relativeStrengthIndex( double[] close,");
        System.out.println("                           int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the 14-period Relative  Strength  Index  for  the  given  19");
        System.out.println("    closing prices?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    close = {43.6875, 44.875, 43.5625, 43.0625, 45.6875, 46.6875, 47.6875, 46.3125, 44.5625, 47.0, 47.5625, 47.8125, 45.75, 44.625, 44.25, 44.9375, 46.9375, 46.4375, 47.125, 46.125}");
        System.out.println("    noOfPeriods = 14");
        // Here we calculate the 14-period RelativeStrengthIndex
        double[] rsi1 = Oscillators.relativeStrengthIndex(
                new double[]{43.6875, 44.875, 43.5625, 43.0625, 45.6875, 46.6875, 47.6875, 46.3125, 44.5625, 47.0, 47.5625, 47.8125, 45.75, 44.625, 44.25, 44.9375, 46.9375, 46.4375, 47.125, 46.125}, // close
                14 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The 14-period Relative Strength Index is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(rsi1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
