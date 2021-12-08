package com.jinhx.design.structural.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        // 定义被修饰者
        super(component);
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
