package com.jinhx.design.create.prototype.two;

public class RealizetypeB implements IRealizetype {

    @Override
    public Object clone() {
        RealizetypeB realizetypeB = null;
        try {
            realizetypeB = (RealizetypeB) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝RealizetypeB失败!");
        }
        return realizetypeB;
    }

    @Override
    public void test() {
        System.out.println("执行RealizetypeB方法");
    }

}
