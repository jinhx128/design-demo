package com.jinhx.design.structural.bridging;

import com.jinhx.design.structural.bridging.charger.ICharger;
import com.jinhx.design.structural.bridging.locker.ILocker;

public class Phone {

    private ICharger iCharger;

    private ILocker iLocker;

    public void charge() {
        if (iCharger == null) {
            return;
        }

        iCharger.charge();
    }

    public void unlock() {
        if (iLocker == null) {
            return;
        }

        iLocker.unlock();
    }

    public void setCharger(ICharger iCharger) {
        this.iCharger = iCharger;
    }

    public void setLocker(ILocker iLocker) {
        this.iLocker = iLocker;
    }

}
