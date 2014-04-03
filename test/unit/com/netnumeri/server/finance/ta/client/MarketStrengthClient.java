package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.MarketStrength;

public class MarketStrengthClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                    #########################################");
        System.out.println("                    # MarketStrength Console Client Example #");
        System.out.println("                    #########################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this example we provide  an  example  for  each  one  of  the");
        System.out.println("    methods within the MarketStrength class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Balance of Power Indicator of the FTSE100 on 18-20 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    balanceOfPower( double open,");
        System.out.println("                    double close,");
        System.out.println("                    double high,");
        System.out.println("                    double low )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the Balance of Power  indicator  for  the  FTSE100  between");
        System.out.println("    18-20 Aug 2004,  when  the  FTSE100  had  the  following  historical");
        System.out.println("    values:");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    Date Open High Low Close Volume Adj. Close");
        System.out.println("    ");
        System.out.println("    20-Aug-04 4,362.60 4,373.20 4,349.50 4,369.20 928,080,576 4,369.20");
        System.out.println("    ");
        System.out.println("    19-Aug-04      4,355.20  4,381.40  4,353.20  4,362.60  1,228,037,760");
        System.out.println("    4,362.60");
        System.out.println("    ");
        System.out.println("    18-Aug-04      4,358.70  4,360.30  4,331.60  4,355.20  1,216,893,056");
        System.out.println("    4,355.20");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    open = 4362.60");
        System.out.println("    close = 4369.20");
        System.out.println("    high = 4373.20");
        System.out.println("    low = 4349.50");
        // Here we evaluate the Balance of Power for the FTSE100 on  the  20  Aug
        // 2004
        double balanceOfPower1 = MarketStrength.balanceOfPower(
                4362.60, // open
                4369.20, // close
                4373.20, // high
                4349.50 // low
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Balance of Power on the 20 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == balanceOfPower1) ? "NaN" : "" + (int) (10000 * balanceOfPower1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Balance of Power Indicator of the FTSE100 on 18-20 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    balanceOfPower( double open,");
        System.out.println("                    double close,");
        System.out.println("                    double high,");
        System.out.println("                    double low )");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    open = 4355.20");
        System.out.println("    close = 4362.60");
        System.out.println("    high = 4381.40");
        System.out.println("    low = 4353.20");
        // Here we evaluate the Balance of Power for the FTSE100 on  the  19  Aug
        // 2004
        double balanceOfPower2 = MarketStrength.balanceOfPower(
                4355.20, // open
                4362.60, // close
                4381.40, // high
                4353.20 // low
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Balance of Power on the 19 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == balanceOfPower2) ? "NaN" : "" + (int) (10000 * balanceOfPower2) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Balance of Power Indicator of the FTSE100 on 18-20 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    balanceOfPower( double open,");
        System.out.println("                    double close,");
        System.out.println("                    double high,");
        System.out.println("                    double low )");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    open = 4358.70");
        System.out.println("    close = 4355.20");
        System.out.println("    high = 4360.30");
        System.out.println("    low = 4331.60");
        // Here we evaluate the Balance of Power for the FTSE100 on  the  18  Aug
        // 2004
        double balanceOfPower3 = MarketStrength.balanceOfPower(
                4358.70, // open
                4355.20, // close
                4360.30, // high
                4331.60 // low
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Balance of Power on the 18 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == balanceOfPower3) ? "NaN" : "" + (int) (10000 * balanceOfPower3) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Balance of Power Indicators of the FTSE100 on 18-20 Aug 2004 +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    balanceOfPowerOverPeriod( double[] open,");
        System.out.println("                              double[] close,");
        System.out.println("                              double[] high,");
        System.out.println("                              double[] low )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    ");
        System.out.println("    What was the Balance of Power  indicator  for  the  FTSE100  between");
        System.out.println("    18-20 Aug 2004,  when  the  FTSE100  had  the  following  historical");
        System.out.println("    values:");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    Date Open High Low Close Volume Adj. Close");
        System.out.println("    ");
        System.out.println("    20-Aug-04 4,362.60 4,373.20 4,349.50 4,369.20 928,080,576 4,369.20");
        System.out.println("    ");
        System.out.println("    19-Aug-04      4,355.20  4,381.40  4,353.20  4,362.60  1,228,037,760");
        System.out.println("    4,362.60");
        System.out.println("    ");
        System.out.println("    18-Aug-04      4,358.70  4,360.30  4,331.60  4,355.20  1,216,893,056");
        System.out.println("    4,355.20");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    open = {4362.6, 4355.2, 4358.7}");
        System.out.println("    close = {4369.2, 4362.6, 4355.2}");
        System.out.println("    high = {4373.2, 4381.4, 4360.3}");
        System.out.println("    low = {4349.5, 4353.2, 4331.6}");
        // Here we evaluate the Balance of Power for the  FTSE100  between  18-20
        // Aug 2004
        double[] balanceOfPowerOverall = MarketStrength.balanceOfPowerOverPeriod(
                new double[]{4362.6, 4355.2, 4358.7}, // open
                new double[]{4369.2, 4362.6, 4355.2}, // close
                new double[]{4373.2, 4381.4, 4360.3}, // high
                new double[]{4349.5, 4353.2, 4331.6} // low
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Balance of Power between 18-20 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(balanceOfPowerOverall, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Market Facilitation Index of the FTSE100 on 18 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    marketFacilitationIndex( double high,");
        System.out.println("                             double low,");
        System.out.println("                             double volume )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    ");
        System.out.println("    What is the Market Facilitation Index(MFI) for the  FTSE100  on  18n");
        System.out.println("    Aug 2004, when the FTSE100 had the following historical values:");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    Date Open High Low Close Volume Adj. Close");
        System.out.println("    ");
        System.out.println("    18-Aug-04      4,358.70  4,360.30  4,331.60  4,355.20  1,216,893.056");
        System.out.println("    4,355.20");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = 4360.30");
        System.out.println("    low = 4331.60");
        System.out.println("    volume = 1216893056");
        // Here we evaluate the Market Facilitation Index for the FTSE100 on  the
        // 18 Aug 2004
        double mfi1 = MarketStrength.marketFacilitationIndex(
                4360.30, // high
                4331.60, // low
                1216893056. // volume
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Market Facilitation Index on the 18 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == mfi1) ? "NaN" : "" + (int) (10000 * mfi1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Market Facilitation Index Indicators of the FTSE100 on 18-20 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    marketFacilitationIndexOverPeriod( double[] high,");
        System.out.println("                                       double[] low,");
        System.out.println("                                       double[] volume )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    ");
        System.out.println("    What was the Market Facilitation Index  indicator  for  the  FTSE100");
        System.out.println("    between   18-20  Aug  2004,  when  the  FTSE100  had  the  following");
        System.out.println("    historical values:");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    Date Open High Low Close Volume Mil.");
        System.out.println("    ");
        System.out.println("    20-Aug-04 4,362.60 4,373.20 4,349.50 4,369.20 928");
        System.out.println("    ");
        System.out.println("    19-Aug-04 4,355.20 4,381.40 4,353.20 4,362.60 1,228");
        System.out.println("    ");
        System.out.println("    18-Aug-04 4,358.70 4,360.30 4,331.60 4,355.20 1,216");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4373.2, 4381.4, 4360.3}");
        System.out.println("    low = {4349.5, 4353.2, 4331.6}");
        System.out.println("    volume = {928.0, 1228.0, 1216.0}");
        // Here we  evaluate  the  Market  Facilitation  Index  for  the  FTSE100
        // between 18-20 Aug 2004
        double[] mfiOverall = MarketStrength.marketFacilitationIndexOverPeriod(
                new double[]{4373.2, 4381.4, 4360.3}, // high
                new double[]{4349.5, 4353.2, 4331.6}, // low
                new double[]{928.0, 1228.0, 1216.0} // volume
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Market Facilitation Index between 18-20 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(mfiOverall, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
