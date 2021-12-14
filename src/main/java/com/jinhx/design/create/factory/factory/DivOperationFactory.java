package com.jinhx.design.create.factory.factory;

import com.jinhx.design.create.factory.operation.DivAbstractOperation;
import com.jinhx.design.create.factory.operation.AbstractOperation;

public class DivOperationFactory implements IOperationFactory{

    @Override
    public AbstractOperation CreateOption() {
        return new DivAbstractOperation();
    }

}
