package com.jinhx.design.structural.proxy.dynamic;

public class Test {

    public static void main(String[] args) {
        IBuyHouse buyHouse = new BuyHouse();
        DynamicProxyHandler proxyHandler = new DynamicProxyHandler();
        proxyHandler.setTarget(buyHouse);
        IBuyHouse proxy = (IBuyHouse) proxyHandler.getProxy();
        proxy.buyHosue();
    }

}
