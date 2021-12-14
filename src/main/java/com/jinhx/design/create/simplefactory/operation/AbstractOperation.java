package com.jinhx.design.create.simplefactory.operation;

import lombok.Data;

@Data
public abstract class AbstractOperation {

    private double value1 = 0;
    private double value2 = 0;

    public abstract double getResule();

}
