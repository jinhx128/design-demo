package com.jinhx.design.behavioral.strategy;

public class CashNormal extends AbstractCashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }

}
