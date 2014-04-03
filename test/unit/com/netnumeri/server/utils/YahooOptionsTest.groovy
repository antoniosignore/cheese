package com.netnumeri.server.utils;


public class YahooOptionsTest extends GroovyTestCase {

    OptionsDocuments screen;

    @Override
    protected void setUp() {
        try {

            screen = YahooOptions.scrape("GOOG", YahooOptions.getOptionsDocuments("GOOG", new Date()));

            System.out.println("screen = " + screen);

            System.out.println("calls = " + screen.callsDocument.asXML());
            System.out.println("pits = " + screen.putsDocument.asXML());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void testComputeMaxpain() throws Exception {

        setUp();
        Double aa = MaximumPainCalculator.calculate("GOOG", new Date());
        System.out.println("aa = " + aa);
    }


    public void testLoadOptionChain() throws Exception {

        OptionsChain chain = YahooOptions.loadOptionChain("GOOG");
        System.out.println(" = " + chain.calls.size());

    }

    public static void main(String[] args) {
        OptionsChain chain = YahooOptions.loadOptionChain("GOOG");

        System.out.println(" = " + chain.calls.size());

        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream("./src/test/resources/GOOG.obj");
            out = new ObjectOutputStream(fos);
            out.writeObject(chain);
            out.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

