package com.jinhx.design.behavioral.mediator;

public class ConcreteColleagueA extends AbstractColleague {

    @Override
    public void changeNumber(int number, AbstractMediator abstractMediator) {
        System.out.println("A改为" + number);
        this.number = number;
        abstractMediator.aAffectB();
    }

}
