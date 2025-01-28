package com.balram.demo.core.pack;

public class A {

    public A send(){
        return this;
    }

    public void name(int a){
        System.out.println("name from A with - " + a);
    }

    public void name(){
        System.out.println("name without params");
    }

    public void name(int a, int b){

    }
    public void name(int a, int b, int c){
        System.out.println("final methods");
    }

    public static void name(String s){
        System.out.println("Static Name from A "+s);
    }

    public static void name(String s, String string){
        System.out.println();
    }
}
