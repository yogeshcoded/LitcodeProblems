package com.nt.linkedlist.test;

import com.nt.linkedlist.impl.DoublyLinkedList;


public class TestDLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(list);

        list.reverse();
        System.out.println(list);


    }
}
