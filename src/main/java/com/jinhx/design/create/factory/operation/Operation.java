package com.jinhx.design.create.factory.operation;

import lombok.Data;

@Data
public abstract class Operation {

    private double value1 = 0;
    private double value2 = 0;

    public abstract double getResule();

}
