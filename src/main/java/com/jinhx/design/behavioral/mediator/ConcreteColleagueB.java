package com.jinhx.design.behavioral.mediator;

public class ConcreteColleagueB extends AbstractColleague {

    @Override
    public void changeNumber(int number, AbstractMediator abstractMediator) {
        System.out.println("B改为" + number);
        this.number = number;
        abstractMediator.bAffectA();
    }

}
