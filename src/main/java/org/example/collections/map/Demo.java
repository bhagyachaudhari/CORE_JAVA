package org.example.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        System.out.println(map.get("A"));

        Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>());
        System.out.println(syncMap.get("A"));
    }
}
