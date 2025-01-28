package com.balram.demo.actions.SG.main;

import java.util.*;

public class S_Employee implements Comparable<S_Employee> {

    private String name;
    private Integer age;
    private Double salary;

    public S_Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString(){
        return this.getName() + " "+this.getSalary();
    }

    public static void main(String[] args) {

        List<S_Employee> list = new ArrayList<>(List.of(
                new S_Employee("balram", 23, 12.0),
                new S_Employee("cheryala", 22, 16.0),
                new S_Employee("siddipet", 26, 11.0)
        ));

//        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        Collections.sort(list);
        Collections.reverse(list);

        list.forEach( e -> System.out.println(e));


    }

    @Override
    public int compareTo(S_Employee o) {
        return o.getSalary().compareTo(this.getSalary());
    }
}
