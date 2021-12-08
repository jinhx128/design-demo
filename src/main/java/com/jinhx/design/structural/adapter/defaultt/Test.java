package com.jinhx.design.structural.adapter.defaultt;

public class Test {

    public static void main(String[] args) {
        IOperationTarget myOperation1 = new MyOperation1();
        myOperation1.operation1();
        myOperation1.operation2();

        IOperationTarget myOperation2 = new MyOperation2();
        myOperation2.operation1();
        myOperation2.operation2();
    }

}
