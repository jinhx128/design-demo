package com.jinhx.design.simplefactory;

public class OperationFactory {

    public static Operation createOperation(String operation) {
        Operation oper = null;

        switch (operation) {
            case "add":
                oper = new OperationAdd();
                break;
            case "sub":
                oper = new OperationSub();
                break;
            case "mul":
                oper = new OperationMul();
                break;
            case "div":
                oper = new OperationDiv();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作");
        }

        return oper;
    }

}
