package com.jinhx.design.structural.bridging;

import com.jinhx.design.structural.bridging.charger.OrdinaryCharger;
import com.jinhx.design.structural.bridging.charger.QuickCharger;
import com.jinhx.design.structural.bridging.locker.FaceLocker;
import com.jinhx.design.structural.bridging.locker.FingerprintLocker;

public class Test {

    public static void main(String[] args) {
        // 快速充电，面部解锁
        Phone phone1 = new Phone();
        phone1.setCharger(new QuickCharger());
        phone1.setLocker(new FaceLocker());
        phone1.unlock();
        phone1.charge();

        // 普通充电，面部解锁
        Phone phone2 = new Phone();
        phone2.setCharger(new OrdinaryCharger());
        phone2.setLocker(new FaceLocker());
        phone2.unlock();
        phone2.charge();

        // 普通充电，指纹解锁
        Phone phone3 = new Phone();
        phone3.setCharger(new OrdinaryCharger());
        phone3.setLocker(new FingerprintLocker());
        phone3.unlock();
        phone3.charge();
    }

}
