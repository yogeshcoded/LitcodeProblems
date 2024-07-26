package com.nt.linkedlist;


public class TestSIngleLL {
    public static void main(String[] args) {
        LL list = new LL();


        System.out.println("retrieve By index " + list.getAt(1));
        System.out.println("size: " + list.size());
        System.out.println("List: " + list);
        System.out.println("===============");
       // list.removeLast();
       list.removeAt(6);
        System.out.println("After rm List: " + list);
        System.out.println("size: " + list.size());
    }
}
