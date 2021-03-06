package com.jinhx.design.create.simplefactory.operation;

public class DivAbstractOperation extends AbstractOperation {

    @Override
    public double getResule() {
        if (getValue2() != 0) {
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("除数不能为零");
    }
    
}
