package com.jinhx.design.create.abstractfactory.factory;

import com.jinhx.design.create.abstractfactory.hardware.IKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.MacIKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.MacIMouse;
import com.jinhx.design.create.abstractfactory.hardware.IMouse;

public class MacHardwareFactory implements IHardwareFactory {

    @Override
    public IKeyboard createKyeBoard() {
        return new MacIKeyboard();
    }

    @Override
    public IMouse createMouse() {
        return new MacIMouse();
    }

}
