package com.jinhx.design.factory.factory;

import com.jinhx.design.factory.operation.AddOperation;
import com.jinhx.design.factory.operation.Operation;

public class AddOperationFactory implements IOperationFactory{

    @Override
    public Operation CreateOption() {
        return new AddOperation();
    }

}
