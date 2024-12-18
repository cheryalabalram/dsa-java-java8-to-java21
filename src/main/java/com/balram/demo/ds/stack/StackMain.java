package com.balram.demo.ds.stack;

public class StackMain {

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Pop - " + s.pop());
        System.out.println("Pop - " + s.pop());
        System.out.println("Pop - " + s.pop());
        System.out.println("Pop - " + s.pop());
        System.out.println("Pop - " + s.pop());

        s.peek();
    }

}
