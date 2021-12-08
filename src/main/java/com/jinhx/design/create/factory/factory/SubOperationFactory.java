package com.jinhx.design.create.factory.factory;

import com.jinhx.design.create.factory.operation.Operation;
import com.jinhx.design.create.factory.operation.SubOperation;

public class SubOperationFactory implements IOperationFactory{

    @Override
    public Operation CreateOption() {
        return new SubOperation();
    }

}
