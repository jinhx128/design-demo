package com.jinhx.design.behavioral.iterator;

public interface IAggregate {

    void add(Object obj);

    void remove(Object obj);

    Iterator iterator();

}
