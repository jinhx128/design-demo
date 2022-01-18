package com.jinhx.design.behavioral.responsibility;

public class Leader extends AbstractClerk{

    public Leader() {
        super.type = "组长";
    }

    public void approveRequest(BorrowRequest request) {
        if(20000 >= request.getMoney()) {
            System.out.println("额度超过20000，" + getType() + "同意借款请求");
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
