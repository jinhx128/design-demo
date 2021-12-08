package com.jinhx.design.structural.bridging.charger;

public class QuickCharger implements Charger {

    @Override
    public void charge() {
        System.out.println("快速充电");
    }

}
