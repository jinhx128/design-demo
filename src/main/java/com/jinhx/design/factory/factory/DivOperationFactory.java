package com.jinhx.design.factory.factory;

import com.jinhx.design.factory.operation.DivOperation;
import com.jinhx.design.factory.operation.Operation;

public class DivOperationFactory implements IOperationFactory{

    @Override
    public Operation CreateOption() {
        return new DivOperation();
    }

}
