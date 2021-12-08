package com.jinhx.design.create.abstractfactory.factory;

import com.jinhx.design.create.abstractfactory.hardware.IKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.IMouse;

public interface IHardwareFactory {

    IKeyboard createKyeBoard();

    IMouse createMouse();

}
