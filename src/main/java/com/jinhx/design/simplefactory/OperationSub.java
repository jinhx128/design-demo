package com.jinhx.design.simplefactory;

public class OperationSub extends Operation{

    @Override
    protected double getResule() {
        return getValue1() - getValue2();
    }
    
}
