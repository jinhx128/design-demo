package com.jinhx.design.factory.operation;

public class MulOperation extends Operation {

    @Override
    public double getResule() {
        return getValue1() * getValue2();
    }
    
}
