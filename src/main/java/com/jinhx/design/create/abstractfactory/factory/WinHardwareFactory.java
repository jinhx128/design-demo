package com.jinhx.design.create.abstractfactory.factory;

import com.jinhx.design.create.abstractfactory.hardware.IKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.IMouse;
import com.jinhx.design.create.abstractfactory.hardware.WinKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.WinMouse;

public class WinHardwareFactory implements IHardwareFactory {

    @Override
    public IKeyboard createKyeBoard() {
        return new WinKeyboard();
    }

    @Override
    public IMouse createMouse() {
        return new WinMouse();
    }

}
