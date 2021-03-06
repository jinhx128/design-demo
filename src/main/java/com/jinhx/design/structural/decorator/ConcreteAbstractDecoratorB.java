package com.jinhx.design.structural.decorator;

public class ConcreteAbstractDecoratorB extends AbstractDecorator {

    public ConcreteAbstractDecoratorB(AbstractComponent abstractComponent) {
        // 定义被修饰者
        super(abstractComponent);
    }

    private void method2() {
        // 定义被修饰者
        System.out.println("method2 修饰");
    }

    @Override
    public void operation() {
        super.operation();
        this.method2();
    }

}
