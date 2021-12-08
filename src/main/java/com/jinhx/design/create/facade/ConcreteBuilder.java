package com.jinhx.design.create.facade;

public class ConcreteBuilder extends Builder{

    private People people;

    public ConcreteBuilder() {
        people = new People();
    }

    @Override
    People build() {
        return people;
    }

    @Override
    Builder bulidName(String name) {
        people.setName(name);
        return this;
    }

    @Override
    Builder bulidAge(String age) {
        people.setAge(age);
        return this;
    }

    @Override
    Builder bulidSex(String sex) {
        people.setSex(sex);
        return this;
    }

}