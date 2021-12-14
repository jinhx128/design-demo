package com.jinhx.design.create.simplefactory.factory;

import com.jinhx.design.create.simplefactory.operation.*;

public class OperationFactory {

    public static AbstractOperation createOperation(String operation) {
        AbstractOperation oper;

        switch (operation) {
            case "add":
                oper = new AddAbstractOperation();
                break;
            case "sub":
                oper = new SubAbstractOperation();
                break;
            case "mul":
                oper = new MulAbstractOperation();
                break;
            case "div":
                oper = new DivAbstractOperation();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作");
        }

        return oper;
    }

}
