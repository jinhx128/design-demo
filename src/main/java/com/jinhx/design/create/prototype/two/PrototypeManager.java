package com.jinhx.design.create.prototype.two;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    private Map<String, Realizetype> map = new HashMap<>();

    public PrototypeManager() {
        map.put("realizetypeA", new RealizetypeA());
        map.put("realizetypeB", new RealizetypeB());
    }

    public void addRealizetype(String key, Realizetype realizetype) {
        map.put(key, realizetype);
    }

    public Realizetype getRealizetype(String key) {
        Realizetype temp = map.get(key);
        return (Realizetype) temp.clone();
    }

}
