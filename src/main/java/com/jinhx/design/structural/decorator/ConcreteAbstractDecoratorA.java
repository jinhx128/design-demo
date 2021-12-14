package com.jinhx.design.structural.decorator;

public class ConcreteAbstractDecoratorA extends AbstractDecorator {

    public ConcreteAbstractDecoratorA(AbstractComponent abstractComponent) {
        // 定义被修饰者
        super(abstractComponent);
    }

    private void method1() {
        // 定义自己的修饰方法
        System.out.println("method1 修饰");
    }

    @Override
    public void operation() {
        this.method1();
        super.operation();
    }

}
