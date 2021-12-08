package com.jinhx.design.create.facade;

public class Test {

    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder1 = new ConcreteBuilder();
        People people1 = concreteBuilder1.build();
        System.out.println(people1);

        ConcreteBuilder concreteBuilder2 = new ConcreteBuilder();
        People people2 = concreteBuilder2.bulidName("李白").bulidAge("24").build();
        System.out.println(people2);

        ConcreteBuilder concreteBuilder3 = new ConcreteBuilder();
        People people3 = concreteBuilder3.bulidName("胡桃").bulidAge("16").bulidSex("女").build();
        System.out.println(people3);
    }

}
