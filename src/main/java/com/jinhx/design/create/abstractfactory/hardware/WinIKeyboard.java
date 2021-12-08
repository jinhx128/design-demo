package com.jinhx.design.create.abstractfactory.hardware;

public class WinIKeyboard implements IKeyboard {

    @Override
    public void input() {
        System.out.println("Win 专用键盘");
    }

}
