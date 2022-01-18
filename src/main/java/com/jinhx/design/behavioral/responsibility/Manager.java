package com.jinhx.design.behavioral.responsibility;

public class Manager extends AbstractClerk{

    public Manager() {
        super.type = "经理";
    }

    public void approveRequest(BorrowRequest request) {
        if(100000 >= request.getMoney()) {
            System.out.println("额度超过100000，" + getType() + "同意借款请求");
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
