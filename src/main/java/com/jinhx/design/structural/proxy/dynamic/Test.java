package com.jinhx.design.structural.proxy.dynamic;

import org.springframework.cglib.proxy.Proxy;

public class Test {

    public static void main(String[] args) {
        IBuyHouse proxyIBuyHouse = (IBuyHouse) Proxy.newProxyInstance(IBuyHouse.class.getClassLoader(), new
                Class[]{IBuyHouse.class}, new DynamicProxyHandler(new BuyHouse()));
        proxyIBuyHouse.buyHosue();
    }

}
