package com.jinhx.design.structural.bridging;

import com.jinhx.design.structural.bridging.charger.Charger;
import com.jinhx.design.structural.bridging.locker.Locker;

public class Phone {

    private Charger charger;

    private Locker locker;

    public void charge() {
        if (charger == null) {
            return;
        }

        charger.charge();
    }

    public void unlock() {
        if (locker == null) {
            return;
        }

        locker.unlock();
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public void setLocker(Locker locker) {
        this.locker = locker;
    }

}
