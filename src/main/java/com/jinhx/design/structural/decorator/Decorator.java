package com.jinhx.design.structural.decorator;

public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        // 通过构造函数传递给被修饰者
        this.component = component;
    }

    @Override
    public void operation() {
        // 委托给被修饰者执行
        if(component != null) {
            this.component.operation();
        }
    }

}
