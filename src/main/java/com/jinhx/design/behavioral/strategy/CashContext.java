package com.jinhx.design.behavioral.strategy;

public class CashContext {

    private AbstractCashSuper abstractCashSuper;

    public CashContext(AbstractCashSuper abstractCashSuper) {
        this.abstractCashSuper = abstractCashSuper;
    }

    public double getResult(double money) {
        return abstractCashSuper.acceptCash(money);
    }

}
