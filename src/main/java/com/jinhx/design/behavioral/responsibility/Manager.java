package com.jinhx.design.behavioral.responsibility;

public class Manager extends AbstractClerk{

    public Manager() {
        super.type = "经理";
    }

    public int getLimit() {
        return 100000;
    }

}
