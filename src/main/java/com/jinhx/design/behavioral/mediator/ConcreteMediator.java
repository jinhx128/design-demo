package com.jinhx.design.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends AbstractMediator {

    /**
     * 被中介者代理的同事
     */
    private List<AbstractColleague> abstractColleagueList;

    public ConcreteMediator() {
        abstractColleagueList = new ArrayList<>();
    }

    public void register(AbstractColleague abstractColleague) {
        if (!abstractColleagueList.contains(abstractColleague)) {
            abstractColleague.setMediator(this);
            this.abstractColleagueList.add(abstractColleague);
        }
    }

    public void relay(AbstractColleague abstractColleague) {
        abstractColleagueList.forEach(c -> {
            if (!c.equals(abstractColleague)) {
                c.receive();
            }
        });
    }

}
