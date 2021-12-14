package com.jinhx.design.structural.decorator;

public class Test {
    
    public static void main(String[] args) {
        AbstractComponent abstractComponent = new ConcreteAbstractComponent();
        // 第一次修饰
        abstractComponent = new ConcreteAbstractDecoratorA(abstractComponent);
        // 第二次修饰
        abstractComponent = new ConcreteAbstractDecoratorB(abstractComponent);
        // 修饰后运行
        abstractComponent.operation();
    }
    
}
