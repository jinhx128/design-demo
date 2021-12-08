package com.jinhx.design.factory.factory;

import com.jinhx.design.factory.operation.MulOperation;
import com.jinhx.design.factory.operation.Operation;

public class MulOperationFactory implements IOperationFactory{

    @Override
    public Operation CreateOption() {
        return new MulOperation();
    }

}
