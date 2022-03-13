package com.jinhx.design.structural.proxy.staticc;

public class BuyHouseProxy implements IBuyHouse {

    private IBuyHouse iBuyHouse;

    public BuyHouseProxy() {
        this.iBuyHouse = new BuyHouse();
    }

    @Override
    public void buyHosue() {
        System.out.println("买房前准备");
        iBuyHouse.buyHosue();
        System.out.println("买房后装修");
    }

}
