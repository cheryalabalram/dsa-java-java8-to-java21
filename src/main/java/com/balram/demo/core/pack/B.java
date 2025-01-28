package com.balram.demo.core.pack;

public class B extends A{

    public B send(){
        return this;
    }

    public void name(int b){
        System.out.println("name from B with value " + b);
    }

    public void name(){
        System.out.println("casual Name B method as method overloading concept");
    }

    public void name(int a, int b){
        System.out.println("from b "+a+ "  "+b);
    }

    public void name(int a, int b, int c){
        System.out.println("from b "+a+ "  "+b);
    }

    public static void name(String s){
        System.out.println("Static Name from B "+ s);
    }
}
