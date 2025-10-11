package com.balram.demo.ds.pra;

public class Stack {
    private final int[] stack;
    private int top;

    public Stack(int size) {
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int value){
        stack[++top] = value;
    }

    public int pop(){
        return stack[top --];
    }

    public int peek(){
        return stack[top];
    }

    public static void main(String[] args) throws Exception {
        Stack s = new Stack(3);
        for (int i = 1; i <= 3; i++) {
            s.push(i);
        }

        System.out.println("Peek " + s.peek());

        System.err.println("Pop "+ s.pop());

        System.out.println("Again Peek "+ s.peek());

        System.err.println("Pop "+ s.pop());

        System.out.println("Again Peek "+ s.peek());
    }

}
