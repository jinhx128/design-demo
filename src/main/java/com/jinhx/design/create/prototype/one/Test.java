package com.jinhx.design.create.prototype.one;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println(obj1 == obj2);
    }

}
