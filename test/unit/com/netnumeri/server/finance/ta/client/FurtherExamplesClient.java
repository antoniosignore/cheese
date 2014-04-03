package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.DirectionalMovementIndicator;

public class FurtherExamplesClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                    ##########################################");
        System.out.println("                    # FurtherExamples Console Client Example #");
        System.out.println("                    ##########################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this client  we  offer  an  example  of  the  PDMI  and  MDMI");
        System.out.println("    indicators within the DirectionalMovementIndicator class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Plus Directional Movement Indicator (PDMI) over a period +");
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    plusDirectionalMovementPeriod( double[] high,");
        System.out.println("                                   double[] low,");
        System.out.println("                                   double[] close )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Evaluate the Plus Directional Movement Indicator (PDMI) for the  IBM");
        System.out.println("    stock between 20-28 March 2002 knowing the following values:");
        System.out.println("    ");
        System.out.println("       - Date High Low Close");
        System.out.println("       - 28/03/2002 105.14 103.39 104");
        System.out.println("       - 27/03/2002 103.79 102.5 103.39");
        System.out.println("       - 26/03/2002 105.7 102.3 102.9");
        System.out.println("       - 25/03/2002 106.66 103.5 103.56");
        System.out.println("       - 22/03/2002 106.7 105.07 105.6");
        System.out.println("       - 21/03/2002 106.78 104.7 106.78");
        System.out.println("       - 20/03/2002 106.9 105.49 105.5");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}");
        System.out.println("    low = {103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}");
        System.out.println("    close = {104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5}");
        // Here we evaluate the Plus Directional Movement Indicator  of  the  IBM
        // stock over the period 20 -28 March 2002.
        double[] plusDMI1 = DirectionalMovementIndicator.plusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Plus Directional Movement Indicator (PDMI) over 28-20  March  2002");
        System.out.println("    were:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(plusDMI1, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" + Minus Directional Movement Indicator (MDMI) over a period +");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    minusDirectionalMovementPeriod( double[] high,");
        System.out.println("                                    double[] low,");
        System.out.println("                                    double[] close )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Evaluate the Minus Directional Movement  Indicator  (MDMI)  for  the");
        System.out.println("    IBM stock between 20-28 March 2002 knowing the following values:");
        System.out.println("    ");
        System.out.println("       - Date High Low Close");
        System.out.println("       - 28/03/2002 105.14 103.39 104");
        System.out.println("       - 27/03/2002 103.79 102.5 103.39");
        System.out.println("       - 26/03/2002 105.7 102.3 102.9");
        System.out.println("       - 25/03/2002 106.66 103.5 103.56");
        System.out.println("       - 22/03/2002 106.7 105.07 105.6");
        System.out.println("       - 21/03/2002 106.78 104.7 106.78");
        System.out.println("       - 20/03/2002 106.9 105.49 105.5");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    high = {105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}");
        System.out.println("    low = {103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}");
        System.out.println("    close = {104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5}");
        // Here we evaluate the Minus Directional Movement Indicator of  the  IBM
        // stock over the period 20 -28 March 2002.
        double[] minusDMI1 = DirectionalMovementIndicator.minusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The Minus Directional Movement Indicator (MDMI) over 28-20 March  2002");
        System.out.println("    were:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(minusDMI1, ", "));
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
        System.out.println("    What was the trading signal generated for the IBM stock on 28  March");
        System.out.println("    2002, when 20-28 March 2004 trading data  was  taking  into  account");
        System.out.println("    and simple moving average method was used for period the data.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    pdi = PDM4signal1");
        System.out.println("    mdi = MDM4signal1");
        System.out.println("    method = 1");
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 18 Aug 2004
        double[] PDM4signal1 = DirectionalMovementIndicator.plusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double[] MDM4signal1 = DirectionalMovementIndicator.minusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        // Here we evaluate the trading signal generated for the IBM stock on  28
        // MArch 2002, when 28-20  March  2002  is  considering  using  a  simple
        // moving average.
        int signal1 = DirectionalMovementIndicator.dmiSignal(
                PDM4signal1, // pdi
                MDM4signal1, // mdi
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
        System.out.println("    What was the trading signal generated for the IBM stock on 28  March");
        System.out.println("    2002, when 20-28 March 2004 trading data  was  taking  into  account");
        System.out.println("    and geometric moving average  method  was  used  for  period  the");
        System.out.println("    data.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    pdi = PDM4signalGeo");
        System.out.println("    mdi = MDM4signalGeo");
        System.out.println("    method = 2");
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 18 Aug 2004
        double[] PDM4signalGeo = DirectionalMovementIndicator.plusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double[] MDM4signalGeo = DirectionalMovementIndicator.minusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        // Here we evaluate the trading signal generated for the IBM stock on  28
        // March 2002, when 20-28 March 2004 is  considering  using  a  geometric
        // moving average.
        int signal1Geo = DirectionalMovementIndicator.dmiSignal(
                PDM4signalGeo, // pdi
                MDM4signalGeo, // mdi
                2 // method
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The signal when the geometric moving average is used was:");
        System.out.println(" ");
        System.out.println("       " + signal1Geo);
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
        System.out.println("    What was the trading signal generated for the IBM stock on 28  March");
        System.out.println("    2002, when 20-28 March 2004 trading data  was  taking  into  account");
        System.out.println("    and linearly weighted moving average method was used  for  period");
        System.out.println("    the data.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    pdi = PDM4signalLin");
        System.out.println("    mdi = MDM4signalLin");
        System.out.println("    method = 3");
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 18 Aug 2004
        double[] PDM4signalLin = DirectionalMovementIndicator.plusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double[] MDM4signalLin = DirectionalMovementIndicator.minusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        // Here we evaluate the trading signal generated for the IBM stock on  28
        // March 2002, when 20-28 March 2004  is  considering  using  a  linearly
        // weighted moving average.
        int signal1Lin = DirectionalMovementIndicator.dmiSignal(
                PDM4signalLin, // pdi
                MDM4signalLin, // mdi
                3 // method
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The signal when the linearly weighted moving average is used was:");
        System.out.println(" ");
        System.out.println("       " + signal1Lin);
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
        System.out.println("    What was the trading signal generated for the IBM stock on 28  March");
        System.out.println("    2002, when 20-28 March 2004 trading data  was  taking  into  account");
        System.out.println("    and exponentially  weighted  moving  average  method  was  used  for");
        System.out.println("    period the data.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    pdi = PDM4signalExp");
        System.out.println("    mdi = MDM4signalExp");
        System.out.println("    method = 3");
        // Here we evaluate the Plus Direction Movement Indicator of the  FTSE100
        // on the 18 Aug 2004
        double[] PDM4signalExp = DirectionalMovementIndicator.plusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        // Here we  evaluate  the  Minus  Direction  Movement  Indicator  of  the
        // FTSE100 on the 18 Aug 2004
        double[] MDM4signalExp = DirectionalMovementIndicator.minusDirectionalMovementPeriod(
                new double[]{105.14, 103.79, 105.7, 106.66, 106.7, 106.78, 106.9}, // high
                new double[]{103.39, 102.5, 102.3, 103.5, 105.07, 104.7, 105.49}, // low
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5} // close
        );
        // Here we evaluate the trading signal generated for the IBM stock on  28
        // March       2002,  when  20-28  March  2004  is  considering  using  a
        // exponentially weighted moving average.
        int signal1Exp = DirectionalMovementIndicator.dmiSignal(
                PDM4signalExp, // pdi
                MDM4signalExp, // mdi
                3 // method
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The signal when the exponentially  weighted  moving  average  is  used");
        System.out.println("    was:");
        System.out.println(" ");
        System.out.println("       " + signal1Exp);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
