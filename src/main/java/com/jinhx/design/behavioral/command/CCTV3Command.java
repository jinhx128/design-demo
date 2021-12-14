package com.jinhx.design.behavioral.command;

public class CCTV3Command extends AbstractCommand {

    public CCTV3Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv3();
    }

}

