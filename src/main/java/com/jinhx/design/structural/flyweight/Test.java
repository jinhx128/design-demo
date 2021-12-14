package com.jinhx.design.structural.flyweight;

public class Test {

    public static void main(String[] args) {
        AbstractWebsite abstractWebsite1 = WebsiteFactory.getWebsite("新闻");
        abstractWebsite1.publish(new User("张三"));
        abstractWebsite1.publish(new User("李四"));

        AbstractWebsite abstractWebsite2 = WebsiteFactory.getWebsite("博客");
        abstractWebsite2.publish(new User("王五"));
        abstractWebsite2.publish(new User("赵六"));

        AbstractWebsite abstractWebsite3 = WebsiteFactory.getWebsite("公众号");
        abstractWebsite3.publish(new User("陈七"));
        abstractWebsite3.publish(new User("胡八"));

        System.out.println("Website对象的个数：" + WebsiteFactory.getCount());
    }

}
