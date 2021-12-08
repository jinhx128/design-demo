package com.jinhx.design.structural.bridging.locker;

public class FaceLocker implements Locker {

    @Override
    public void unlock() {
        System.out.println("面部解锁");
    }

}
