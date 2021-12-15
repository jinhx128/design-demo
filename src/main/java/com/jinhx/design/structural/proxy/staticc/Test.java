package com.jinhx.design.structural.proxy.staticc;

public class Test {

    public static void main(String[] args) {
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(new BuyHouse());
        buyHouseProxy.buyHosue();
    }

}
