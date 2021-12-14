package com.jinhx.design.create.factory.factory;

import com.jinhx.design.create.factory.operation.AbstractOperation;
import com.jinhx.design.create.factory.operation.SubAbstractOperation;

public class SubOperationFactory implements IOperationFactory{

    @Override
    public AbstractOperation CreateOption() {
        return new SubAbstractOperation();
    }

}
