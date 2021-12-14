package com.jinhx.design.behavioral.responsibility;

public abstract class AbstractClerk {

    private AbstractClerk superior = null;

    protected String type;

    public void setSuperior(AbstractClerk superior) {
        this.superior = superior;
    }

    public void approveRequest(BorrowRequest request) {
        if(getLimit() >= request.getMoney()) {
            System.out.println(getType() + "同意借款请求");
        }else {
            if(this.superior != null) {
                System.out.println(getType() + "没权限处理借款请求，请求上一级");
                this.superior.approveRequest(request);
            }else {
                System.out.println("没有人能够同意借款请求");
            }
        }
    }

    public abstract int getLimit();

    public String getType() {
        return type;
    }

}
