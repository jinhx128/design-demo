package com.jinhx.design.structural.facade;

public class Facade {

    private SubSystemA subSystemA;

    private SubSystemB subSystemB;

    private SubSystemC subSystemC;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public void method1() {
        subSystemA.method1();
    }

    public void method2() {
        subSystemB.method2();
    }

    public void method3() {
        subSystemC.method3();
    }

    public void method4() {
        subSystemA.method1();
        subSystemB.method2();
    }

    public void method5() {
        subSystemA.method1();
        subSystemC.method3();
    }

}
