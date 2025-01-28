package com.balram.demo.actions.SG.main;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S_Emp_Sort_By_Id_Distinct {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(10L, "Balram"), new Employee(9L, "Cheryala"), new Employee(9L, "Cheryala"), new Employee(9L, "Cheryala"), new Employee(1L, "cbalram"), new Employee(34L, "Siddipet"));

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee::name, Collectors.counting()));

        Stream<Employee> reversed = list.stream().sorted(Comparator.comparing(Employee::name).reversed());

        Optional<Employee> min = list.stream().min(Comparator.comparingLong(Employee::id));

        Optional<Employee> max = list.stream().max(Comparator.comparingLong(e -> e.id));

        collect.forEach((name, count) -> {
            if (count > 1) {
                System.out.println("Duplicate name - " + name);
            }
        });

        List<Employee> et = list.stream().filter(e -> e.name.endsWith("et")).toList();

        Stream<Employee> limit = list.stream().sorted(Comparator.comparing(Employee::name)).skip(1).limit(4);

        System.out.println(reversed.findFirst());
        System.out.println(min.get());
        System.out.println(max.get());
        System.out.println(et.getFirst());
        System.out.println(limit.findAny());
    }

    public record Employee(Long id, String name) {
        @Override
        public String toString() {
            return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }
}
