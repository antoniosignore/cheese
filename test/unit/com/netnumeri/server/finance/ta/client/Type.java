package com.netnumeri.server.finance.ta.client;


public class Type {

    Type(String name, int dim) {
        this.name = name;
        this.dim = dim;
    }

    public String toString() {
        return "" + getClass() + "[name=" + name + ",dim=" + dim + "]";
    }

    public String name;
    public int dim;
}

