package com.balram.demo.actions.SG.main;

public class SGMain {

    public static void main(String[] args) {
        SG sg = new SG();
        SG.A a = new SG.A();
        Immute i = new Immute("balram",23);
        Integer age = i.age();
        String name = i.name();
        System.out.println(age + " " + name);
        sg = null;
        a = null;
        System.gc();
    }
}
