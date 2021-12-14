package com.jinhx.design.structural.composite.transparent;

public class Leaf extends AbstractComponent {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComponent abstractComponent) {
        // 空实现，抛出不支持请求异常
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractComponent abstractComponent) {
        // 空实现，抛出不支持请求异常
        throw new UnsupportedOperationException();
    }

    @Override
    public void display(int depth) {
        // 输出树形结构的叶子节点
        for(int i = 0; i < depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);
    }

}
