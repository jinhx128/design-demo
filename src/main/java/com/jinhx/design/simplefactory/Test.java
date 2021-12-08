package com.jinhx.design.simplefactory;

import com.jinhx.design.simplefactory.factory.OperationFactory;
import com.jinhx.design.simplefactory.operation.Operation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        Operation addOperation = OperationFactory.createOperation("add");
        addOperation.setValue1(1);
        addOperation.setValue2(2);
        log.info(String.valueOf(addOperation.getResule()));

        Operation subOperation = OperationFactory.createOperation("sub");
        subOperation.setValue1(1);
        subOperation.setValue2(2);
        log.info(String.valueOf(subOperation.getResule()));
    }

}
