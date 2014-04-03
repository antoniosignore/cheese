package com.netnumeri.server.finance;


import com.netnumeri.server.finance.beans.FinConstants
import com.netnumeri.server.finance.finpojo.derivative.equity.Vanilla

public class VanillaTest extends GroovyTestCase {


    public void testVanilla() {

        Vanilla v = new Vanilla();
        v.setPremium(100);
        v.setInterestRate(0.5);
        v.setStrike(110);
        v.setExpiration(new Date("10/10/2010"));

        assertEquals(v.getPremium(), 100.0);
        assertEquals(v.getDirection(), FinConstants.kCall);

        double bsPrice = v.modelPrice(FinConstants.BlackScholes);
        System.out.println("bsPrice = " + bsPrice);

    }
}
