package com.jinhx.design.behavioral.mediator;

public class ConcreteColleagueA extends AbstractColleague {

    @Override
    public void receive() {
        System.out.println("ConcreteColleagueA 接收消息");
    }

    @Override
    public void send() {
        System.out.println("ConcreteColleagueA 发送消息");
        //请中介者转发
        this.abstractMediator.relay(this);
    }

}
