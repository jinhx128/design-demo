package com.jinhx.design.factory;

import com.jinhx.design.factory.factory.AddOperationFactory;
import com.jinhx.design.factory.factory.IOperationFactory;
import com.jinhx.design.factory.factory.SubOperationFactory;
import com.jinhx.design.factory.operation.Operation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        IOperationFactory addOperationFactory = new AddOperationFactory();
        Operation addOperation = addOperationFactory.CreateOption();
        addOperation.setValue1(1);
        addOperation.setValue2(2);
        log.info(String.valueOf(addOperation.getResule()));

        IOperationFactory subOperationFactory = new SubOperationFactory();
        Operation subOperation = subOperationFactory.CreateOption();
        subOperation.setValue1(1);
        subOperation.setValue2(2);
        log.info(String.valueOf(subOperation.getResule()));
    }

}
