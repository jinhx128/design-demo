package com.jinhx.design.behavioral.observer;

public class ExportCompany implements ICompany {

    public void response(int number) {
        if (number > 0) {
            System.out.println("出口公司降低了" + number + "个基点利润率");
        } else if (number < 0) {
            System.out.println("出口公司提升了" + -number + "个基点利润率");
        }
    }

}

