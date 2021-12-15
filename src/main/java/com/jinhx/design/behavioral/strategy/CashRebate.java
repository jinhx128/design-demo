package com.jinhx.design.behavioral.strategy;

public class CashRebate extends AbstractCashSuper {

    /**
     * 折扣
     */
    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}
