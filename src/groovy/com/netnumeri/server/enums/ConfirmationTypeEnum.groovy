package com.netnumeri.server.enums

public enum ConfirmationTypeEnum {

    Suggested ("Suggested"), Required

    final String value

    ConfirmationTypeEnum(String value) { this.value = value }

    String toString() { value }

    String getKey() { name() }


}