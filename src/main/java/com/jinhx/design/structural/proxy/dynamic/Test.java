package com.jinhx.design.structural.proxy.dynamic;

import org.springframework.cglib.proxy.Proxy;

public class Test {

    public static void main(String[] args) {
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new
                Class[]{BuyHouse.class}, new DynamicProxyHandler(new BuyHouseImpl()));
        proxyBuyHouse.buyHosue();
    }

}
