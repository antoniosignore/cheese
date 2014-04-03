package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.Aroon;

public class AroonClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                         ################################");
        System.out.println("                         # Aroon Console Client Example #");
        System.out.println("                         ################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this client we provide an example for  each  of  the  methods");
        System.out.println("    within the Aroon class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluate the Aroon Up indicator for the FTSE100 over 10 trading days +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    aroonUp( double[] highs )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the Aroon Up indicator of the FTSE100  from  6-19  Aug  2004");
        System.out.println("    inclusive?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    highs = {4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4}");
        // Here is evaluate the Aroon Up indicator of the FTSE100 from  6-19  Aug
        // 2004 inclusive
        double aroonUp1 = Aroon.aroonUp(
                new double[]{4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4} // highs
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Aroon Up indicator is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == aroonUp1) ? "NaN" : "" + (int) (10000 * aroonUp1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluate the Aroon Up indicators for the FTSE100 over 10 trading  days +");
        System.out.println(" + over all subperiods of a given length of 3                             +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    aroonUpOverPeriod( double[] highs,");
        System.out.println("                       int period )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What are the Aroon Up indicators of the FTSE100 from 6-19  Aug  2004");
        System.out.println("    inclusive over all sub-periods with a length 3?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    highs = {4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4}");
        System.out.println("    period = 3");
        // Here is evaluate the Aroon Up Over Period indicators  of  the  FTSE100
        // from 6-19 Aug 2004 inclusive
        double[] aroonUpOverPeriod1 = Aroon.aroonUpOverPeriod(
                new double[]{4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4}, // highs
                3 // period
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Aroon Up Over Period indicators are:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(aroonUpOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluate the Aroon Down indicator for the FTSE over 10 trading days +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    aroonDown( double[] lows )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the Aroon Down indicator of the FTSE100 from 6-19  Aug  2004");
        System.out.println("    inclusive?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    lows = {4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2}");
        // Here is evaluate the Aroon Down indicator of  the  FTSE100  from  6-19
        // Aug 2004 inclusive
        double aroonDown1 = Aroon.aroonDown(
                new double[]{4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2} // lows
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Aroon Down indicator is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == aroonDown1) ? "NaN" : "" + (int) (10000 * aroonDown1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluate the Aroon Down indicators for the FTSE over 10  trading  days +");
        System.out.println(" + over all subperiods of a given length of 3                             +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    aroonDownOverPeriod( double[] lows,");
        System.out.println("                         int periods )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the Aroon Down indicator of the FTSE100 from 6-19  Aug  2004");
        System.out.println("    inclusive over all sub-periods with a length 3 ?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    lows = {4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2}");
        System.out.println("    periods = 3");
        // Here is evaluate the Aroon Down Over Period indicators of the  FTSE100
        // from 6-19 Aug 2004 inclusive
        double[] aroonDownOverPeriod1 = Aroon.aroonDownOverPeriod(
                new double[]{4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2}, // lows
                3 // periods
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Aroon Down Over Period indicators are:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(aroonDownOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluate    the  Aroon  Oscillator  using  the  aroonOscillator(double +");
        System.out.println(" + aroonUp, double aroonDown) method                                      +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    aroonOscillator( double aroonUpIndicator,");
        System.out.println("                     double aroonDownIndicator )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the Aroon Oscillator of  the  FTSE100  from  6-19  Aug  2004");
        System.out.println("    inclusive?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    aroonUpIndicator = aroonUp2");
        System.out.println("    aroonDownIndicator = aroonDown2");
        // Here is evaluate the Aroon Up indicator of the FTSE100 from  6-19  Aug
        // 2004 inclusive
        double aroonUp2 = Aroon.aroonUp(
                new double[]{4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4} // highs
        );
        // Here is evaluate the Aroon Down indicator of  the  FTSE100  from  6-19
        // Aug 2004 inclusive
        double aroonDown2 = Aroon.aroonDown(
                new double[]{4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2} // lows
        );
        // Here we evaluate the Aroon Oscillator of the  FTSE100  from  6-19  Aug
        // 2004 inclusive.
        double aroon1 = Aroon.aroonOscillator(
                aroonUp2, // aroonUpIndicator
                aroonDown2 // aroonDownIndicator
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Aroon Oscillator is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == aroon1) ? "NaN" : "" + (int) (10000 * aroon1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluate the Aroon Oscillator using aroonOscillator  (double[]  highs, +");
        System.out.println(" + double[] lows) method                                                  +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    aroonOscillator( double[] lows,");
        System.out.println("                     double[] highs )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the Aroon Oscillator of  the  FTSE100  from  6-19  Aug  2004");
        System.out.println("    inclusive?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    lows = {4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4}");
        System.out.println("    highs = {4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2}");
        // Here we evaluate the Aroon Oscillator of the  FTSE100  from  6-19  Aug
        // 2004 inclusive.
        double aroon2 = Aroon.aroonOscillator(
                new double[]{4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4}, // lows
                new double[]{4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2} // highs
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Aroon Oscillator is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == aroon2) ? "NaN" : "" + (int) (10000 * aroon2) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluate the Aroon Oscillator Over Period over all subperiods  with  a +");
        System.out.println(" + length 3 using  aroonOscillatorOverPeriod(double[]  aroonUpIndicators, +");
        System.out.println(" + double[] aroonDownIndicators) method                                   +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    aroonOscillatorOverPeriod( double[] aroonUp,");
        System.out.println("                               double[] aroonDown )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the Aroon Oscillator of  the  FTSE100  from  6-19  Aug  2004");
        System.out.println("    inclusive over all sub-periods with a length 3?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    aroonUp = aroonUpOverPeriod2");
        System.out.println("    aroonDown = aroonDownOverPeriod2");
        // Here is evaluate the Aroon Up indicator of the FTSE100 from  6-19  Aug
        // 2004 inclusive over all subperiods with a length 3.
        double[] aroonUpOverPeriod2 = Aroon.aroonUpOverPeriod(
                new double[]{4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4}, // highs
                3 // period
        );
        // Here is evaluate the Aroon Down indicator of  the  FTSE100  from  6-19
        // Aug 2004 inclusive over all subperiods with a length 3.
        double[] aroonDownOverPeriod2 = Aroon.aroonDownOverPeriod(
                new double[]{4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2}, // lows
                3 // periods
        );
        // Here we evaluate the Aroon Oscillator of the  FTSE100  from  6-19  Aug
        // 2004 inclusive over all subperiods with a length 3.
        double[] aroonOverPeriod1 = Aroon.aroonOscillatorOverPeriod(
                aroonUpOverPeriod2, // aroonUp
                aroonDownOverPeriod2 // aroonDown
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Aroon Oscillator is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(aroonOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Evaluate the Aroon Oscillator Over Period over all subperiods  with  a +");
        System.out.println(" + length 3 using  aroonOscillatorOverPeriod  (double[]  highs,  double[] +");
        System.out.println(" + lows, int lengthOfPeriod) method                                       +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    aroonOscillatorOverPeriod( double[] highs,");
        System.out.println("                               double[] lows,");
        System.out.println("                               int length )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What is the Aroon Oscillator of  the  FTSE100  from  6-19  Aug  2004");
        System.out.println("    inclusive over all sub-periods with a length 3?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    highs = {4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4}");
        System.out.println("    lows = {4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2}");
        System.out.println("    length = 3");
        // Here we evaluate the Aroon Oscillator of the  FTSE100  from  6-19  Aug
        // 2004 inclusive over all subperiods with a length 3.
        double[] aroonOverPeriod2 = Aroon.aroonOscillatorOverPeriod(
                new double[]{4413.4, 4349.2, 4350.9, 4356.9, 4342.9, 4334.4, 4353.4, 4373.7, 4360.3, 4381.4}, // highs
                new double[]{4337.9, 4293.5, 4313.1, 4289.6, 4312.2, 4297.0, 4283.0, 4338.6, 4331.6, 4353.2}, // lows
                3 // length
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Aroon Oscillator is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(aroonOverPeriod2, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
