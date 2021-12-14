package com.jinhx.design.behavioral.responsibility;

public class Test {

    public static void main(String[] args) {
        AbstractClerk clerk = new Clerk();
        AbstractClerk leader = new Leader();
        AbstractClerk manager = new Manager();

        // 设置链路
        clerk.setSuperior(leader);
        leader.setSuperior(manager);

        // 有人借款10000元
        clerk.approveRequest(new BorrowRequest(10000));

        // 有人借款50000元
        clerk.approveRequest(new BorrowRequest(50000));
    }

}
