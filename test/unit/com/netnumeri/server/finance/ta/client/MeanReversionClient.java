package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.MeanReversion;

public class MeanReversionClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                     ########################################");
        System.out.println("                     # MeanReversion Console Client Example #");
        System.out.println("                     ########################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this example we provide  an  example  for  each  one  of  the");
        System.out.println("    methods within the MeanReversion class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++");
        System.out.println(" + Commodity Channel Index +");
        System.out.println(" +++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    commodityChannelIndex( double[] high,");
        System.out.println("                           double[] low,");
        System.out.println("                           double[] closing )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    If the price of the nearest Brent crude  oil  future  contract  over");
        System.out.println("    three days is:");
        System.out.println("    ");
        System.out.println("       - 1st Day: High = 28.23, Low = 27.59, Close = 27.69");
        System.out.println("       - 2nd Day: High = 29.48, Low = 27.40, Close = 29.37");
        System.out.println("       - 3rd Day: High = 30.12, Low = 29.37, Close = 30.12");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println("    Then what is the Commodity  Channel  index  with  request  to  these");
        System.out.println("    three     days?  Note,  that  broadly  speaking  the  oil  is  being");
        System.out.println("    accumulated by the market and the three days  over-all  represent  a");
        System.out.println("    solid up-trend.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {30.12, 29.48, 28.23}");
        System.out.println("    low = {29.37, 27.4, 27.59}");
        System.out.println("    closing = {30.12, 29.37, 27.69}");
        // Here we evaluate the Commodity Channel Index over the three days.
        double commodityChannelINdex1 = MeanReversion.commodityChannelIndex(
                new double[]{30.12, 29.48, 28.23}, // high
                new double[]{29.37, 27.4, 27.59}, // low
                new double[]{30.12, 29.37, 27.69} // closing
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Commodity Channel Index over the three days is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == commodityChannelINdex1) ? "NaN" : "" + (int) (10000 * commodityChannelINdex1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Commodity Channel Index Over Periods +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    commodityChannelIndexOverPeriod( double[] high,");
        System.out.println("                                     double[] low,");
        System.out.println("                                     double[] closing,");
        System.out.println("                                     int length )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    If the price of the nearest Brent crude  oil  future  contract  over");
        System.out.println("    five days is:");
        System.out.println("    ");
        System.out.println("       - 1st Day: High = 28.23, Low = 27.59, Close = 27.69");
        System.out.println("       - 2nd Day: High = 29.48, Low = 27.40, Close = 29.37");
        System.out.println("       - 3rd Day: High = 30.12, Low = 29.37, Close = 30.12");
        System.out.println("       - 4th Day: High = 27.23, Low = 26.87, Close = 27.01");
        System.out.println("       - 5th Day: High = 29.01, Low = 27.80, Close = 28.10");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println("    Then what is the Commodity Channel indexes  with  request  to  these");
        System.out.println("    five days over all sub-periods with a length 2?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {29.01, 27.23, 30.12, 29.48, 28.23}");
        System.out.println("    low = {27.8, 26.87, 29.37, 27.4, 27.59}");
        System.out.println("    closing = {28.1, 27.01, 30.12, 29.37, 27.69}");
        System.out.println("    length = 2");
        // Here we evaluate the Commodity Channel Index over the five  days  over
        // all subperiods with a length 2.
        double[] commodityChannelINdexOverPeriod1 = MeanReversion.commodityChannelIndexOverPeriod(
                new double[]{29.01, 27.23, 30.12, 29.48, 28.23}, // high
                new double[]{27.8, 26.87, 29.37, 27.4, 27.59}, // low
                new double[]{28.1, 27.01, 30.12, 29.37, 27.69}, // closing
                2 // length
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Commodity Channel Indexes over the five days is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(commodityChannelINdexOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
