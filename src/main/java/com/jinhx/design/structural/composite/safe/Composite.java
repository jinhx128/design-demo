package com.jinhx.design.structural.composite.safe;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    public Composite(String name) {
        super(name);
    }

    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        this.componentList.add(component);
    }

    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public void display(int depth) {
        // 输出树形结构
        for(int i = 0; i < depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);

        // 下级遍历
        for (Component component : componentList) {
            component.display(depth + 1);
        }
    }

}