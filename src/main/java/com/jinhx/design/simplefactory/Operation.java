package com.jinhx.design.simplefactory;

import lombok.Data;

@Data
public abstract class Operation {

    private double value1 = 0;
    private double value2 = 0;

    protected abstract double getResule();

}
