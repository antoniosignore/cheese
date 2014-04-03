package com.netnumeri.server.finance.ta.client;


import com.netnumeri.server.finance.ta.Volume;

public class VolumeClient {
    public static void main(String[] args) throws Exception {
        // used components
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                        #################################");
        System.out.println("                        # Volume Console Client Example #");
        System.out.println("                        #################################");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Overview");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    This client example illustrations the use of the Volume class.");
        System.out.println(" ");
        System.out.println(" Press ENTER or SPACE to scroll down.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++");
        System.out.println(" + Negative Volume Index +");
        System.out.println(" +++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    negativeVolumeIndex( double[] closes,");
        System.out.println("                         double[] volumes )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Evaluate the negative volume  index  for  IBM  stock  between  20-28");
        System.out.println("    March 2002 knowing the following values:");
        System.out.println("    ");
        System.out.println("       - Date Close Volume");
        System.out.println("       - 3/28/2002 104 5347500");
        System.out.println("       - 3/27/2002 103.39 5602400");
        System.out.println("       - 3/26/2002 102.9 8144000");
        System.out.println("       - 3/25/2002 103.56 6277900");
        System.out.println("       - 3/22/2002 105.6 5507900");
        System.out.println("       - 3/21/2002 106.78 5113100");
        System.out.println("       - 3/20/2002 105.5 4844100");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    closes = {104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5}");
        System.out.println("    volumes = {214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        // Here we evaluate the negative volume  index  for  IBM  stocks  between
        // 20-28 March 2002.
        double[] NVI = Volume.negativeVolumeIndex(
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5}, // closes
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647} // volumes
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The negative volume index for the given period were:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(NVI, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++++++");
        System.out.println(" + Positive Volume Index +");
        System.out.println(" +++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    positiveVolumeIndex( double[] closes,");
        System.out.println("                         double[] volumes )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Evaluate the positive volume  index  for  IBM  stock  between  20-28");
        System.out.println("    March 2002 knowing the following values:");
        System.out.println("    ");
        System.out.println("       - Date Close Volume");
        System.out.println("       - 3/28/2002 104 5347500");
        System.out.println("       - 3/27/2002 103.39 5602400");
        System.out.println("       - 3/26/2002 102.9 8144000");
        System.out.println("       - 3/25/2002 103.56 6277900");
        System.out.println("       - 3/22/2002 105.6 5507900");
        System.out.println("       - 3/21/2002 106.78 5113100");
        System.out.println("       - 3/20/2002 105.5 4844100");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    closes = {104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5}");
        System.out.println("    volumes = {214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        // Here we evaluate the negative volume  index  for  IBM  stocks  between
        // 20-28 March 2002.
        double[] PVI = Volume.positiveVolumeIndex(
                new double[]{104.0, 103.39, 102.9, 103.56, 105.6, 106.78, 105.5}, // closes
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647} // volumes
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The positive volume index for the given period were:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(PVI, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +++++++++++++++++++++");
        System.out.println(" + On Balance volume +");
        System.out.println(" +++++++++++++++++++++");
        System.out.println(" ");
        System.out.println(" Within this example we test the following method:");
        System.out.println(" ");
        System.out.println("    onBalanceVolume( double[] volumes )");
        System.out.println(" ");
        System.out.println(" --------");
        System.out.println(" Question");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println("    Evaluate the on balance volume  indicators  for  IBM  stock  between");
        System.out.println("    20-28 March 2002 knowing the following values:");
        System.out.println("    ");
        System.out.println("       - Date Close Volume");
        System.out.println("       - 3/28/2002 104 5347500");
        System.out.println("       - 3/27/2002 103.39 5602400");
        System.out.println("       - 3/26/2002 102.9 8144000");
        System.out.println("       - 3/25/2002 103.56 6277900");
        System.out.println("       - 3/22/2002 105.6 5507900");
        System.out.println("       - 3/21/2002 106.78 5113100");
        System.out.println("       - 3/20/2002 105.5 4844100");
        System.out.println("       ");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println(" -----------------------------------------------");
        System.out.println(" Parameter values required to solve this problem");
        System.out.println(" -----------------------------------------------");
        System.out.println(" ");
        System.out.println("    volumes = {214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647}");
        // Here we evaluate the on  balance  volume  indicators  for  IBM  stocks
        // between 20-28 March 2002.
        double[] OBV = Volume.onBalanceVolume(
                new double[]{214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647, 214748.3647} // volumes
        );
        System.out.println(" ");
        System.out.println(" ----------------");
        System.out.println(" Answer evaluated");
        System.out.println(" ----------------");
        System.out.println(" ");
        System.out.println("    The on balance volume indicators for the given period were:");
        System.out.println(" ");
        System.out.println("       " + MethodInvoker.arrayToString(OBV, ", "));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       - Please scroll up to the top of the console to view the examples -");
        System.out.println("       -------------------------------------------------------------------");
        System.out.println(" ");
    }


}
