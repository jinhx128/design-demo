package com.jinhx.design.behavioral.responsibility;

public class Clerk extends AbstractClerk{

    public Clerk() {
        super.type = "职员";
    }

    public void approveRequest(BorrowRequest request) {
        if(5000 >= request.getMoney()) {
            System.out.println("额度超过5000，" + getType() + "同意借款请求");
        }else {
            if(getSuperior() != null) {
                System.out.println(getType() + "没权限处理借款请求，请求上一级");
                getSuperior().approveRequest(request);
            }else {
                System.out.println("没有人能够同意借款请求");
            }
        }
    }

}
