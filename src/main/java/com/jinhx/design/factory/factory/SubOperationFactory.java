package com.jinhx.design.factory.factory;

import com.jinhx.design.factory.operation.Operation;
import com.jinhx.design.factory.operation.SubOperation;

public class SubOperationFactory implements IOperationFactory{

    @Override
    public Operation CreateOption() {
        return new SubOperation();
    }

}
