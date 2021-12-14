package com.jinhx.design.create.factory.factory;

import com.jinhx.design.create.factory.operation.AbstractOperation;
import com.jinhx.design.create.factory.operation.MulAbstractOperation;

public class MulOperationFactory implements IOperationFactory{

    @Override
    public AbstractOperation CreateOption() {
        return new MulAbstractOperation();
    }

}
