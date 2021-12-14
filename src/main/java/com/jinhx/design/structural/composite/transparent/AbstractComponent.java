package com.jinhx.design.structural.composite.transparent;

public abstract class AbstractComponent {

    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }

    public abstract void add(AbstractComponent abstractComponent);

    public abstract void remove(AbstractComponent abstractComponent);

    public abstract void display(int depth);

}
