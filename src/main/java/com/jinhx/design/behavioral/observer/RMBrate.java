package com.jinhx.design.behavioral.observer;

public class RMBrate extends AbstractRate {

    public void change(int number) {
        if (number > 0) {
            System.out.println("人民币汇率升值" + number + "个基点");
        } else if (number < 0) {
            System.out.println("人民币汇率贬值" + (-number) + "个基点");
        }
        for (ICompany obs : iCompanyList) {
            obs.response(number);
        }
    }

}

