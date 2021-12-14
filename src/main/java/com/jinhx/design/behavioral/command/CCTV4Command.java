package com.jinhx.design.behavioral.command;

public class CCTV4Command extends AbstractCommand {

    public CCTV4Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv4();
    }

}

