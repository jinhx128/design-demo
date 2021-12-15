package com.jinhx.design.create.prototype.two;

public class RealizetypeA implements IRealizetype {

    @Override
    public Object clone() {
        RealizetypeA realizetypeA = null;
        try {
            realizetypeA = (RealizetypeA) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝RealizetypeA失败!");
        }
        return realizetypeA;
    }

    @Override
    public void test() {
        System.out.println("执行RealizetypeA方法");
    }

}
