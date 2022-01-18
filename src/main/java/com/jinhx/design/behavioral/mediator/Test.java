package com.jinhx.design.behavioral.mediator;

public class Test {

    public static void main(String[] args) {
        // 具体的同事类
        AbstractColleague concreteColleagueA = new ConcreteColleagueA();
        AbstractColleague concreteColleagueB = new ConcreteColleagueB();

        // 构建中介者
        AbstractMediator concreteMediator = new ConcreteMediator(concreteColleagueA, concreteColleagueB);

        // 通过设置A影响B
        concreteColleagueA.changeNumber(100, concreteMediator);

        // 通过设置B影响A
        concreteColleagueB.changeNumber(100, concreteMediator);
    }

}
