package com.nt.linkedlist.test;

import com.nt.linkedlist.impl.DoublyLinkedList;


public class TestDLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(7);

        System.out.println(list);

        System.out.println("Remove element: "+list.removeLast());
        System.out.println(list);


    }
}
