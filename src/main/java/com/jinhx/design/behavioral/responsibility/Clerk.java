package com.jinhx.design.behavioral.responsibility;

public class Clerk extends AbstractClerk{

    public Clerk() {
        super.type = "职员";
    }

    public int getLimit() {
        return 5000;
    }

}
