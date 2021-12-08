package com.jinhx.design.create.simplefactory.factory;

import com.jinhx.design.create.simplefactory.operation.*;

public class OperationFactory {

    public static Operation createOperation(String operation) {
        Operation oper = null;

        switch (operation) {
            case "add":
                oper = new AddOperation();
                break;
            case "sub":
                oper = new SubOperation();
                break;
            case "mul":
                oper = new MulOperation();
                break;
            case "div":
                oper = new DivOperation();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作");
        }

        return oper;
    }

}
