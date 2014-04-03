package com.netnumeri.server.finance.indicator

import com.dtmc.club.Member
import com.netnumeri.server.enums.IndicatorEnum
import com.netnumeri.server.finance.ta.Indicator

public class UserIndicators implements Serializable {

    static belongsTo = [user: Member]

    String name
    IndicatorEnum type

    static transients = ["indicator"]
    Indicator indicator;

    Integer integer1
    Integer integer2
    Integer integer3

    String str1

    Double double1
    Double double2

    Date dateCreated
    Date lastUpdated

    @Override
    public String toString() {
        return "UserIndicators{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", indicator=" + indicator +
                ", version=" + version +
                ", user=" + user.toString() +
                '}';
    }
}
