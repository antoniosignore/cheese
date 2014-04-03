package com.dtmc.club

import com.dtmc.security.SecUser
import com.netnumeri.server.enums.MemberGoalEnum
import com.netnumeri.server.enums.MemberTypeEnum
import com.netnumeri.server.finance.indicator.UserIndicators
import com.netnumeri.server.finance.trading.StrategyCatalog

class Member extends SecUser implements Serializable {

    static belongsTo = [club: Club]

    MemberTypeEnum memberType
    MemberGoalEnum memberGoal

    String firstname
    String lastname
    String address1
    String address2
    String city
    String state
    String country
    String company
    String email
    String phone
    String mobile
    String twitter
    String facebook
    String linkedin

    String timezone

    Integer hoursWeeklyDedicated

    ImageNode small

    Date dateCreated
    Date lastUpdated


    static hasMany = [indicators: UserIndicators, strategies: StrategyCatalog]

    static constraints = {

        firstname(size: 1..30, blank: true)
        lastname(size: 1..30, blank: true)
        email(email: true, blank: true)
        phone(size: 6..15, blank: true)
        mobile(size: 6..15, blank: true)
        city(size: 1..20, blank: true)
        state(size: 1..20, blank: true)
        country(size: 1..20, blank: true)
        twitter(size: 5..200, blank: true)
        facebook(size: 5..200, blank: true)
        linkedin(size: 5..200, blank: true)
        timezone(nullable: true)
    }

    static mapping = {
    }

    @Override
    public String toString() {
        return username
    }

}
