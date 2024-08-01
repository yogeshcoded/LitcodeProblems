package com.nt.linkedlist.impl;

/*
 *Single linked list
 */
public class LL {
  private Node head;
   private int size;

    public LL() {
        this.size = 0;
        head = null;
    }

   private static class Node {
       public int data;
       private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size() {
        return size;
    }

    public void add(int e) {
        addLast(e);
    }

    public void addFirst(int e) {
        Node newNode = new Node(e);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int e) {
        Node newNode = new Node(e);
        if (head == null)
            head = newNode;
        else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        size++;
    }

    public void addAt(int index, int e) {
        checkINdex(index);
        Node newNode = new Node(e);
        Node temp = head;
        if (index == 0)
            addFirst(e);
        else if (index == size)
            addLast(e);
        else {
            for (int i = 0; i <= index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

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

    public int getAt(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(index);
        else {
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void removeFirst(){
        head=head.next;
        size--;
    }

    public void removeLast() {
            Node curNode = head;
            while (curNode.next.next != null) {
                curNode = curNode.next;
            }
            curNode.next = null;
            size--;
        }

    public void removeAt(int index){
        checkINdex(index);
       if (index==0)
           removeFirst();
       else if (index==size-1)
           removeLast();
       else {
           Node curNode = head;
           for (int i = 1; i <= index-1; i++) {
               curNode = curNode.next;
           }
           curNode.next=curNode.next.next;
           System.out.println(curNode.next);
           size--;
       }

    }

    private void checkINdex(int index){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(index);
    }

}
