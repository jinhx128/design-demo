package com.jinhx.design.structural.decorator;

public class ConcreteAbstractComponent extends AbstractComponent {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }

}
