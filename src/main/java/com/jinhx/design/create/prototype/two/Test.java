package com.jinhx.design.create.prototype.two;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeManager prototypeManager = new PrototypeManager();
        IRealizetype realizetypeA = prototypeManager.getRealizetype("RealizetypeA");
        realizetypeA.test();
        IRealizetype realizetypeB = prototypeManager.getRealizetype("RealizetypeB");
        realizetypeB.test();
    }

}
