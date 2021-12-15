package com.jinhx.design.behavioral.strategy;

public class CashReturn extends AbstractCashSuper {

    /**
     * 返利条件
     */
    private double moneyConditation;

    /**
     * 返利值
     */
    private double moneyReturn;

    public CashReturn(double moneyConditation, double moneyReturn) {
        this.moneyConditation = moneyConditation;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;

        if (money >= moneyConditation) {
            result = money - Math.floor(money / moneyConditation) * moneyReturn;
        }

        return result;
    }

}
