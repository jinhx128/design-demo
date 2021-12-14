package com.jinhx.design.structural.flyweight;

public class Test {

    public static void main(String[] args) {
        Website website1 = WebsiteFactory.getWebsite("新闻");
        website1.publish(new User("张三"));
        website1.publish(new User("李四"));

        Website website2 = WebsiteFactory.getWebsite("博客");
        website2.publish(new User("王五"));
        website2.publish(new User("赵六"));

        Website website3 = WebsiteFactory.getWebsite("公众号");
        website3.publish(new User("陈七"));
        website3.publish(new User("胡八"));

        System.out.println("Website对象的个数：" + WebsiteFactory.getCount());
    }

}
