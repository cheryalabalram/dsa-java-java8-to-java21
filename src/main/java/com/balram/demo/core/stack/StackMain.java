package com.balram.demo.core.stack;

public class StackMain {
    public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.print();

    }
}
