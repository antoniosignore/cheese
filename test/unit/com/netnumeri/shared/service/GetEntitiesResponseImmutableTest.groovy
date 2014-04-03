package com.netnumeri.shared.service;


import com.netnumeri.server.entity.OptionType
import com.netnumeri.server.finance.finpojo.derivative.equity.Vanilla
import com.netnumeri.server.finance.utils.DateUtils

public class GetEntitiesResponseImmutableTest extends GroovyTestCase {

    public void testToString() throws Exception {

        Date d = DateUtils.Date("3/27/2007");

        ArrayList<Vanilla> list = new ArrayList<Vanilla>();
        Vanilla option = new Vanilla("1", "name", "ticket", OptionType.PUT, 1.1, d);
        list.add(option);

    }
}
