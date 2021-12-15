package com.jinhx.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRate {

    protected List<ICompany> iCompanyList = new ArrayList<>();

    /**
     * 增加观察者方法
     */
    public void add(ICompany iCompany) {
        iCompanyList.add(iCompany);
    }

    /**
     * 删除观察者方法
     */
    public void remove(ICompany iCompany) {
        iCompanyList.remove(iCompany);
    }

    public abstract void change(int number);

}
