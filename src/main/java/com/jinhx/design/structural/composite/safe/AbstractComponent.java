package com.jinhx.design.structural.composite.safe;

public abstract class AbstractComponent {

    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }

    public abstract void display(int depth);

}
