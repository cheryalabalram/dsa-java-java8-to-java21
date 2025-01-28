package com.balram.demo.actions.SG.main;

import java.util.HashMap;
import java.util.Map;

public class S_SortHashMapByValues {

    public static Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 2);
        map.put("C", 1);
        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = getMap();
        System.out.println("Sorting by values");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((each) -> System.out.println(each.getKey() + " " + each.getValue()));
        System.out.println("Sorting by Keys");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach((each) -> System.out.println(each.getKey() + " " + each.getValue()));
    }
}
