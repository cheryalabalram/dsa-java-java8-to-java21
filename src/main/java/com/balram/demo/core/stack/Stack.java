package com.balram.demo.core.stack;

public class Stack {
    int[] arr;
    int top;
    int capacity;

    public Stack(int size){
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int value){
        if(top + 1 == capacity){
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = value;
    }

    public int pop(){
        return arr[top --];
    }

    public int peek(){
        return arr[top];
    }

    public void print(){
        for (int a : arr){
            System.out.println(a);
        }
    }
}
