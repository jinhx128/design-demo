package com.jinhx.design.factory.operation;

public class SubOperation extends Operation {

    @Override
    public double getResule() {
        return getValue1() - getValue2();
    }
    
}
