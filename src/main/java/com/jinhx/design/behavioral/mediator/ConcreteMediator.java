package com.jinhx.design.behavioral.mediator;

public class ConcreteMediator extends AbstractMediator {

    public ConcreteMediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    //处理A对B的影响
    public void aAffectB() {
        int number = a.getNumber();
        b.setNumber(number * 100);
        System.out.println("B被动改为" + b.getNumber());
    }

    //处理B对A的影响
    public void bAffectA() {
        int number = b.getNumber();
        a.setNumber(number / 100);
        System.out.println("A被动改为" + a.getNumber());
    }

}
