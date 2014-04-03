package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.AccumulateDistribute;

public class AccumulateDistributeClient {
    public static void main(String[] args) throws Exception {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                 ###############################################");
        System.out.println("                 # AccumulateDistribute Console Client Example #");
        System.out.println("                 ###############################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    With this example we provide one example for  each  of  the  methods");
        System.out.println("    within the AccumulateDistribute class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Accumulation/Distribution indicator of Google on day of IPO +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    accumulationDistribution( double high,");
        System.out.println("                              double low,");
        System.out.println("                              double volume )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    What was  the  Accumulation/Distribution  indicator  of  Google  Inc");
        System.out.println("    (GOOG) on its first  day  of  trading  on  19  Aug  2004,  when  the");
        System.out.println("    intraday high was 104.06, the intraday low was 95.96 and  the  total");
        System.out.println("    volume for the day was 22,351,900?");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = 104.06");
        System.out.println("    low = 95.96");
        System.out.println("    volume = 22351900");
        // Here we evaluate the accumulation/distribution indicator
        double accDis1 = AccumulateDistribute.accumulationDistribution(
                104.06, // high
                95.96, // low
                22351900. // volume
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Acc/Dis indicator for Google Inc. (GOOG) on 19 Aug 2004 was:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == accDis1) ? "NaN" : "" + (int) (10000 * accDis1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Accumulation/Distribution period indicator of FTSE100 over a four  day +");
        System.out.println(" + period                                                                 +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    accumulationDistributionPeriod( double[] highs,");
        System.out.println("                                    double[] lows,");
        System.out.println("                                    double[] volume )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Here we evaluate the Accumulate/Distribute period indicator for  the");
        System.out.println("    FTSE100 over a four day period 16-19 Aug 2004 inclusive.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    highs = {4353.4, 4373.7, 4360.3, 4381.4}");
        System.out.println("    lows = {4283.0, 4338.6, 4331.6, 4353.2}");
        System.out.println("    volume = {214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        // Here we evaluate the Accumulate/Distribute period  indicator  for  the
        // FTSE over a four day period 16-19 Aug 2004 inclusive.
        double accDisPeriod1 = AccumulateDistribute.accumulationDistributionPeriod(
                new double[]{4353.4, 4373.7, 4360.3, 4381.4}, // highs
                new double[]{4283.0, 4338.6, 4331.6, 4353.2}, // lows
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647} // volume
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Accumulate/Distribute period indicator is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == accDisPeriod1) ? "NaN" : "" + (int) (10000 * accDisPeriod1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Accumulation/Distribution for the FTSE100 over a period +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    accumulateDistributionOverPeriod( double[] high,");
        System.out.println("                                      double[] low,");
        System.out.println("                                      double[] volume,");
        System.out.println("                                      int lengthOfPeriod )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Here we evaluate the Accumulate Distribute indicator with  a  length");
        System.out.println("    of period of 2, of the FTSE100 over a period of 4 days.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4353.4, 4373.7, 4360.3, 4381.4}");
        System.out.println("    low = {4283.0, 4338.6, 4331.6, 4353.2}");
        System.out.println("    volume = {214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        System.out.println("    lengthOfPeriod = 2");
        // Here we evaluate the Accumulate Distribute indicator with a length  of
        // period of 2, of the FTSE100 over a period of 4 days.
        double[] accDisOverPeriod1 = AccumulateDistribute.accumulateDistributionOverPeriod(
                new double[]{4353.4, 4373.7, 4360.3, 4381.4}, // high
                new double[]{4283.0, 4338.6, 4331.6, 4353.2}, // low
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647}, // volume
                2 // lengthOfPeriod
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The values of the Accumulate Distribution indicators with a period  of");
        System.out.println("    2, over the last two days is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(accDisOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Chaiken Oscillator indicator of the FTSE100 +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    chaikinOscillator( double[] high,");
        System.out.println("                       double[] low,");
        System.out.println("                       double[] volume,");
        System.out.println("                       double smoothingFactor )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Here we evaluate the Chaiken Oscillator indicator  for  the  FTSE100");
        System.out.println("    over a four day period 19 Aug  2004  inclusive  where  to  period");
        System.out.println("    factor is chosen to be 0.5. Note that the  Chaikin  Oscillator  done");
        System.out.println("    not has a ;period; parameters and requires that  the  last  10  days");
        System.out.println("    data is provided.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4381.4, 4360.3, 4373.7, 4353.4, 4334.4, 4342.9, 4356.9, 4356.9, 4350.9, 4349.2}");
        System.out.println("    low = {4353.2, 4331.6, 4338.6, 4283.0, 4297.0, 4312.2, 4289.6, 4289.6, 4313.1, 4293.5}");
        System.out.println("    volume = {214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        System.out.println("    smoothingFactor = 0.5");
        // Here we evaluate the Chaiken Oscillator indicator for the FTSE over  a
        // four day period 16-19 Aug 2004 inclusive.
        double chaikinOscill1 = AccumulateDistribute.chaikinOscillator(
                new double[]{4381.4, 4360.3, 4373.7, 4353.4, 4334.4, 4342.9, 4356.9, 4356.9, 4350.9, 4349.2}, // high
                new double[]{4353.2, 4331.6, 4338.6, 4283.0, 4297.0, 4312.2, 4289.6, 4289.6, 4313.1, 4293.5}, // low
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647}, // volume
                0.5 // smoothingFactor
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Chaiken Oscillator indicator is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == chaikinOscill1) ? "NaN" : "" + (int) (10000 * chaikinOscill1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Chaiken Oscillator over a two day Period for the past two days +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    chaikinOscillatorOverPeriod( double[] high,");
        System.out.println("                                 double[] low,");
        System.out.println("                                 double[] volume,");
        System.out.println("                                 double smoothingFactor )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Here we evaluate the  Chaiken  Oscillator  of  the  FTSE100  with  a");
        System.out.println("    period of 2 days using a  0.5  period  factor,  over  the  period");
        System.out.println("    16-19 Aug 2004 inclusive.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4381.4, 4360.3, 4373.7, 4353.4, 4334.4, 4342.9, 4356.9, 4356.9, 4350.9, 4349.2}");
        System.out.println("    low = {4353.2, 4331.6, 4338.6, 4283.0, 4297.0, 4312.2, 4289.6, 4289.6, 4313.1, 4293.5}");
        System.out.println("    volume = {214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        System.out.println("    smoothingFactor = 0.5");
        // Here we evaluate the Chaiken Oscollator of the FTSE100 with  a  period
        // of 2 days using a 0.5 period factor,  over  the  period  16-19  Aug
        // 2004 inclusive.
        double[] chaikenOverPeriod1 = AccumulateDistribute.chaikinOscillatorOverPeriod(
                new double[]{4381.4, 4360.3, 4373.7, 4353.4, 4334.4, 4342.9, 4356.9, 4356.9, 4350.9, 4349.2}, // high
                new double[]{4353.2, 4331.6, 4338.6, 4283.0, 4297.0, 4312.2, 4289.6, 4289.6, 4313.1, 4293.5}, // low
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647}, // volume
                0.5 // smoothingFactor
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Chaiken Oscillator of the previous period was:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(chaikenOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Chaikin Money Flow (CMF) of the FTSE100 over a four day period +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    chaikinMoneyFlow( double[] high,");
        System.out.println("                      double[] low,");
        System.out.println("                      double[] closing,");
        System.out.println("                      double[] volume )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Here we evaluate the Chaikin Money Flow (CMF) for the  FTSE100  over");
        System.out.println("    a four day period 16-19 Aug 2004 inclusive.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4353.4, 4373.7, 4360.3, 4381.4}");
        System.out.println("    low = {4283.0, 4338.6, 4331.6, 4353.2}");
        System.out.println("    closing = {4350.2, 4358.7, 4355.2, 4362.6}");
        System.out.println("    volume = {214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        // Here we evaluate the Chaikin Money Flow (CMF) for the FTSE100  over  a
        // four day period 16-19 Aug 2004 inclusive.
        double chaikinMoneyFlow1 = AccumulateDistribute.chaikinMoneyFlow(
                new double[]{4353.4, 4373.7, 4360.3, 4381.4}, // high
                new double[]{4283.0, 4338.6, 4331.6, 4353.2}, // low
                new double[]{4350.2, 4358.7, 4355.2, 4362.6}, // closing
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647} // volume
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Chaikin Money Flow (CMF) of the FTSE100 is:");
        System.out.println(" ");
        System.out.println("       " + ((Double.NaN == chaikinMoneyFlow1) ? "NaN" : "" + (int) (10000 * chaikinMoneyFlow1) / 10000.));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Chaikin Money Flow of the FTSE100 over a two day period for  the  last +");
        System.out.println(" + two days                                                               +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    chaikinMoneyFlowOverPeriod( double[] high,");
        System.out.println("                                double[] low,");
        System.out.println("                                double[] close,");
        System.out.println("                                double[] volume,");
        System.out.println("                                int lengthOfPeriod )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Here we evaluate the Chaikin Money Flow of the FTSE100  over  a  two");
        System.out.println("    days period for the last two days.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {4353.4, 4373.7, 4360.3, 4381.4}");
        System.out.println("    low = {4283.0, 4338.6, 4331.6, 4353.2}");
        System.out.println("    close = {4350.2, 4358.7, 4355.2, 4362.6}");
        System.out.println("    volume = {214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        System.out.println("    lengthOfPeriod = 2");
        // Here we evaluate the Chaikin Money Flow of  the  FTSE100  over  a  two
        // days period for the last two days.
        double[] chaikinMoneyFlowOverPeriod1 = AccumulateDistribute.chaikinMoneyFlowOverPeriod(
                new double[]{4353.4, 4373.7, 4360.3, 4381.4}, // high
                new double[]{4283.0, 4338.6, 4331.6, 4353.2}, // low
                new double[]{4350.2, 4358.7, 4355.2, 4362.6}, // close
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647}, // volume
                2 // lengthOfPeriod
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Chaikin Money Flow indicator over the last two days is:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(chaikinMoneyFlowOverPeriod1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
