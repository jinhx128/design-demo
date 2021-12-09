package com.jinhx.design.create.prototype.two;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeManager prototypeManager = new PrototypeManager();
        Realizetype realizetypeA = prototypeManager.getRealizetype("realizetypeA");
        realizetypeA.test();
        Realizetype realizetypeB = prototypeManager.getRealizetype("realizetypeB");
        realizetypeB.test();
    }

}
