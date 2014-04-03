package com.dtmc.security

class SecRole implements Serializable {

    String authority

    static mapping = {
        cache true
    }

    static constraints = {
        authority blank: false, unique: true
    }
}
