package com.balram.demo.ds.list;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Node {

    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
    }

}
