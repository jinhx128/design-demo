package com.jinhx.design.create.factory;

import com.jinhx.design.create.factory.factory.AddOperationFactory;
import com.jinhx.design.create.factory.factory.IOperationFactory;
import com.jinhx.design.create.factory.factory.SubOperationFactory;
import com.jinhx.design.create.factory.operation.Operation;

public class Test {

    public static void main(String[] args) {
        IOperationFactory addOperationFactory = new AddOperationFactory();
        Operation addOperation = addOperationFactory.CreateOption();
        addOperation.setValue1(1);
        addOperation.setValue2(2);
        System.out.println(addOperation.getResule());

        IOperationFactory subOperationFactory = new SubOperationFactory();
        Operation subOperation = subOperationFactory.CreateOption();
        subOperation.setValue1(1);
        subOperation.setValue2(2);
        System.out.println(subOperation.getResule());
    }

}
