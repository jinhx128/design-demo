package com.jinhx.design.behavioral.command;

public class CCTV2Command extends AbstractCommand {

    public CCTV2Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv2();
    }

}

