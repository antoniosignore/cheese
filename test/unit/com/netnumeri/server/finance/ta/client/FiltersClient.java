package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.Filters;

public class FiltersClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                        ##################################");
        System.out.println("                        # Filters Console Client Example #");
        System.out.println("                        ##################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this example we provide  an  example  for  each  one  of  the");
        System.out.println("    methods within the Filters class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Typical Price of the FTSE100 on 20 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    typicalPrice( double high,");
        System.out.println("                  double low,");
        System.out.println("                  double closing )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the typical price on the FTSE100 on the 20 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = 4373.20");
        System.out.println("    low = 4349.50");
        System.out.println("    closing = 4369.20");
        // Here we evaluate the typical price of the FTSE100 on the 20 Aug 2004.
        double typicalPrice1 = Filters.typicalPrice(
                4373.20, // high
                4349.50, // low
                4369.20 // closing
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The typical price was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == typicalPrice1) ? "NaN" : "" + (int) (10000 * typicalPrice1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Typical Price of the FTSE100 between 20-24 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    typicalPriceOverPeriod( double[] highs,");
        System.out.println("                            double[] lows,");
        System.out.println("                            double[] closing )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the typical price on the FTSE100 between 20  Aug  2004  and");
        System.out.println("    24 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    highs = {4373.2, 4377.4, 4367.3, 4356.2}");
        System.out.println("    lows = {4349.5, 4360.8, 4344.4, 4335.9}");
        System.out.println("    closing = {4369.2, 4360.5, 4366.0, 4350.5}");
        // Here we evaluate the typical price of the FTSE100 between 20 Aug  2004
        // and 24 Aug 2004.
        double[] typicalPriceOverPeriod1 = Filters.typicalPriceOverPeriod(
                new double[]{4373.2, 4377.4, 4367.3, 4356.2}, // highs
                new double[]{4349.5, 4360.8, 4344.4, 4335.9}, // lows
                new double[]{4369.2, 4360.5, 4366.0, 4350.5} // closing
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The typical price over this period was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(typicalPriceOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Median Price of the FTSE100 on 20 Aug 2004 +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    medianPrice( double high,");
        System.out.println("                 double low )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the median price of the FTSE100 on the 20 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = 4373.20");
        System.out.println("    low = 4349.50");
        // Here we evaluate the median price of the FTSE100 on the 20 Aug 2004
        double medianPrice1 = Filters.medianPrice(
                4373.20, // high
                4349.50 // low
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The median price was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == medianPrice1) ? "NaN" : "" + (int) (10000 * medianPrice1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Median Price of the FTSE100 between 20 Aug 2004 and 24 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    medianPriceOverPeriod( double[] highs,");
        System.out.println("                           double[] lows )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the median price of the FTSE100 between  the  20  Aug  2004");
        System.out.println("    and 24 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    highs = {4373.2, 4377.4, 4367.3, 4356.2}");
        System.out.println("    lows = {4349.5, 4360.8, 4344.4, 4335.9}");
        // Here we evaluate the median price of the FTSE100 between 20  Aug  2004
        // and 24 Aug 2004
        double[] medianPriceOverPeriod1 = Filters.medianPriceOverPeriod(
                new double[]{4373.2, 4377.4, 4367.3, 4356.2}, // highs
                new double[]{4349.5, 4360.8, 4344.4, 4335.9} // lows
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The median price over this period was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(medianPriceOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Average Price of the FTSE100 on 20 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    averagePrice( double high,");
        System.out.println("                  double low,");
        System.out.println("                  double open,");
        System.out.println("                  double close )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the average price of the FTSE100 on the 20 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = 4373.20");
        System.out.println("    low = 4349.50");
        System.out.println("    open = 4362.60");
        System.out.println("    close = 4369.20");
        // Here we evaluate the average price of the FTSE100 on the 20 Aug 2004
        double averagePrice1 = Filters.averagePrice(
                4373.20, // high
                4349.50, // low
                4362.60, // open
                4369.20 // close
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The average price was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == averagePrice1) ? "NaN" : "" + (int) (10000 * averagePrice1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Average Price of the FTSE100 between 20 Aug 2004 and 24 Aug 2004 +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    averagePriceOverPeriod( double[] high,");
        System.out.println("                            double[] low,");
        System.out.println("                            double[] open,");
        System.out.println("                            double[] close )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the average price of the FTSE100 between the  20  Aug  2004");
        System.out.println("    and 24 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4373.2, 4377.4, 4367.3, 4356.2}");
        System.out.println("    low = {4349.5, 4360.8, 4344.4, 4335.9}");
        System.out.println("    open = {4362.6, 4355.2, 4358.7, 4336.7}");
        System.out.println("    close = {4369.2, 4362.6, 4355.2, 4340.2}");
        // Here we evaluate the average price of the FTSE100 between 20 Aug  2004
        // and 24 Aug 2004
        double[] averagePriceOverPeriod1 = Filters.averagePriceOverPeriod(
                new double[]{4373.2, 4377.4, 4367.3, 4356.2}, // high
                new double[]{4349.5, 4360.8, 4344.4, 4335.9}, // low
                new double[]{4362.6, 4355.2, 4358.7, 4336.7}, // open
                new double[]{4369.2, 4362.6, 4355.2, 4340.2} // close
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The average price over this period was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(averagePriceOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Price Action Indicator(PAIN) of the FTSE100 on 20 Aug 2004 +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    priceAction( double high,");
        System.out.println("                 double low,");
        System.out.println("                 double open,");
        System.out.println("                 double close )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the Price Action Indicator of the FTSE100  on  the  20  Aug");
        System.out.println("    2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = 4373.20");
        System.out.println("    low = 4349.50");
        System.out.println("    open = 4362.60");
        System.out.println("    close = 4369.20");
        // Here we evaluate the Price Action Indicator of the FTSE100 on  the  20
        // Aug 2004
        double priceAction1 = Filters.priceAction(
                4373.20, // high
                4349.50, // low
                4362.60, // open
                4369.20 // close
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Price Action Indicator was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == priceAction1) ? "NaN" : "" + (int) (10000 * priceAction1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Price Action Indicator(PAIN) of the FTSE100 between 20  Aug  2004  and +");
        System.out.println(" + 24 Aug 2004                                                            +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    priceActionOverPeriod( double[] high,");
        System.out.println("                           double[] low,");
        System.out.println("                           double[] open,");
        System.out.println("                           double[] close )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the PAIN of the FTSE100 between the 20 Aug 2004 and 24  Aug");
        System.out.println("    2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4373.2, 4377.4, 4367.3, 4356.2}");
        System.out.println("    low = {4349.5, 4360.8, 4344.4, 4335.9}");
        System.out.println("    open = {4362.6, 4355.2, 4358.7, 4336.7}");
        System.out.println("    close = {4369.2, 4362.6, 4355.2, 4340.2}");
        // Here we evaluate the Price Action Indicator of the FTSE100 between  20
        // Aug 2004 and 24 Aug 2004
        double[] priceActionOverPeriod1 = Filters.priceActionOverPeriod(
                new double[]{4373.2, 4377.4, 4367.3, 4356.2}, // high
                new double[]{4349.5, 4360.8, 4344.4, 4335.9}, // low
                new double[]{4362.6, 4355.2, 4358.7, 4336.7}, // open
                new double[]{4369.2, 4362.6, 4355.2, 4340.2} // close
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Price Action Indicator over this period was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(priceActionOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Finite Impulse Response(Fir) of the FTSE100 between 20  Aug  2004  and +");
        System.out.println(" + 24 Aug 2004                                                            +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    finiteImpulseResponse( double[] historicalValues,");
        System.out.println("                           double[] weights )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the FIR of the FTSE100 between the 20 Aug 2004 and  24  Aug");
        System.out.println("    2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    historicalValues = {4373.2, 4377.4, 4367.3, 4356.2}");
        System.out.println("    weights = {4.0, 3.0, 2.0, 1.0}");
        // Here we evaluate the Finite Impulse Response of  the  FTSE100  between
        // 20 Aug 2004 and 24 Aug 2004
        double[] fir1 = Filters.finiteImpulseResponse(
                new double[]{4373.2, 4377.4, 4367.3, 4356.2}, // historicalValues
                new double[]{4.0, 3.0, 2.0, 1.0} // weights
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Finite Impulse Response over this period was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(fir1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }

}
