package com.balram.demo.actions.SG.main;

public final class ImmutablePerson {
    private final String name;
    private final int age;

    // Constructor to initialize the immutable fields
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods to access the fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // No setter methods or methods that modify the state

    // Optionally, you can override toString for better readability
    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        ImmutablePerson i = new ImmutablePerson("balram",23);
        System.out.println(i);
    }
}
