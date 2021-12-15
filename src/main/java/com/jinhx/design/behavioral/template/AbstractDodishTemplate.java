package com.jinhx.design.behavioral.template;

public abstract class AbstractDodishTemplate {

    /**
     * 具体的整个过程
     */
    protected void dodish(){
        this.preparation();
        this.doing();
        this.carriedDishes();
        this.washingDishes();
    }

    /**
     * 备料
     */
    public abstract void preparation();

    /**
     * 做菜
     */
    public abstract void doing();

    /**
     * 上菜
     */
    public abstract void carriedDishes ();

    /**
     * 洗盘子
     */
    public void washingDishes (){
        System.out.println("洗盘子");
    }

}
