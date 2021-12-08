package com.jinhx.design.factory.operation;

public class DivOperation extends Operation {

    @Override
    public double getResule() {
        if (getValue2() != 0) {
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("除数不能为零");
    }
    
}
