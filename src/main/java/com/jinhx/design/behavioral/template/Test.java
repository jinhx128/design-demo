package com.jinhx.design.behavioral.template;

public class Test {

    public static void main(String[] args) {
        System.out.println("--来盘西红柿炒鸡蛋--");
        AbstractDodishTemplate eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println("--来盘红烧肉--");
        AbstractDodishTemplate bouilli = new Bouilli();
        bouilli.dodish();
    }

}
