package com.jinhx.design.structural.bridging.charger;

public class OrdinaryCharger implements ICharger {

    @Override
    public void charge() {
        System.out.println("普通充电");
    }

}
