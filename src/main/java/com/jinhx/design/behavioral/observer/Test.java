package com.jinhx.design.behavioral.observer;

public class Test {

    public static void main(String[] args) {
        AbstractRate rmBrate = new RMBrate();
        ICompany importCompany = new ImportCompany();
        ICompany exportCompany = new ExportCompany();
        rmBrate.add(importCompany);
        rmBrate.add(exportCompany);
        rmBrate.change(10);
        rmBrate.change(-9);
    }

}
