package com.balram.demo.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static List<Employee> employees(){
        return List.of(
                new Employee("Aerin", 3, 1000),
                new Employee("Aerin", 3, 1000),
                new Employee("BasedOn", 20, 10000),
                new Employee("BasedOn", 20, 10000),
                new Employee("Cesarina", 30, 100000),
                new Employee("Cesarina", 30, 100000)
                );
    }

    public static Map<String, Integer> getMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("z", 1);
        map.put("x", 2);
        map.put("w", 3);

        return map;
    }

    public static void main(String[] args) {
        List<Employee> employees = employees();
        Map<String, List<Employee>> collect =
                employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getName));

        collect.forEach((key, value) -> System.out.println(key + " " + value));

        List<Employee> limit = employees
                .stream()
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(limit);

        List<String> list = employees
                .stream()
                .map(Employee::getName)
                .toList();

        System.out.println(list);

        System.out.println("Hashmap with sorted byValues in map");
        Map<String, Integer> map = getMap();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach( e-> System.out.println(e.getKey() + " : "+e.getValue()));

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach( e-> System.out.println(e.getKey() + " : "+e.getValue()));
    }

}