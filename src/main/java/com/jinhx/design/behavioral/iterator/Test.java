package com.jinhx.design.behavioral.iterator;

public class Test {

    public static void main(String[] args){
        IAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add("小明");
        concreteAggregate.add("小红");
        concreteAggregate.add("小刚");
        Iterator it = concreteAggregate.iterator();
        while(it.hasNext()){
            String str = (String) it.next();
            System.out.println(str);
        }
    }

}