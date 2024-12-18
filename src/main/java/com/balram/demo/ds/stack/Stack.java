package com.balram.demo.ds.stack;

public class Stack {
    private final int[] stack;
    private int top;


    public Stack(int top){
        this.stack = new int[top];
        this.top = -1;
    }

    public void push(int data){
        stack[++top] = data;
    }

    public int pop(){
        return stack[top--];
    }

    public void peek(){

        if(top == -1){
            System.out.println("Peek operation invoked  on Empty Stock ");
        }else {
            System.out.println(stack[top]);
        }
    }

}
