package com.nt.linkedlist.test;
/* proof of concept
*
* This shows how linked list
*  node connected to each other
*/
public class Node {
    private int data;
    private Node next;
    private Node prev;

    public Node head;

    public Node(int data) {
        this.data = data;
        this.next=null;
        this.prev=null;
    }

    public static void main(String[] args) {
        Node head;
        Node a=new Node(1);
        System.out.println("A hashcode: "+a);
        Node b=new Node(2);
        System.out.println("B hashcode: "+b);
        Node c=new Node(3);
        System.out.println("C hashcode: "+c);
        Node d=new Node(4);
        System.out.println("D hashcode: "+d);

        //connection of nodes
        //head always pointing to first element
        head=a;
        //node 1
        a.prev=null;
        a.next=c;
        //node 2
//        b.prev=a;
//        b.next=c;
        //node 3
        c.prev=a;
        c.next=d;
        //node 4
        d.prev=c;
        d.next=null;
        System.out.println();
        System.out.println("data: "+a.data);
        System.out.println("prev: "+a.prev);
        System.out.println("next: "+a.next);
        System.out.println();
//        System.out.println("data: "+b.data);
//        System.out.println("prev: "+b.prev);
//        System.out.println("next: "+b.next);
        System.out.println();
        System.out.println("data: "+c.data);
        System.out.println("prev: "+c.prev);
        System.out.println("next: "+c.next);
        System.out.println("c pre data: "+c.prev.data);
        System.out.println();
        System.out.println("data: "+d.data);
        System.out.println("prev: "+d.prev);
        System.out.println("next: "+d.next);
        System.out.println();
        System.out.println("Head: "+head);
    }
}
