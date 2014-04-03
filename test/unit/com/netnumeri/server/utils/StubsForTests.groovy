package com.netnumeri.server.utils;


import com.netnumeri.server.entity.OptionType
import com.netnumeri.server.finance.finpojo.derivative.equity.Vanilla
import com.netnumeri.server.finance.utils.DateUtils

public class StubsForTests {

    static Date d = DateUtils.Date("3/27/2007");

    public static Vanilla createDummyOption() {
        return new Vanilla("1", "option123", "GOOG", OptionType.CALL, 180.0, d);
    }

    public static Vanilla createDummyOption2() {
        return new Vanilla("2", "option234", "GOOG", OptionType.PUT, 130.0, d);
    }

    public static List<Vanilla> createDummyOptionList() {


        List<Vanilla> list = new ArrayList<Vanilla>();

        try {
            OptionsChain chain = YahooOptions.loadOptionChain("GOOG");

            Set<Map.Entry<Date, List<Vanilla>>> entries = chain.calls.entrySet();

            for (Iterator<Map.Entry<Date, List<Vanilla>>> iterator = entries.iterator(); iterator.hasNext();) {
                Map.Entry<Date, List<Vanilla>> listEntry = (Map.Entry<Date, List<Vanilla>>) iterator.next();

                List<Vanilla> lOptions = listEntry.getValue();
                for (int i = 0; i < lOptions.size(); i++) {
                    Vanilla option = lOptions.get(i);
                    list.add(option);
                }

            }

        } catch (Throwable e) {
            e.printStackTrace();
        }

//        list.add(createDummyOption());
//        list.add(createDummyOption2());

        return list;

    }
}
