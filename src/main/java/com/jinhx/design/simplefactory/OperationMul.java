package com.jinhx.design.simplefactory;

public class OperationMul extends Operation{

    @Override
    protected double getResule() {
        return getValue1() * getValue2();
    }
    
}
