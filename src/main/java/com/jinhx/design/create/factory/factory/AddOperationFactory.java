package com.jinhx.design.create.factory.factory;

import com.jinhx.design.create.factory.operation.Operation;
import com.jinhx.design.create.factory.operation.AddOperation;

public class AddOperationFactory implements IOperationFactory{

    @Override
    public Operation CreateOption() {
        return new AddOperation();
    }

}
