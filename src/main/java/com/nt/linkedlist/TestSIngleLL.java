package com.nt.linkedlist;


public class TestSIngleLL {
    public static void main(String[] args) {
        SingleLinkedList<Object> list = new SingleLinkedList<>();

        System.out.println("size: " + list.size());
        System.out.println("List: " + list);

        list.add(5);
        list.add("raja");
        list.add(true);
        list.add(null);
        System.out.println("size: " + list.size());
        System.out.println("List: " + list);

    }
}