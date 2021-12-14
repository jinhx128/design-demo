package com.jinhx.design.create.simplefactory;

import com.jinhx.design.create.simplefactory.factory.OperationFactory;
import com.jinhx.design.create.simplefactory.operation.AbstractOperation;

public class Test {

    public static void main(String[] args) {
        AbstractOperation addAbstractOperation = OperationFactory.createOperation("add");
        addAbstractOperation.setValue1(1);
        addAbstractOperation.setValue2(2);
        System.out.println(addAbstractOperation.getResule());

        AbstractOperation subAbstractOperation = OperationFactory.createOperation("sub");
        subAbstractOperation.setValue1(1);
        subAbstractOperation.setValue2(2);
        System.out.println(subAbstractOperation.getResule());
    }

}
