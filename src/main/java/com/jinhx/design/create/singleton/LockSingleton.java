package com.jinhx.design.create.singleton;

public class LockSingleton {

    /**
     * volatile会在编译时加lock，禁止了指令重排序，针对INSTANCE = new LockSingleton()，三个步骤不会乱序，也就避免了DCL失效问题
     */
    private static volatile LockSingleton INSTANCE;

    private LockSingleton() {}

    public static LockSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LockSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LockSingleton();
                }
            }
            return INSTANCE;
        }
        return INSTANCE;
    }
}