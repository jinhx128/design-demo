package com.jinhx.design.simplefactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        Operation operationAdd = OperationFactory.createOperation("add");
        operationAdd.setValue1(1);
        operationAdd.setValue2(2);
        log.info(String.valueOf(operationAdd.getResule()));

        Operation operationSub = OperationFactory.createOperation("sub");
        operationSub.setValue1(1);
        operationSub.setValue2(2);
        log.info(String.valueOf(operationSub.getResule()));
    }

}
