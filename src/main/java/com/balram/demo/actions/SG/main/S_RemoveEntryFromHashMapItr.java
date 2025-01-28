package com.balram.demo.actions.SG.main;

import java.util.Iterator;
import java.util.Map;

public class S_RemoveEntryFromHashMapItr {

    public static void main(String[] args) {

        Map<String, Integer> map = S_SortHashMapByValues.getMap();
        System.out.println(map.size());
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, Integer> next = iterator.next();
////            System.out.println("Before - " + next.getKey() + " - "+ next.getValue());
//            if (next.getValue() < 2){
//                iterator.remove();
//            }
//        }


        // Iterating over the map using a for-each loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                // Directly removing from the map while iterating
                map.remove(entry.getKey()); // This causes ConcurrentModificationException
            }
        }

        System.out.println(map.size());
    }
}
