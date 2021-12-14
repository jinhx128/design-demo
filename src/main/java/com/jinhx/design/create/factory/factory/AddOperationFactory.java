package com.jinhx.design.create.factory.factory;

import com.jinhx.design.create.factory.operation.AbstractOperation;
import com.jinhx.design.create.factory.operation.AddAbstractOperation;

public class AddOperationFactory implements IOperationFactory{

    @Override
    public AbstractOperation CreateOption() {
        return new AddAbstractOperation();
    }

}
