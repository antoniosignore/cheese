package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.DirectionalMovementIndicator;

public class DirectionalMovementIndicatorClient {

    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("             #######################################################");
        System.out.println("             # DirectionalMovementIndicator Console Client Example #");
        System.out.println("             #######################################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this client we offer one example  for  each  of  the  methods");
        System.out.println("    within the DirectionalMovementIndicator class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Determine whether an up and down trend +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    classifyMovements( double todaysHigh,");
        System.out.println("                       double todaysLow,");
        System.out.println("                       double yesterdaysHigh,");
        System.out.println("                       double yesterdaysLow )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Here we determine the  type  of  market  dynamics  of  the  FTSE100,");
        System.out.println("    between 6-7 Aug 2004.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    todaysHigh = 4349.20");
        System.out.println("    todaysLow = 4293.50");
        System.out.println("    yesterdaysHigh = 4413.40");
        System.out.println("    yesterdaysLow = 4337.90");
        // Here we determine the types on market dynamic of the  FTSE100  between
        // 6-7 Aug 2004
        int classifyMovement1 = DirectionalMovementIndicator.classifyMovements(
                4349.20, // todaysHigh
                4293.50, // todaysLow
                4413.40, // yesterdaysHigh
                4337.90 // yesterdaysLow
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The market dynamics was of type:");
        System.out.println(" ");
        System.out.println("       " + classifyMovement1);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Positive Direction Movement (PDM) of the FTSE100 between 6-7 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    positiveDirectionalMovement( double todaysHigh,");
        System.out.println("                                 double todaysLow,");
        System.out.println("                                 double yesterdaysHigh,");
        System.out.println("                                 double yesterdaysLow )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the Positive Directional  Movement  (PDM)  on  the  FTSE100");
        System.out.println("    between 6-7 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    todaysHigh = 4349.20");
        System.out.println("    todaysLow = 4293.50");
        System.out.println("    yesterdaysHigh = 4413.40");
        System.out.println("    yesterdaysLow = 4337.90");
        // Here we evaluate  the  Positive  Directional  Movement  (PDM)  on  the
        // FTSE100 between 6-7 Aug 2004
        double positiveDirectionalMovement1 = DirectionalMovementIndicator.positiveDirectionalMovement(
                4349.20, // todaysHigh
                4293.50, // todaysLow
                4413.40, // yesterdaysHigh
                4337.90 // yesterdaysLow
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The PDM of the FTSE100 between 6-7 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == positiveDirectionalMovement1) ? "NaN" : "" + (int) (10000 * positiveDirectionalMovement1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Minus Direction Movement (MDM) of the FTSE100 between 6-7 Aug 2004 +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    minusDirectionalMovement( double todaysHigh,");
        System.out.println("                              double todaysLow,");
        System.out.println("                              double yesterdaysHigh,");
        System.out.println("                              double yesterdaysLow )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was  the  Minus  Directional  Movement  (MDM)  on  the  FTSE100");
        System.out.println("    between 6-7 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    todaysHigh = 4349.20");
        System.out.println("    todaysLow = 4293.50");
        System.out.println("    yesterdaysHigh = 4413.40");
        System.out.println("    yesterdaysLow = 4337.90");
        // Here we evaluate the Minus Directional Movement (MDM) on  the  FTSE100
        // between 6-7 Aug 2004
        double minusDirectionalMovement1 = DirectionalMovementIndicator.minusDirectionalMovement(
                4349.20, // todaysHigh
                4293.50, // todaysLow
                4413.40, // yesterdaysHigh
                4337.90 // yesterdaysLow
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The MDM of the FTSE100 between 6-7 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == minusDirectionalMovement1) ? "NaN" : "" + (int) (10000 * minusDirectionalMovement1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + The True Range on the FTSE100 on 7 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    trueRange( double high,");
        System.out.println("               double low,");
        System.out.println("               double previousClose )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the true range of the FTSE100 on the 7 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = 4349.20");
        System.out.println("    low = 4293.50");
        System.out.println("    previousClose = 4337.90");
        // Here we evaluate the true range of the FTSE100 on the 7 Aug 2004
        double trueRange1 = DirectionalMovementIndicator.trueRange(
                4349.20, // high
                4293.50, // low
                4337.90 // previousClose
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The true range of the FTSE100 on the 7 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == trueRange1) ? "NaN" : "" + (int) (10000 * trueRange1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + The True Range on the IBM stocs between 7-10 Aug 2001 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    trueRangePeriod( double[] highs,");
        System.out.println("                     double[] lows,");
        System.out.println("                     double[] closing )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the true range of  the  IBM  between  7-10  Aug  2001?  The");
        System.out.println("    highs, lows and closing prices were: Date High Low  Close  8/10/2001");
        System.out.println("    104.68 102.55 104.68 8/9/2001 104.27 102.44 103.82  8/8/2001  105.83");
        System.out.println("    103.83 103.93 8/7/2001 106.96 104.85 105.84");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    highs = {104.68, 104.27, 105.83, 106.96}");
        System.out.println("    lows = {102.55, 102.44, 103.83, 104.85}");
        System.out.println("    closing = {104.68, 103.8199, 103.93, 105.84}");
        // Here we evaluate the true range of the IBM  prices  between  7-10  Aug
        // 2002
        double[] trueRangePeriod1 = DirectionalMovementIndicator.trueRangePeriod(
                new double[]{104.68, 104.27, 105.83, 106.96}, // highs
                new double[]{102.55, 102.44, 103.83, 104.85}, // lows
                new double[]{104.68, 103.8199, 103.93, 105.84} // closing
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The true range of the IBM between 7-10 Aug 2001 was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(trueRangePeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Plus Directional Movement Indicator (DMI) +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    plusDirectionalMovement( double trueRange,");
        System.out.println("                             double positiveDirectionalMovement )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the Plus  Directional  Movement  Indicator  (DMI)  for  the");
        System.out.println("    FTSE100 on the 18 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    trueRange = trueRange4PDMI");
        System.out.println("    positiveDirectionalMovement = PDI4PDMI");
        // Here we evalaute the true range on the 18 Aug 2004 of the FTSE100
        double trueRange4PDMI = DirectionalMovementIndicator.trueRange(
                4360.30, // high
                4331.60, // low
                4358.70 // previousClose
        );
        // Here we evaluate  the  Positive  Directional  Movement  (PDM)  of  the
        // FTSE100 on the 18 Aug 2004
        double PDI4PDMI = DirectionalMovementIndicator.positiveDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60 // yesterdaysLow
        );
        // Here we evaluate  the  Plus  Directional  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double plusDMI1 = DirectionalMovementIndicator.plusDirectionalMovement(
                trueRange4PDMI, // trueRange
                PDI4PDMI // positiveDirectionalMovement
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Plus Directional Movement Indicator (DMI) was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == plusDMI1) ? "NaN" : "" + (int) (10000 * plusDMI1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Minus Directional Movement Indicator (DMI) +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    minusDirectionalMovement( double trueRange,");
        System.out.println("                              double minusDirectionalMovement )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the Minus Directional  Movement  Indicator  (DMI)  for  the");
        System.out.println("    FTSE100 on the 18 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    trueRange = trueRange4MDMI");
        System.out.println("    minusDirectionalMovement = PDI4MDMI");
        // Here we evalaute the true range on the 18 Aug 2004 of the FTSE100
        double trueRange4MDMI = DirectionalMovementIndicator.trueRange(
                4360.30, // high
                4331.60, // low
                4358.70 // previousClose
        );
        // Here we evaluate the Minus Directional Movement (PDM) of  the  FTSE100
        // on the 18 Aug 2004
        double PDI4MDMI = DirectionalMovementIndicator.minusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60 // yesterdaysLow
        );
        // Here we evaluate  the  Plus  Directional  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double minusDMI1 = DirectionalMovementIndicator.minusDirectionalMovement(
                trueRange4MDMI, // trueRange
                PDI4MDMI // minusDirectionalMovement
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Minus Directional Movement Indicator (DMI) was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == minusDMI1) ? "NaN" : "" + (int) (10000 * minusDMI1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++");
        System.out.println(" + Directional Motion Indicator +");
        System.out.println(" ++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    directionalMotion( double todaysHigh,");
        System.out.println("                       double todaysLow,");
        System.out.println("                       double yesterdaysHigh,");
        System.out.println("                       double yesterdaysLow,");
        System.out.println("                       double yesterdaysClose )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the Directional Motion Indicator on the 18 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    todaysHigh = 4360.30");
        System.out.println("    todaysLow = 4331.60");
        System.out.println("    yesterdaysHigh = 4373.70");
        System.out.println("    yesterdaysLow = 4338.60");
        System.out.println("    yesterdaysClose = 4358.70");
        // Here we evaluate the Directional Motion Indication on the 18 Aug 2004
        double directionMotionIndicator1 = DirectionalMovementIndicator.directionalMotion(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Directional Motion Indicator was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == directionMotionIndicator1) ? "NaN" : "" + (int) (10000 * directionMotionIndicator1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Direction Motion of the FTSE on 18 Aug 2004 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    directionalMotion( double plusDirectionalMovement,");
        System.out.println("                       double minusDirectionalMovement )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the Direction Motion Indicator (DMI) of the FTSE100 on  the");
        System.out.println("    18 Aug 2004?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    plusDirectionalMovement = PDM4directionalMotion");
        System.out.println("    minusDirectionalMovement = MDM4directionalMotion");
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 18 Aug 2004
        double PDM4directionalMotion = DirectionalMovementIndicator.plusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double MDM4directionalMotion = DirectionalMovementIndicator.minusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we evaluate the Direction Motion of the FTSE100  on  the  18  Aug
        // 2004
        double directionalMovement1 = DirectionalMovementIndicator.directionalMotion(
                PDM4directionalMotion, // plusDirectionalMovement
                MDM4directionalMotion // minusDirectionalMovement
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The DMI of the FTSE100 on the 18 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == directionalMovement1) ? "NaN" : "" + (int) (10000 * directionalMovement1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Directional Motion Indicator (DMI) trading Signal using Simple MA +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dmiSignal( double[] pdi,");
        System.out.println("               double[] mdi,");
        System.out.println("               int method )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the trading signal generated for  the  FTSE100  on  19  Aug");
        System.out.println("    2004, when 18-19 Aug 2004 trading data was taking into account  when");
        System.out.println("    follow method was using to evaluate using the simple moving average");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    pdi = PDM4Sig2Sig1");
        System.out.println("    mdi = MDM4Sig2Sig1");
        System.out.println("    method = 1");
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 18 Aug 2004
        double PDM4signal1 = DirectionalMovementIndicator.plusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double MDM4signal1 = DirectionalMovementIndicator.minusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 19 Aug 2004
        double PDM4signal2 = DirectionalMovementIndicator.plusDirectionalMovement(
                4381.40, // todaysHigh
                4353.20, // todaysLow
                4360.30, // yesterdaysHigh
                4331.60, // yesterdaysLow
                4355.20 // yesterdaysClose
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 19 Aug 2004
        double MDM4signal2 = DirectionalMovementIndicator.minusDirectionalMovement(
                4381.40, // todaysHigh
                4353.20, // todaysLow
                4360.30, // yesterdaysHigh
                4331.60, // yesterdaysLow
                4355.20 // yesterdaysClose
        );
        // This method just take to double to put them into an array
        double[] PDM4Sig2Sig1 = DirectionalMovementIndicator.twoDoubles2Array(
                PDM4signal2, // first
                PDM4signal1 // second
        );
        // This method jsut take to double to put them into an array
        double[] MDM4Sig2Sig1 = DirectionalMovementIndicator.twoDoubles2Array(
                MDM4signal2, // first
                MDM4signal1 // second
        );
        // Here we evaluate the trading signal generated for the  FTSE100  on  19
        // Aug 2004, when 18-19 Aug 2004 is considering  using  a  simple  moving
        // average.
        int signal1 = DirectionalMovementIndicator.dmiSignal(
                PDM4Sig2Sig1, // pdi
                MDM4Sig2Sig1, // mdi
                1 // method
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The signal when the simple moving average is used was:");
        System.out.println(" ");
        System.out.println("       " + signal1);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Directional Motion Indicator (DMI) trading Signal using Geometric MA +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dmiSignal( double[] pdi,");
        System.out.println("               double[] mdi,");
        System.out.println("               int method )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the trading signal generated for  the  FTSE100  on  19  Aug");
        System.out.println("    2004, when 18-19 Aug 2004 trading data was taking into account  when");
        System.out.println("    follow method was using  to  evaluate  using  the  geometric  moving");
        System.out.println("    average.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    pdi = PDM4Sig2Sig1Geo");
        System.out.println("    mdi = MDM4Sig2Sig1Geo");
        System.out.println("    method = 2");
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 18 Aug 2004
        double PDM4signal1Geo = DirectionalMovementIndicator.plusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double MDM4signal1Geo = DirectionalMovementIndicator.minusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 19 Aug 2004
        double PDM4signal2Geo = DirectionalMovementIndicator.plusDirectionalMovement(
                4381.40, // todaysHigh
                4353.20, // todaysLow
                4360.30, // yesterdaysHigh
                4331.60, // yesterdaysLow
                4355.20 // yesterdaysClose
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 19 Aug 2004
        double MDM4signal2Geo = DirectionalMovementIndicator.minusDirectionalMovement(
                4381.40, // todaysHigh
                4353.20, // todaysLow
                4360.30, // yesterdaysHigh
                4331.60, // yesterdaysLow
                4355.20 // yesterdaysClose
        );
        // This method just take to double to put them into an array
        double[] PDM4Sig2Sig1Geo = DirectionalMovementIndicator.twoDoubles2Array(
                PDM4signal2Geo, // first
                PDM4signal1Geo // second
        );
        // This method jsut take to double to put them into an array
        double[] MDM4Sig2Sig1Geo = DirectionalMovementIndicator.twoDoubles2Array(
                MDM4signal2Geo, // first
                MDM4signal1Geo // second
        );
        // Here we evaluate the trading signal generated for the  FTSE100  on  19
        // Aug 2004, when 18-19 Aug 2004 is considering using a geometric  moving
        // average.
        int signal2 = DirectionalMovementIndicator.dmiSignal(
                PDM4Sig2Sig1Geo, // pdi
                MDM4Sig2Sig1Geo, // mdi
                2 // method
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The signal when the geometric moving average is used was:");
        System.out.println(" ");
        System.out.println("       " + signal2);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Directional Motion  Indicator  (DMI)  trading  Signal  using  Linearly +");
        System.out.println(" + Weighted MA                                                            +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dmiSignal( double[] pdi,");
        System.out.println("               double[] mdi,");
        System.out.println("               int method )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the trading signal generated for  the  FTSE100  on  19  Aug");
        System.out.println("    2004, when 18-19 Aug 2004 trading data was taking into account  when");
        System.out.println("    follow method was using to  evaluate  using  the  Linearly  Weighted");
        System.out.println("    moving average.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    pdi = PDM4Sig2Sig1Lin");
        System.out.println("    mdi = MDM4Sig2Sig1Lin");
        System.out.println("    method = 3");
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 18 Aug 2004
        double PDM4signal1Lin = DirectionalMovementIndicator.plusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double MDM4signal1Lin = DirectionalMovementIndicator.minusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 19 Aug 2004
        double PDM4signal2Lin = DirectionalMovementIndicator.plusDirectionalMovement(
                4381.40, // todaysHigh
                4353.20, // todaysLow
                4360.30, // yesterdaysHigh
                4331.60, // yesterdaysLow
                4355.20 // yesterdaysClose
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 19 Aug 2004
        double MDM4signal2Lin = DirectionalMovementIndicator.minusDirectionalMovement(
                4381.40, // todaysHigh
                4353.20, // todaysLow
                4360.30, // yesterdaysHigh
                4331.60, // yesterdaysLow
                4355.20 // yesterdaysClose
        );
        // This method just take to double to put them into an array
        double[] PDM4Sig2Sig1Lin = DirectionalMovementIndicator.twoDoubles2Array(
                PDM4signal2Lin, // first
                PDM4signal1Lin // second
        );
        // This method jsut take to double to put them into an array
        double[] MDM4Sig2Sig1Lin = DirectionalMovementIndicator.twoDoubles2Array(
                MDM4signal2Lin, // first
                MDM4signal1Lin // second
        );
        // Here we evaluate the trading signal generated for the  FTSE100  on  19
        // Aug 2004, when 18-19 Aug 2004 is considering using a geometric  moving
        // average.
        int signal3 = DirectionalMovementIndicator.dmiSignal(
                PDM4Sig2Sig1Lin, // pdi
                MDM4Sig2Sig1Lin, // mdi
                3 // method
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The signal when the linearly weighted moving average is used was:");
        System.out.println(" ");
        System.out.println("       " + signal3);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Directional Motion Indicator (DMI) trading Signal using  Exponentially +");
        System.out.println(" + Weighted MA                                                            +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    dmiSignal( double[] pdi,");
        System.out.println("               double[] mdi,");
        System.out.println("               int method )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was the trading signal generated for  the  FTSE100  on  19  Aug");
        System.out.println("    2004, when 18-19 Aug 2004 trading data was taking into account  when");
        System.out.println("    follow method was  using  to  evaluate  the  Exponentially  Weighted");
        System.out.println("    Moving Average with a period weight of 0.5.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    pdi = PDM4Sig2Sig1Exp");
        System.out.println("    mdi = MDM4Sig2Sig1Exp");
        System.out.println("    method = 4");
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 18 Aug 2004
        double PDM4signal1Exp = DirectionalMovementIndicator.plusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double MDM4signal1Exp = DirectionalMovementIndicator.minusDirectionalMovement(
                4360.30, // todaysHigh
                4331.60, // todaysLow
                4373.70, // yesterdaysHigh
                4338.60, // yesterdaysLow
                4358.70 // yesterdaysClose
        );
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 19 Aug 2004
        double PDM4signal2Exp = DirectionalMovementIndicator.plusDirectionalMovement(
                4381.40, // todaysHigh
                4353.20, // todaysLow
                4360.30, // yesterdaysHigh
                4331.60, // yesterdaysLow
                4355.20 // yesterdaysClose
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 19 Aug 2004
        double MDM4signal2Exp = DirectionalMovementIndicator.minusDirectionalMovement(
                4381.40, // todaysHigh
                4353.20, // todaysLow
                4360.30, // yesterdaysHigh
                4331.60, // yesterdaysLow
                4355.20 // yesterdaysClose
        );
        // This method just take to double to put them into an array
        double[] PDM4Sig2Sig1Exp = DirectionalMovementIndicator.twoDoubles2Array(
                PDM4signal2Exp, // first
                PDM4signal1Exp // second
        );
        // This method jsut take to double to put them into an array
        double[] MDM4Sig2Sig1Exp = DirectionalMovementIndicator.twoDoubles2Array(
                MDM4signal2Exp, // first
                MDM4signal1Exp // second
        );
        // Here we evaluate the trading signal generated for the  FTSE100  on  19
        // Aug 2004, when 18-19 Aug 2004 is  considering  using  a  exponentially
        // weighted moving average.
        int signal4 = DirectionalMovementIndicator.dmiSignal(
                PDM4Sig2Sig1Exp, // pdi
                MDM4Sig2Sig1Exp, // mdi
                4 // method
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The signal when the exponentially  weighted  moving  average  is  used");
        System.out.println("    was:");
        System.out.println(" ");
        System.out.println("       " + signal4);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Wilder Average Directional Motion +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    wilderAverageDirectionalMotion( double todaysHigh,");
        System.out.println("                                    double todaysLow,");
        System.out.println("                                    double yesterdaysHigh,");
        System.out.println("                                    double yesterdaysLow,");
        System.out.println("                                    double yesterdaysClose,");
        System.out.println("                                    double nDaysHigh,");
        System.out.println("                                    double nDaysLow,");
        System.out.println("                                    double yesterdaysNDaysHigh,");
        System.out.println("                                    double yesterdaysNDaysLow,");
        System.out.println("                                    double yesterdaysNDaysClose )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    The historical performance of the FTSE100 was as follows:");
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
        System.out.println("    17-Aug-04      4,350.20  4,373.70  4,338.60  4,358.70  1,431,195,136");
        System.out.println("    4,358.70");
        System.out.println("    ");
        System.out.println("    16-Aug-04      4,301.50  4,353.40  4,283.00  4,350.20  1,132,852,736");
        System.out.println("    4,350.20");
        System.out.println("    ");
        System.out.println("    13-Aug-04      4,328.10  4,334.40  4,297.00  4,301.50  1,171,800,064");
        System.out.println("    4,301.50");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    The problem here is  to  evaluate  the  Wilder  Average  Directional");
        System.out.println("    Motion on the 20 Aug 2004, taking into account the period 15-20  Aug");
        System.out.println("    2004 inclusive. In the notion on the API documentation  n  (trading)");
        System.out.println("    days previously corresponds to 16  Aug  2004,  the  (n+1)  (trading)");
        System.out.println("    days previously to 13 Aug 2004.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    todaysHigh = 4373.20");
        System.out.println("    todaysLow = 4349.50");
        System.out.println("    yesterdaysHigh = 4381.40");
        System.out.println("    yesterdaysLow = 4353.20");
        System.out.println("    yesterdaysClose = 4362.60");
        System.out.println("    nDaysHigh = 4381.40");
        System.out.println("    nDaysLow = 4283.00");
        System.out.println("    yesterdaysNDaysHigh = 4334.40");
        System.out.println("    yesterdaysNDaysLow = 4297.00");
        System.out.println("    yesterdaysNDaysClose = 4301.50");
        // Here we evaluate the Wilder Average Directional Motion of the  FTSE100
        // on  20  Aig  2004  taken  into  account  the  period  20-16  Aug  2004
        // includsive
        double wilderAverageDirectionalMotion1 = DirectionalMovementIndicator.wilderAverageDirectionalMotion(
                4373.20, // todaysHigh
                4349.50, // todaysLow
                4381.40, // yesterdaysHigh
                4353.20, // yesterdaysLow
                4362.60, // yesterdaysClose
                4381.40, // nDaysHigh
                4283.00, // nDaysLow
                4334.40, // yesterdaysNDaysHigh
                4297.00, // yesterdaysNDaysLow
                4301.50 // yesterdaysNDaysClose
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Wilder Average Directional Motion was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == wilderAverageDirectionalMotion1) ? "NaN" : "" + (int) (10000 * wilderAverageDirectionalMotion1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }

}
