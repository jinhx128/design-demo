package com.jinhx.design.create.prototype.two;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    private Map<String, IRealizetype> map = new HashMap<>();

    public PrototypeManager() {
        map.put("realizetypeA", new RealizetypeA());
        map.put("realizetypeB", new RealizetypeB());
    }

    public void addRealizetype(String key, IRealizetype IRealizetype) {
        map.put(key, IRealizetype);
    }

    public IRealizetype getRealizetype(String key) {
        IRealizetype temp = map.get(key);
        return (IRealizetype) temp.clone();
    }

}
