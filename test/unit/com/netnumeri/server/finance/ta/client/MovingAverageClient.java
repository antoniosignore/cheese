package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.MovingAverage;

public class MovingAverageClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                     ########################################");
        System.out.println("                     # MovingAverage Console Client Example #");
        System.out.println("                     ########################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this examples we provide an example for each of  the  methods");
        System.out.println("    within the Moving Average Class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Simple Moving Average (MA) of a given period +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    simpleMovingAverage( double[] historicalValues,");
        System.out.println("                         int lengthOfMovingAverage )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What were the simple moving averages for  IBM  between  19-28  March");
        System.out.println("    2002 over a five day period? The historical prices for  that  period");
        System.out.println("    were:");
        System.out.println("    ");
        System.out.println("       - 28 March: 103.55");
        System.out.println("       - 27 March: 103.75");
        System.out.println("       - 26 March: 103.57");
        System.out.println("       - 25 March: 105.8");
        System.out.println("       - 24 March: 106.5");
        System.out.println("       - 23 March: 105.7");
        System.out.println("       - 22 March: 106.9");
        System.out.println("       - 21 March: 106.85");
        System.out.println("       - 20 March: 107.1");
        System.out.println("       - 19 March: 106.55");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    historicalValues = {103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}");
        System.out.println("    lengthOfMovingAverage = 5");
        // Calculates the arithmetic (or simple) Moving Average (MA) of  a  given
        // period for all possible data points (i.e. periods) for which there  is
        // sufficient historical data provided.
        double[] simpleMovingAverage1 = MovingAverage.simpleMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}, // historicalValues
                5 // lengthOfMovingAverage
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The moving averages for the given period were:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(simpleMovingAverage1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++");
        System.out.println(" + Geometric Moving Average +");
        System.out.println(" ++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    geometricMovingAverage( double[] historicalValues,");
        System.out.println("                            int lengthOfMovingAverage )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was GMA for IBM between 19-28 March 2002  evaluated  over  a  5");
        System.out.println("    day period? The historical prices for that period were:");
        System.out.println("    ");
        System.out.println("       - 28 March: 103.55");
        System.out.println("       - 27 March: 103.75");
        System.out.println("       - 26 March: 103.57");
        System.out.println("       - 25 March: 105.8");
        System.out.println("       - 24 March: 106.5");
        System.out.println("       - 23 March: 105.7");
        System.out.println("       - 22 March: 106.9");
        System.out.println("       - 21 March: 106.85");
        System.out.println("       - 20 March: 107.1");
        System.out.println("       - 19 March: 106.55");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    historicalValues = {103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}");
        System.out.println("    lengthOfMovingAverage = 5");
        // Calculates the Geometric Moving Average (GMA) for a given  period  for
        // all possible data points (i.e. periods) for which there is  sufficient
        // historical data provided.
        double[] geometricMA1 = MovingAverage.geometricMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}, // historicalValues
                5 // lengthOfMovingAverage
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The GMA was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(geometricMA1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Weighted Moving Average With Shifting Weights +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    weightedXDayMovingAverage( double[] historicalPrices,");
        System.out.println("                               double[] weights )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the wighted moving average with shifting  weights  for  IBM");
        System.out.println("    between 19-28 March 2002 if the weights were 1,  2,  3,  4,  5?  The");
        System.out.println("    historical prices for that period were:");
        System.out.println("    ");
        System.out.println("       - 28 March: 103.55");
        System.out.println("       - 27 March: 103.75");
        System.out.println("       - 26 March: 103.57");
        System.out.println("       - 25 March: 105.8");
        System.out.println("       - 24 March: 106.5");
        System.out.println("       - 23 March: 105.7");
        System.out.println("       - 22 March: 106.9");
        System.out.println("       - 21 March: 106.85");
        System.out.println("       - 20 March: 107.1");
        System.out.println("       - 19 March: 106.55");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    historicalPrices = {103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}");
        System.out.println("    weights = {1.0, 2.0, 3.0, 4.0, 5.0}");
        // Here we evaluate the Weighted Moving  Average  (WMA)  where  for  each
        // period for which  the  WMA  is  evaluated  the  historical  terms  are
        // weighted in accordance with the same set of weights.
        double[] weightedMA1 = MovingAverage.weightedXDayMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}, // historicalPrices
                new double[]{1.0, 2.0, 3.0, 4.0, 5.0} // weights
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The array of weighted moving average with shifting weights was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(weightedMA1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++");
        System.out.println(" + Weighted Moving Average +");
        System.out.println(" +++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    weightedXDayMovingAverage( double[] historicalPrices,");
        System.out.println("                               double[] weights,");
        System.out.println("                               int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the wighted moving average for IBM between 19-28  March  if");
        System.out.println("    the wights were 1, 2, 3, 4, 5, 5, 4, 3, 2,  1,  and  the  number  of");
        System.out.println("    periods over which the weighted moving average is  evaluated  is  5.");
        System.out.println("    The historical prices for that period were:");
        System.out.println("    ");
        System.out.println("       - 28 March: 103.55");
        System.out.println("       - 27 March: 103.75");
        System.out.println("       - 26 March: 103.57");
        System.out.println("       - 25 March: 105.8");
        System.out.println("       - 24 March: 106.5");
        System.out.println("       - 23 March: 105.7");
        System.out.println("       - 22 March: 106.9");
        System.out.println("       - 21 March: 106.85");
        System.out.println("       - 20 March: 107.1");
        System.out.println("       - 19 March: 106.55");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    historicalPrices = {103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}");
        System.out.println("    weights = {1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 4.0, 3.0, 2.0, 1.0}");
        System.out.println("    lengthOfMA = 5");
        // Evaluate    the  Weighted  Moving  Average  (WMA)  where  the  weights
        // associated to all the elements of the historical values are given  and
        // the WMA is evaluated for all periods for  which  there  is  sufficient
        // historical data.
        double[] weightedMA2 = MovingAverage.weightedXDayMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}, // historicalPrices
                new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 4.0, 3.0, 2.0, 1.0}, // weights
                5 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The weighted moving average was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(weightedMA2, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Linearly Weighted Moving Average (LWMA) +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    linearlyWeightedMovingAverage( double[] priceSeries,");
        System.out.println("                                   int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the linearly weighted moving average for IBM between  19-28");
        System.out.println("    March 2002 evaluated over a 5 day period? The historical prices  for");
        System.out.println("    that period were:");
        System.out.println("    ");
        System.out.println("       - 28 March: 103.55");
        System.out.println("       - 27 March: 103.75");
        System.out.println("       - 26 March: 103.57");
        System.out.println("       - 25 March: 105.8");
        System.out.println("       - 24 March: 106.5");
        System.out.println("       - 23 March: 105.7");
        System.out.println("       - 22 March: 106.9");
        System.out.println("       - 21 March: 106.85");
        System.out.println("       - 20 March: 107.1");
        System.out.println("       - 19 March: 106.55");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    priceSeries = {103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}");
        System.out.println("    lengthOfMA = 5");
        // Returns the value of the Linearly Weighted Moving Average  (LWMA)  for
        // all periods for which sufficient historical data is provided.
        double[] linearyWeightedMA1 = MovingAverage.linearlyWeightedMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}, // priceSeries
                5 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The linearly weighted moving average was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(linearyWeightedMA1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Exponentially Weighted Moving Average +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    exponentiallyWeightedMovingAverage( double[] timeSeries,");
        System.out.println("                                        double smoothingFactor,");
        System.out.println("                                        int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the exponentially weighted moving average for  IBM  between");
        System.out.println("    19-28 March 2002  evaluated  over  a  5  day  period  considering  a");
        System.out.println("    period factor of 0.001? The historical  prices  for  that  period");
        System.out.println("    were:");
        System.out.println("    ");
        System.out.println("       - 28 March: 103.55");
        System.out.println("       - 27 March: 103.75");
        System.out.println("       - 26 March: 103.57");
        System.out.println("       - 25 March: 105.8");
        System.out.println("       - 24 March: 106.5");
        System.out.println("       - 23 March: 105.7");
        System.out.println("       - 22 March: 106.9");
        System.out.println("       - 21 March: 106.85");
        System.out.println("       - 20 March: 107.1");
        System.out.println("       - 19 March: 106.55");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    timeSeries = {103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}");
        System.out.println("    smoothingFactor = 0.001");
        System.out.println("    lengthOfMA = 5");
        // Evaluates the (x-day) Exponentially Weighted Moving Average (EWMA)  of
        // a time series provided where x is the length of the time series  array
        // which   is  provided  as  a  parameter,  for  all  periods  for  which
        // sufficient data is provided.
        double[] exponentiallyWeightedMA1 = MovingAverage.exponentiallyWeightedMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}, // timeSeries
                0.001, // smoothingFactor
                5 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The exponentially weighted moving average:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(exponentiallyWeightedMA1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++");
        System.out.println(" + Triangular Moving Average (TMA) +");
        System.out.println(" +++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    triangularMovingAverage( double[] timeSeries,");
        System.out.println("                             int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the TMA for IBM between 19-28 March 2002 evaluated  over  a");
        System.out.println("    5 day period? The historical prices for that period were:");
        System.out.println("    ");
        System.out.println("       - 28 March: 103.55");
        System.out.println("       - 27 March: 103.75");
        System.out.println("       - 26 March: 103.57");
        System.out.println("       - 25 March: 105.8");
        System.out.println("       - 24 March: 106.5");
        System.out.println("       - 23 March: 105.7");
        System.out.println("       - 22 March: 106.9");
        System.out.println("       - 21 March: 106.85");
        System.out.println("       - 20 March: 107.1");
        System.out.println("       - 19 March: 106.55");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    timeSeries = {103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}");
        System.out.println("    lengthOfMA = 5");
        // Evaluates  the  x-period  Triangular  Moving  Average  (TMA)  where  x
        // corresponds to the  length  of  the  time  series  array  given  as  a
        // parameter, for all periods for which sufficient data is provided.
        double[] triangularMA1 = MovingAverage.triangularMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}, // timeSeries
                5 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The TMA was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(triangularMA1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++");
        System.out.println(" + Median Moving Average +");
        System.out.println(" +++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    medianMovingAverage( double[] high,");
        System.out.println("                         double[] low,");
        System.out.println("                         int lengthOfMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the median moving average for IBM between 16-25 March  2002");
        System.out.println("    evaluated over a 5 day period? The highest and lowest market  prices");
        System.out.println("    for that period were:");
        System.out.println("    Date   High  Low  25-Mar-02  106.66  103.39  24-Mar-02  106.7  102.5");
        System.out.println("    23-Mar-02 106.78 102.3 22-Mar-02 106.9 103.5 21-Mar-02 108.64  104.7");
        System.out.println("    20-Mar-02 107.45 105.49 19-Mar-02  107.95  106.49  18-Mar-02  108.65");
        System.out.println("    106.23 17-Mar-02 108.85 105.59 16-Mar-02 105.97 106.59");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {106.66, 106.7, 106.78, 106.9, 108.05, 108.64, 107.45, 107.95, 108.65, 108.85, 105.97}");
        System.out.println("    low = {103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49, 106.49, 106.23, 105.59, 106.59}");
        System.out.println("    lengthOfMA = 5");
        // Evaluates the Median Moving Average of a  given  period  of  the  data
        // series provided for all possible periods for the data given.
        double[] medianMA1 = MovingAverage.medianMovingAverage(
                new double[]{106.66, 106.7, 106.78, 106.9, 108.05, 108.64, 107.45, 107.95, 108.65, 108.85, 105.97}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49, 106.49, 106.23, 105.59, 106.59}, // low
                5 // lengthOfMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The median moving average was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(medianMA1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++");
        System.out.println(" + The Kairi Indicator +");
        System.out.println(" +++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    kairi( double[] movingAverage,");
        System.out.println("           double[] prices )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    ");
        System.out.println("    What  were  Kairi  Indicators  for  IBM  between  19-28  March  2002");
        System.out.println("    calculated using the simple moving average?  The  historical  prices");
        System.out.println("    for that period were:");
        System.out.println("    ");
        System.out.println("       - 28 March: 103.55");
        System.out.println("       - 27 March: 103.75");
        System.out.println("       - 26 March: 103.57");
        System.out.println("       - 25 March: 105.8");
        System.out.println("       - 24 March: 106.5");
        System.out.println("       - 23 March: 105.7");
        System.out.println("       - 22 March: 106.9");
        System.out.println("       - 21 March: 106.85");
        System.out.println("       - 20 March: 107.1");
        System.out.println("       - 19 March: 106.55");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    movingAverage = coeffMA1");
        System.out.println("    prices = {103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}");
        // Here we evaluate the simple moving average of the underlaying asset.
        double[] coeffMA1 = MovingAverage.simpleMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}, // historicalValues
                5 // lengthOfMovingAverage
        );
        // Here we calculate the Kairi Indicator measure as a percentage  of  the
        // price, the divergence between the  a  moving  average  (generally  the
        // simple moving average) of the price and  the  price  itself  for  each
        // period for which there is sufficient historical values.
        double[] kairi1 = MovingAverage.kairi(
                coeffMA1, // movingAverage
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55} // prices
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Kairi Indicators were:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(kairi1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++");
        System.out.println(" + Simple Crossing Signal +");
        System.out.println(" ++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    simpleCrossingSignal( double lastShortMA,");
        System.out.println("                          double previousShortMA,");
        System.out.println("                          double lastLongMA,");
        System.out.println("                          double previousLongMA )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the crossing signal for IBM on  28  March  2002  calculated");
        System.out.println("    using one short moving average over  3  days  and  one  long  simple");
        System.out.println("    moving average over 9 days? The historical prices  for  that  period");
        System.out.println("    were:");
        System.out.println("    ");
        System.out.println("       - 28 March: 103.55");
        System.out.println("       - 27 March: 103.75");
        System.out.println("       - 26 March: 103.57");
        System.out.println("       - 25 March: 105.8");
        System.out.println("       - 24 March: 106.5");
        System.out.println("       - 23 March: 105.7");
        System.out.println("       - 22 March: 106.9");
        System.out.println("       - 21 March: 106.85");
        System.out.println("       - 20 March: 107.1");
        System.out.println("       - 19 March: 106.55");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    lastShortMA = coeffShortMA_0");
        System.out.println("    previousShortMA = coeffShortMA_1");
        System.out.println("    lastLongMA = coeffLongMA_0");
        System.out.println("    previousLongMA = coeffLongMA_1");
        // Here we  calculate  the  coefficients  of  the  short  moving  average
        // evaluated over a period of three days.
        double[] coeffShortMA = MovingAverage.simpleMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5}, // historicalValues
                3 // lengthOfMovingAverage
        );
        // Here  we  calculate  the  coefficients  of  the  long  moving  average
        // evaluated over a period of nine days.
        double[] coeffLongMA = MovingAverage.simpleMovingAverage(
                new double[]{103.55, 103.75, 103.5699, 105.8, 106.5, 105.7, 106.9, 106.85, 107.1, 106.55}, // historicalValues
                9 // lengthOfMovingAverage
        );
        // Returns the first term of the array.
        double coeffShortMA_0 = MovingAverage.selectElementOfArray(
                coeffShortMA, // array
                0 // index
        );
        // Returns the second term of the array.
        double coeffShortMA_1 = MovingAverage.selectElementOfArray(
                coeffShortMA, // array
                1 // index
        );
        // Returns the first term of the array.
        double coeffLongMA_0 = MovingAverage.selectElementOfArray(
                coeffLongMA, // array
                0 // index
        );
        // Returns the first term of te array.
        double coeffLongMA_1 = MovingAverage.selectElementOfArray(
                coeffLongMA, // array
                1 // index
        );
        // Here we generate the trading signal  in  accordance  with  the  Simple
        // crossing two moving average trading system.
        int simpleCrossingSignal1 = MovingAverage.simpleCrossingSignal(
                coeffShortMA_0, // lastShortMA
                coeffShortMA_1, // previousShortMA
                coeffLongMA_0, // lastLongMA
                coeffLongMA_1 // previousLongMA
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The crossing signal was:");
        System.out.println(" ");
        System.out.println("       " + simpleCrossingSignal1);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }

}
