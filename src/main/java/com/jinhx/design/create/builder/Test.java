package com.jinhx.design.create.builder;

public class Test {

    public static void main(String[] args) {
        ConcreteAbstractBuilder concreteAbstractBuilder1 = new ConcreteAbstractBuilder();
        People people1 = concreteAbstractBuilder1.build();
        System.out.println(people1);

        ConcreteAbstractBuilder concreteAbstractBuilder2 = new ConcreteAbstractBuilder();
        People people2 = concreteAbstractBuilder2.bulidName("李白").bulidAge("24").build();
        System.out.println(people2);

        ConcreteAbstractBuilder concreteAbstractBuilder3 = new ConcreteAbstractBuilder();
        People people3 = concreteAbstractBuilder3.bulidName("胡桃").bulidAge("16").bulidSex("女").build();
        System.out.println(people3);
    }

}
