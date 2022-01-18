package com.jinhx.design.behavioral.mediator;

public abstract class AbstractMediator {

    protected AbstractColleague a;
    protected AbstractColleague b;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        this.a = a;
        this.b = b;
    }

    public abstract void aAffectB();

    public abstract void bAffectA();

}
