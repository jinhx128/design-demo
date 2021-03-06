package com.jinhx.design.structural.flyweight;

public class ConcreteAbstractWebsite extends AbstractWebsite {

    /**
     * 发布类型
     */
    private String type;

    public ConcreteAbstractWebsite(String type) {
        this.type = type;
    }

    /**
     * 发布
     */
    @Override
    public void publish(User user) {
        System.out.println("用户「"+user.getName()+"」发布的网站形式为「" + type+"」");
    }

}
