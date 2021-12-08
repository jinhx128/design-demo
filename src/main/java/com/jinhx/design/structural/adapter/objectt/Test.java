package com.jinhx.design.structural.adapter.objectt;

public class Test {

    public static void main(String[] args) {
        // 使用适配类
        IPowerTarget powerAdapter = new PowerAdapter(new PowerAdaptee());
        System.out.println(powerAdapter.output5V());

        // 使用普通类
        IPowerTarget powerTarget = new PowerTarget();
        System.out.println(powerTarget.output5V());
    }

}
