package com.jinhx.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {

    /**
     * 定义一个池容器
     */
    private static Map<String, AbstractWebsite> pool = new HashMap<>();

    public static AbstractWebsite getWebsite(String type) {
        if(!pool.containsKey(type)) {
            pool.put(type, new ConcreteAbstractWebsite(type));
        }
        return pool.get(type);
    }

    public static int getCount() {
        return pool.size();
    }

}
