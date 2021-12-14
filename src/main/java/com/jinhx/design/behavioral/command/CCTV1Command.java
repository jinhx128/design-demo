package com.jinhx.design.behavioral.command;

public class CCTV1Command extends AbstractCommand {

    public CCTV1Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv1();
    }

}

