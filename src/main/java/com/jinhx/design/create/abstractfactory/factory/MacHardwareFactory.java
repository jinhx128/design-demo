package com.jinhx.design.create.abstractfactory.factory;

import com.jinhx.design.create.abstractfactory.hardware.IKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.MacKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.MacMouse;
import com.jinhx.design.create.abstractfactory.hardware.IMouse;

public class MacHardwareFactory implements IHardwareFactory {

    @Override
    public IKeyboard createKyeBoard() {
        return new MacKeyboard();
    }

    @Override
    public IMouse createMouse() {
        return new MacMouse();
    }

}
