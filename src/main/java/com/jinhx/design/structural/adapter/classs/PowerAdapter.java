package com.jinhx.design.structural.adapter.classs;

public class PowerAdapter extends PowerAdaptee implements IPowerTarget {

    @Override
    public int output5V() {
        return output220V() / 44;
    }

}
