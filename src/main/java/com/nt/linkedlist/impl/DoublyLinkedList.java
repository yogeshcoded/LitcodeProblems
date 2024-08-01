package com.nt.linkedlist.impl;

public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void add(int x){
        Node newNode =new Node(x);
        if (head==null){
            head=newNode;
        }
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        if (head==null) return "[]";
        else {
            Node curNode = head;
            sb.append("[");
            while (curNode != null) {
                sb.append(curNode.data).append(", ");
                curNode = curNode.next;
            }
            int start=sb.lastIndexOf(", ");
            int end=start+2;
            sb.delete(start,end);
            sb.append("]");
        }
        return sb.toString();
    }
}
