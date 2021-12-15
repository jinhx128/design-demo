package com.jinhx.design.behavioral.mediator;

public class Test {

    public static void main(String[] args) {
        // 构建中介者
        AbstractMediator concreteMediator = new ConcreteMediator();

        // 构建具体的同事类
        AbstractColleague concreteColleagueA = new ConcreteColleagueA();
        AbstractColleague concreteColleagueB = new ConcreteColleagueB();

        // 注册同事
        concreteMediator.register(concreteColleagueA);
        concreteMediator.register(concreteColleagueB);

        // 发送消息
        concreteColleagueA.send();
        concreteColleagueB.send();
    }

}
