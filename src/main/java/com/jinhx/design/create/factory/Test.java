package com.jinhx.design.create.factory;

import com.jinhx.design.create.factory.factory.AddOperationFactory;
import com.jinhx.design.create.factory.factory.IOperationFactory;
import com.jinhx.design.create.factory.factory.SubOperationFactory;
import com.jinhx.design.create.factory.operation.AbstractOperation;

public class Test {

    public static void main(String[] args) {
        IOperationFactory addOperationFactory = new AddOperationFactory();
        AbstractOperation addAbstractOperation = addOperationFactory.CreateOption();
        addAbstractOperation.setValue1(1);
        addAbstractOperation.setValue2(2);
        System.out.println(addAbstractOperation.getResule());

        IOperationFactory subOperationFactory = new SubOperationFactory();
        AbstractOperation subAbstractOperation = subOperationFactory.CreateOption();
        subAbstractOperation.setValue1(1);
        subAbstractOperation.setValue2(2);
        System.out.println(subAbstractOperation.getResule());
    }

}
