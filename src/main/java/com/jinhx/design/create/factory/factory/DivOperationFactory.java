package com.jinhx.design.create.factory.factory;

import com.jinhx.design.create.factory.operation.DivOperation;
import com.jinhx.design.create.factory.operation.Operation;

public class DivOperationFactory implements IOperationFactory{

    @Override
    public Operation CreateOption() {
        return new DivOperation();
    }

}
