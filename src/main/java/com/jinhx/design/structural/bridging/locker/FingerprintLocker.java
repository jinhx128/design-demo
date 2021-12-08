package com.jinhx.design.structural.bridging.locker;

public class FingerprintLocker implements ILocker {

    @Override
    public void unlock() {
        System.out.println("指纹解锁");
    }

}
