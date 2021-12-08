package com.jinhx.design.structural.composite.safe;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void display(int depth);

}
