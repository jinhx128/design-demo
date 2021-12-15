package com.jinhx.design.behavioral.mediator;

public abstract class AbstractColleague {

    /**
     * 中介者抽象类
     */
    protected AbstractMediator abstractMediator;

    /**
     * 接收消息
     */
    public abstract void receive();

    /**
     * 发送消息
     */
    public abstract void send();

    public void setMediator(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }

}
