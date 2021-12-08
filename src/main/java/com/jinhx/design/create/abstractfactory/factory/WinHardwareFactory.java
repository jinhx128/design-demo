package com.jinhx.design.create.abstractfactory.factory;

import com.jinhx.design.create.abstractfactory.hardware.IKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.IMouse;
import com.jinhx.design.create.abstractfactory.hardware.WinIKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.WinIMouse;

public class WinHardwareFactory implements IHardwareFactory {

    @Override
    public IKeyboard createKyeBoard() {
        return new WinIKeyboard();
    }

    @Override
    public IMouse createMouse() {
        return new WinIMouse();
    }

}
