package com.jinhx.design.behavioral.mediator;

public abstract class AbstractMediator {

    /**
     * 注册同事
     */
    abstract void register(AbstractColleague abstractColleague);

    /**
     * 通知中介者，发送消息
     */
    abstract void relay(AbstractColleague abstractColleague);

}
