package com.jinhx.design.behavioral.command;

public abstract class AbstractCommand {

    /**
     * 命令接收者：电视机
     */
    protected Television television;

    public AbstractCommand(Television television) {
        this.television = television;
    }

    /**
     * 命令执行
     */
    abstract void execute();

}
