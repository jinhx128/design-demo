package com.jinhx.design.create.simplefactory;

import com.jinhx.design.create.simplefactory.factory.OperationFactory;
import com.jinhx.design.create.simplefactory.operation.Operation;

public class Test {

    public static void main(String[] args) {
        Operation addOperation = OperationFactory.createOperation("add");
        addOperation.setValue1(1);
        addOperation.setValue2(2);
        System.out.println(addOperation.getResule());

        Operation subOperation = OperationFactory.createOperation("sub");
        subOperation.setValue1(1);
        subOperation.setValue2(2);
        System.out.println(subOperation.getResule());
    }

}
