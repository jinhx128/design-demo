package com.jinhx.design.structural.composite.safe;

public class Leaf extends AbstractComponent {

    public Leaf(String name) {
        super(name);
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
