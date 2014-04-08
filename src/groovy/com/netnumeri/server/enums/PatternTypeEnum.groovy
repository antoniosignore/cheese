package com.netnumeri.server.enums

public enum PatternTypeEnum {

    ReversalContinuation("Reversal/Continuation")

    final String value

    PatternTypeEnum(String value) { this.value = value }

    String toString() { value }

    String getKey() { name() }

}