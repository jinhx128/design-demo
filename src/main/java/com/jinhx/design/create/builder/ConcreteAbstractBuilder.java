package com.jinhx.design.create.builder;

public class ConcreteAbstractBuilder extends AbstractBuilder {

    private People people;

    public ConcreteAbstractBuilder() {
        people = new People();
    }

    @Override
    People build() {
        return people;
    }

    @Override
    AbstractBuilder bulidName(String name) {
        people.setName(name);
        return this;
    }

    @Override
    AbstractBuilder bulidAge(String age) {
        people.setAge(age);
        return this;
    }

    @Override
    AbstractBuilder bulidSex(String sex) {
        people.setSex(sex);
        return this;
    }

}