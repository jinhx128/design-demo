package com.jinhx.design.behavioral.responsibility;

public class Leader extends AbstractClerk{

    public Leader() {
        super.type = "组长";
    }

    public int getLimit() {
        return 20000;
    }

}
