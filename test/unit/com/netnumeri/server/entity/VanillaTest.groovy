package com.netnumeri.server.entity

import com.netnumeri.server.finance.finpojo.derivative.equity.Vanilla
import com.netnumeri.server.finance.utils.DateUtils

import static org.hamcrest.CoreMatchers.not
import static org.junit.Assert.assertThat

public class VanillaTest extends GroovyTestCase {

    Date d = DateUtils.Date("3/27/2007");

//
//    public void valuesInConstructorAreAllUsed() throws Exception {
//
//        Option option = new Option("1", "NasdaqGs", "name", "ticket", OptionType.PUT, 1.1, d);
//
//        assertThat(option.name, is("name"));
//        assertThat(option.bourse, is("NasdaqGs"));
//        assertThat(option.name, is("name"));
//        assertThat(option.expiration, is(d));
//        assertThat(option.strike, is(1.1));
//        assertThat(option.type, is(OptionType.PUT));
//    }


    public void representCompletelyAsString() throws Exception {
        Vanilla option = new Vanilla("1", "name", "ticket", OptionType.PUT, 1.1, d);
        assertThat(option.toString(), is("Option{, {name:name}, {underlying:ticket}, {type:PUT}, {strike:1.1}, {expiration:2/21/2007}}"));
    }

//
//    public void entity() throws Exception {
//        Entity entity = new Option("123", "NasdaqGs", "name", "ticket", OptionType.PUT, 1.1, d);
//
//        assertThat(entity.getFields().size(), is(15));
//        assertThat(entity.getId(), is(new EntityId("123")));
//
//        assertTrue(entity.getFields().contains(((Option) entity).name));
//        assertTrue(entity.getFields().contains(((Option) entity).underlying));
//        assertThat((StringEntityField) entity.getField(Option.Field.name), is(((Option) entity).name));
//        EntityField<Double> entityField = (EntityField<Double>) entity.getField(Option.Field.strike);
//        assertThat(entityField.get(), is(1.1));
//
//    }


    public void checkEquals() throws Exception {
        Vanilla option = new Vanilla("1", "name", "ticket", OptionType.PUT, 1.1, d);
        Vanilla optionDiff = new Vanilla("1", "name2", "ticket", OptionType.PUT, 1.1, d);
        Vanilla optionEqual = new Vanilla("1", "name", "ticket", OptionType.PUT, 1.1, d);

        assertThat(option, is(optionEqual));
        assertThat(option, not(optionDiff));

    }


}
