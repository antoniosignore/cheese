package com.netnumeri.server.finance.ta.client;

import com.netnumeri.server.finance.ta.DirectionalMovementIndicator;

public class DMISignalClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                       ####################################");
        System.out.println("                       # DMISignal Console Client Example #");
        System.out.println("                       ####################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Within this client we offer an example of the DMI signal within  the");
        System.out.println("    DirectionalMovementIndicator class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
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
        System.out.println("    What was the trading signal generated for the a  stock  on  17  June");
        System.out.println("    2005, when 14-17 June 2005 trading data was taking into account  and");
        System.out.println("    simple moving average method was used for period the data.");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    pdi = PDM4signal1");
        System.out.println("    mdi = MDM4signal1");
        System.out.println("    method = 1");
        // Here we evaluate the Plus Direction Movement Indicator  of  the  stock
        // on the 17 June 2005
        double[] PDM4signal1 = DirectionalMovementIndicator.plusDirectionalMovementPeriod(
                new double[]{77.8, 78.5, 76.48, 77.72}, // high
                new double[]{74.06, 75.98, 73.4, 74.85}, // low
                new double[]{76.17, 76.0, 75.55, 75.72} // close
        );
        // Here we evaluate the Minus Direction Movement Indicator of  the  stock
        // on the 17 June 2005
        double[] MDM4signal1 = DirectionalMovementIndicator.minusDirectionalMovementPeriod(
                new double[]{77.8, 78.5, 76.48, 77.72}, // high
                new double[]{74.06, 75.98, 73.4, 74.85}, // low
                new double[]{76.17, 76.0, 75.55, 75.72} // close
        );
        // Here we evaluate the trading signal generated for the a  stock  on  17
        // June 2005, when 14-17 June 2005 is considering using a  simple  moving
        // average.
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
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
