package com.jinhx.design.create.abstractfactory.hardware;

public class MacIKeyboard implements IKeyboard {

    @Override
    public void input() {
        System.out.println("Mac 专用键盘");
    }

}
