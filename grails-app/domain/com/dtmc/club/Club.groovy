package com.dtmc.club

import com.netnumeri.server.enums.RiskEnum

class Club implements Serializable {

    String name

    Integer yearsTimeSpan

    Date inauguralMeeting

    RiskEnum risk

    static hasMany = [members: Member]

    Double monthlySubscription
    Double joiningFee

    Date dateCreated
    Date lastUpdated

    static hasOne = [banker: Banker, broker: Broker, legalStructure: LegalStructure]

    byte[] agreement

    static mapping = {
    }

    static constraints = {
    }

    @Override
    public String toString() {
        return name
    }
}
