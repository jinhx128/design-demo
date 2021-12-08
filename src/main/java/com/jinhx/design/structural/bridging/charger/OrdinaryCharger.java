package com.jinhx.design.structural.bridging.charger;

public class OrdinaryCharger implements Charger {

    @Override
    public void charge() {
        System.out.println("普通充电");
    }

}
