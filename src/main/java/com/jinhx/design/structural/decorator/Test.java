package com.jinhx.design.structural.decorator;

public class Test {
    
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次修饰
        component = new ConcreteDecoratorA(component);
        // 第二次修饰
        component = new ConcreteDecoratorB(component);
        // 修饰后运行
        component.operation();
    }
    
}
