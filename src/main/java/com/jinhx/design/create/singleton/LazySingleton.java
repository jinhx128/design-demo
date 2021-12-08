package com.jinhx.design.create.singleton;

public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        // 被动创建，在真正需要使用时才去创建
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
