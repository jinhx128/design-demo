package com.jinhx.design.create.abstractfactory.hardware;

public class MacMouse implements IMouse {

    @Override
    public void click() {
        System.out.println("Mac 专用鼠标");
    }

}
