package com.nt.linkedlist.impl;

import java.util.NoSuchElementException;

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

    public int size() {
        return size;
    }

    public void addFirst(int x) {
        Node newNode = new Node(x);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int x) {
        Node newNode = new Node(x);
        if (head == null)
            head = newNode;
        else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            newNode.prev = lastNode;
        }
        size++;
    }

    public void add(int x) {
        addLast(x);
    }

    public void insertAt(int index, int x) {
        checkIndex(index);
        if (index == 1)
            addFirst(x);
        else if (index == size)
            addLast(x);
        else {
            Node curNode = head;
            for (int i = 1; i < index; i++) {
                curNode = curNode.next;
            }
            Node temp = new Node(x);
            temp.next = curNode;
            temp.prev = curNode.prev;
            curNode.prev.next = temp;
            curNode.prev = temp;

        }
    }

    public int get(int index) {
        checkIndex(index);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean contains(int x) {
        return indexOf(x) > 0;
    }

    public int indexOf(int x) {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            Node temp = head;
            int index = 0;
            while (temp != null) {
                if (temp.data == x)
                    return index;
                temp = temp.next;
                index++;
            }
        }
        return -1;
    }

    public void removeFirst() {
        if (head == null)
            throw new NoSuchElementException();
        else {
            head = head.next;
            head.prev = null;
        }
    }
    public int removeLast() {
        if (head == null)
            throw new NoSuchElementException();
        else if (head.next==null) {
            int x=head.data;
           head=null;
            return x;
        } else {
           Node temp=head;
           while (temp.next!=null){
               temp=temp.next;
           }
           temp.prev.next=null;
           temp.prev=null;
           return temp.data;
        }
    }
    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(index);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (head == null) return "[]";
        else {
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
        }
        return sb.toString();
    }


}
