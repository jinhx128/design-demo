package com.jinhx.design.structural.bridging.locker;

public class FaceLocker implements ILocker {

    @Override
    public void unlock() {
        System.out.println("面部解锁");
    }

}
