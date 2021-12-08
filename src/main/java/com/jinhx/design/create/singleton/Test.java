package com.jinhx.design.create.singleton;

public class Test {

    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        LazySingleton lazySingleton = LazySingleton.getInstance();

        LockSingleton lockSingleton = LockSingleton.getInstance();

        StaticSingleton staticSingleton = StaticSingleton.getInstance();
    }

}
