package com.jinhx.design.create.abstractfactory.hardware;

public class WinIMouse implements IMouse {

    @Override
    public void click() {
        System.out.println("Win 专用鼠标");
    }

}
