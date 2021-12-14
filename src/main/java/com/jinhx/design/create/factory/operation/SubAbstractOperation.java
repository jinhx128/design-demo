package com.jinhx.design.create.factory.operation;

public class SubAbstractOperation extends AbstractOperation {

    @Override
    public double getResule() {
        return getValue1() - getValue2();
    }
    
}
