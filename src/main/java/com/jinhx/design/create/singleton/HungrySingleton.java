package com.jinhx.design.create.singleton;

public class HungrySingleton {

    private static HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

}
