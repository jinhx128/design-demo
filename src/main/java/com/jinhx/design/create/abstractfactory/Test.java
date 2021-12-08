package com.jinhx.design.create.abstractfactory;

import com.jinhx.design.create.abstractfactory.factory.IHardwareFactory;
import com.jinhx.design.create.abstractfactory.factory.MacHardwareFactory;
import com.jinhx.design.create.abstractfactory.factory.WinHardwareFactory;
import com.jinhx.design.create.abstractfactory.hardware.IKeyboard;
import com.jinhx.design.create.abstractfactory.hardware.IMouse;

public class Test {

    public static void main(String[] args) {
        IHardwareFactory macHardwareFactory = new MacHardwareFactory();
        // Mac专用键盘
        IKeyboard keyboard = macHardwareFactory.createKyeBoard();
        keyboard.input();

        IHardwareFactory winHardwareFactory = new WinHardwareFactory();
        // Win专用鼠标
        IMouse mouse = winHardwareFactory.createMouse();
        mouse.click();
    }

}
