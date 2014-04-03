package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.Volatility;

public class VolatilityClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                      #####################################");
        System.out.println("                      # Volatility Console Client Example #");
        System.out.println("                      #####################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    This client example illustrations the use of the Volatility class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++");
        System.out.println(" + Chaikin Volatility +");
        System.out.println(" ++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    chaikinVolatility( double[] highs,");
        System.out.println("                       double[] lows,");
        System.out.println("                       int lengthOfMA,");
        System.out.println("                       int noOfPeriods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Evaluate the Chaikin volatility  indicator  for  IBM  stock  between");
        System.out.println("    20-28 March 2002 knowing the following values:");
        System.out.println("    ");
        System.out.println("       - Date High Low");
        System.out.println("       - 3/28/2002 105.14 103.39");
        System.out.println("       - 3/27/2002 103.79 102.5");
        System.out.println("       - 3/26/2002 105.7 102.3");
        System.out.println("       - 3/25/2002 106.66 103.5");
        System.out.println("       - 3/22/2002 106.7 105.07");
        System.out.println("       - 3/21/2002 106.78 104.7");
        System.out.println("       - 3/20/2002 106.9 105.4");
        System.out.println("       - 3/19/2002 107.1 106.7");
        System.out.println("       - 3/18/2002 107.4 106.6");
        System.out.println("       - 2/17/2002 107.3 106.5");
        System.out.println("       ");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println("    The moving average is calculated over a period of 5 days.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    highs = {105.14, 103.79, 105.7, 105.66, 106.7, 106.78, 106.9, 107.1, 107.4, 107.3}");
        System.out.println("    lows = {103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49, 106.7, 106.6, 106.5}");
        System.out.println("    lengthOfMA = 5");
        System.out.println("    noOfPeriods = 2");
        // Here we evaluate the  Chaikin  volatility  indicator  for  IBM  stocks
        // between 20-28 March 2002.
        double[] chaikin1 = Volatility.chaikinVolatility(
                new double[]{105.14, 103.79, 105.7, 105.66, 106.7, 106.78, 106.9, 107.1, 107.4, 107.3}, // highs
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49, 106.7, 106.6, 106.5}, // lows
                5, // lengthOfMA
                2 // noOfPeriods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Chaikin volatility indicator for the given period were:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(chaikin1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Historical estimate of the present volatility +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    historicalEstimate( double[] assetPrices )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    ");
        System.out.println("    What is the historical estimate of the present volatility  when  the");
        System.out.println("    assets price at the end of each interval where: 100, 101,  104,  102");
        System.out.println("    and 99?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    assetPrices = {100.0, 101.0, 104.0, 102.0, 99.0}");
        // Estimate  (present)  volatility  per  interval  expressed  in  decimal
        // format (i.e. 1 percent = 0.01) using the price  data  at  the  end  of
        // equal time intervals  of  an  investment  asset  which  does  not  pay
        // dividends or interest payments.
        double historicalEstimate1 = Volatility.historicalEstimate(
                new double[]{100.0, 101.0, 104.0, 102.0, 99.0} // assetPrices
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The historical estimate of the present volatility is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == historicalEstimate1) ? "NaN" : "" + (int) (10000 * historicalEstimate1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Historical estimate of the present volatility taking into account  the +");
        System.out.println(" + dividends                                                              +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    historicalEstimateWithDividends( double[] assetPrices,");
        System.out.println("                                     double[] dividendsPaid )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    ");
        System.out.println("    What is the historical estimate of the present volatility  when  the");
        System.out.println("    assets price at the end of each interval where: 100, 101,  104,  102");
        System.out.println("    and 99 and the dividends  (or  interest  payments)  from  the  asset");
        System.out.println("    within each period where: 4, 0, 0, 0, 5?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    assetPrices = {100.0, 101.0, 104.0, 102.0, 99.0}");
        System.out.println("    dividendsPaid = {4.0, 0.0, 0.0, 0.0, 5.0}");
        // Calculates the historical estimate of the  present  volatility  taking
        // into account the dividends or  interest  payments  of  the  underlying
        // asset.
        double historicalEstimateWithDividends1 = Volatility.historicalEstimateWithDividends(
                new double[]{100.0, 101.0, 104.0, 102.0, 99.0}, // assetPrices
                new double[]{4.0, 0.0, 0.0, 0.0, 5.0} // dividendsPaid
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The historical estimate of the present volatility with dividends is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == historicalEstimateWithDividends1) ? "NaN" : "" + (int) (10000 * historicalEstimateWithDividends1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Returns the estimate of the standard error of the standard  historical +");
        System.out.println(" + estimation                                                             +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    historicalEstimateStandardError( double numberOfPeriods,");
        System.out.println("                                     double volatilityEstimate )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    ");
        System.out.println("    What is the  standard  error  of  the  historical  estimate  of  the");
        System.out.println("    volatility, when the volatility is estimated using 180 days of  data");
        System.out.println("    and the volatility found was 0.04 (or 4 percent)?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    numberOfPeriods = 180");
        System.out.println("    volatilityEstimate = 0.04");
        // Returns the estimate of the standard error of the standard  historical
        // estimation given by  the  functions  volatilityHistoricalEstimate  and
        // volatilityHistoricalEstimateWithDividends.
        double historicalEstimateStandardError1 = Volatility.historicalEstimateStandardError(
                180., // numberOfPeriods
                0.04 // volatilityEstimate
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The estimate of the standard error is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == historicalEstimateStandardError1) ? "NaN" : "" + (int) (10000 * historicalEstimateStandardError1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + The continuously compounded return of an asset over one period +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    returnDuringithPeriod( double ithPeriodAssetPrice,");
        System.out.println("                           double i_1thPeriodAssetPrice )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    ");
        System.out.println("    What is the continuously compounded return  of  an  asset  over  one");
        System.out.println("    period if the asset price at  the  close  of  business  on  the  ith");
        System.out.println("    period is 120 and the asset price at the close of  business  on  the");
        System.out.println("    i-1th period is 126?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    ithPeriodAssetPrice = 120");
        System.out.println("    i_1thPeriodAssetPrice = 126");
        // This function returns the continuously compounded return of  an  asset
        // over one period.
        double returnDuringithPeriod1 = Volatility.returnDuringithPeriod(
                120., // ithPeriodAssetPrice
                126. // i_1thPeriodAssetPrice
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The continuously compounded return is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == returnDuringithPeriod1) ? "NaN" : "" + (int) (10000 * returnDuringithPeriod1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
