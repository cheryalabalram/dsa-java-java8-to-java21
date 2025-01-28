package com.balram.demo.java8;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class EmpMain {

    static List<Employee> employees = null;

    static {
        employees =
                List.of(
                        new Employee("balram", 27, 12000.0),
                        new Employee("cheryala", 26, 18000.0),
                        new Employee("hari", 29, 10000.0),
                        new Employee("hara", 27, 43000.0)
                );
    }

    public static void main(String[] args) {
        employees
                .forEach(System.out::println);

        System.out.println("*****************************");
        List<Employee> ha = employees
                .stream()
                .filter(employee -> employee.getName().startsWith("ha"))
                .toList();
        ha.forEach(e -> System.out.println("Start With with using Filter - " +e));
        System.out.println("*****************************");

        OptionalDouble limit = employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .average();
        System.out.println("average" + limit);

        System.out.println("*****************************");
        OptionalDouble average = employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .average();

        System.out.println("average " +average);

        System.out.println("*****************************");
        List<List<Employee>> list = List.of(employees);
        List<Employee> list1 = list
                .stream()
                .flatMap(Collection::stream)
                .toList();
        list1.forEach(e -> System.out.println(e.getName()));
        System.out.println("*****************************");
        System.out.println("sort by employee name and employee salary desc");

        Comparator<Employee> cmprtr = (e1, e2) -> e1.getName().compareTo(e2.getName());

        Stream<Employee> sorted = employees
                .stream()
                .sorted(cmprtr.reversed()
//                .sorted(Comparator.comparing(Employee::getName)
//                        .thenComparingDouble(Employee::getSalary)
//                        .reversed()
                );
        sorted
                .forEach(e -> System.out.println(e.getName() + " "+e.getSalary()));
        System.out.println("*****************************");
    }


}
