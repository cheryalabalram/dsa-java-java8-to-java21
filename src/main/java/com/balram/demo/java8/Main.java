package com.balram.demo.java8;

import java.util.Comparator;
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

    }

}