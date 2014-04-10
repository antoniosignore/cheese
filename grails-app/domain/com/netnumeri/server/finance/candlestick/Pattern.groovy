package com.netnumeri.server.finance.candlestick

import com.netnumeri.server.enums.*
import com.netnumeri.server.enums.RelevanceTypeEnum

import java.sql.Clob

class Pattern {

    Integer code
    String name
    PatternTypeEnum patternType
    RelevanceTypeEnum relevanceType
    RelevanceTypeEnum priorTrend
    ReliabilityTypeEnum reliability
    ConfirmationTypeEnum confirmation
    Integer noSticks
    String patternDefinition
    String recognition
    Date dateCreated
    Date lastUpdated

    static mapping = {
        recognition sqlType:"clob"
        patternDefinition sqlType:"clob"
    }

}
