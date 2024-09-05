package com.balram.demo.ds.list;

public class ListRunner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(5);
        list.insert(8);
        list.insert(1);
        list.insert(2);
        list.insertAtStart(0);
        list.insertWithIndex(2, 13);
        list.print();
        list.removeIndexAt(1);
        list.print();

        list.reverseIteratively();
        list.print();
    }
}
