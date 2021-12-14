package com.jinhx.design.structural.composite.transparent;

import java.util.ArrayList;
import java.util.List;

public class Composite extends AbstractComponent {

    public Composite(String name) {
        super(name);
    }

    private List<AbstractComponent> abstractComponentList = new ArrayList<>();

    @Override
    public void add(AbstractComponent abstractComponent) {
        this.abstractComponentList.add(abstractComponent);
    }

    @Override
    public void remove(AbstractComponent abstractComponent) {
        this.abstractComponentList.remove(abstractComponent);
    }

    @Override
    public void display(int depth) {
        // 输出树形结构
        for(int i = 0; i < depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);

        // 下级遍历
        for (AbstractComponent abstractComponent : abstractComponentList) {
            abstractComponent.display(depth + 1);
        }
    }

}