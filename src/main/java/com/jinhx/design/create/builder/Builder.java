package com.jinhx.design.create.builder;

public abstract class Builder {

    abstract Builder bulidName(String name);

    abstract Builder bulidAge(String age);

    abstract Builder bulidSex(String sex);

    abstract People build();

}
