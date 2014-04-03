package com.netnumeri.server.utils

import com.netnumeri.server.finance.finpojo.derivative.equity.Vanilla

public class OptionsSelectionTest extends GroovyTestCase {

    OptionsDocuments screen;

    private OptionsChain getTestChain() {
        OptionsChain e = null;
        try {
            FileInputStream fileIn =
                new FileInputStream("./test/resources/GOOG.obj");
            ObjectInputStream ins = new ObjectInputStream(fileIn);
            e = (OptionsChain) ins.readObject();
            ins.close();
            fileIn.close();

            System.out.println(" = " + e.calls.size());

        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return e;
    }


    public void testLoadOptionChainForTest() throws Exception {

        OptionsChain chain = YahooOptions.loadOptionChain("GOOG");
        System.out.println("chain.calls.size() = " + chain.calls.size());
        Map<Date, List<Vanilla>> calls = chain.calls;
        Set<Date> strings = calls.keySet();
        for (Iterator<Date> iterator = strings.iterator(); iterator.hasNext();) {
            Date next = iterator.next();
            List<Vanilla> options = calls.get(next);
            for (int i = 0; i < options.size(); i++) {
                Vanilla option = options.get(i);
                System.out.println("expiration = " + option.toString());
            }
        }
    }
}

