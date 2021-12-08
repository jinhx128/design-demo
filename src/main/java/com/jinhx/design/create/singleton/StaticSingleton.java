package com.jinhx.design.create.singleton;

public class StaticSingleton {

    private StaticSingleton(){}

    private static class SingletonHoler{
        private static StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return SingletonHoler.INSTANCE;
    }

}
