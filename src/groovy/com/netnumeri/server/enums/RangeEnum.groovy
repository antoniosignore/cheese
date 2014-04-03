package com.netnumeri.server.enums

public enum RangeEnum {

    lastMonth("1m"),
    lastThreeMonths("3m"),
    lastSixMonths("6m"),
    lastYear("1y"),
    lastTwoYears("2y"),
    lastFiveYears("5y")

    final String value

    RangeEnum(String value) { this.value = value }

    String toString() { value }

    String getKey() { name() }

}