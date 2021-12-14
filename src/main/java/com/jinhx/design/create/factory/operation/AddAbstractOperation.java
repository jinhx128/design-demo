package com.jinhx.design.create.factory.operation;

public class AddAbstractOperation extends AbstractOperation {

    @Override
    public double getResule() {
        return getValue1() + getValue2();
    }

}
