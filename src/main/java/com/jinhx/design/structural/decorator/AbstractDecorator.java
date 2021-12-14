package com.jinhx.design.structural.decorator;

public abstract class AbstractDecorator extends AbstractComponent {

    private AbstractComponent abstractComponent;

    public AbstractDecorator(AbstractComponent abstractComponent) {
        // 通过构造函数传递给被修饰者
        this.abstractComponent = abstractComponent;
    }

    @Override
    public void operation() {
        // 委托给被修饰者执行
        if(abstractComponent != null) {
            this.abstractComponent.operation();
        }
    }

}
