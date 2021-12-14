package com.jinhx.design.create.builder;

public abstract class AbstractBuilder {

    abstract AbstractBuilder bulidName(String name);

    abstract AbstractBuilder bulidAge(String age);

    abstract AbstractBuilder bulidSex(String sex);

    abstract People build();

}
