package com.jinhx.design.structural.adapter.objectt;

public class PowerAdapter implements IPowerTarget {

    private PowerAdaptee powerAdaptee;

    public PowerAdapter(PowerAdaptee powerAdaptee){
        this.powerAdaptee = powerAdaptee;
    }

    @Override
    public int output5V() {
        return this.powerAdaptee.output220V() / 44;
    }

}
