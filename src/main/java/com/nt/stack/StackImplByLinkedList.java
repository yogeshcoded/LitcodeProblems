package com.nt.stack;


public class StackImplByLinkedList {
    private Node head;
    private int size;


    public StackImplByLinkedList() {
        this.head = null;
        this.size = 0;
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int x){
        Node newNode = new Node(x);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void pop(){
        if (head == null)
            return;
        else {
            head =head.next;
        }
        size--;
    }

    public int peek(){
        if (head == null)
            return -1;
        else {
            return head.data;
        }

    }

    public int size(){
        return size;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curNode = head;
        sb.append("[");
        while (curNode != null) {
            sb.append(curNode.data).append(", ");
            curNode = curNode.next;
        }
        int start = sb.lastIndexOf(", ");
        int end = start + 2;
        sb.delete(start, end);
        sb.append("]");
        return sb.toString();
    }
}
