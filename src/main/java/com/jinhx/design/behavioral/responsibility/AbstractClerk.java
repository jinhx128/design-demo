package com.jinhx.design.behavioral.responsibility;

public abstract class AbstractClerk {

    private AbstractClerk superior = null;

    protected String type;

    public void setSuperior(AbstractClerk superior) {
        this.superior = superior;
    }

    public abstract void approveRequest(BorrowRequest request);

    public AbstractClerk getSuperior(){
        return superior;
    }

    public String getType() {
        return type;
    }

}
