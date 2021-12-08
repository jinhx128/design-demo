package com.jinhx.design.create.abstractfactory.hardware;

public class MacIMouse implements IMouse {

    @Override
    public void click() {
        System.out.println("Mac 专用鼠标");
    }

}
