package com.nt.linkedlist;

/*
 *Single linked list
 */
public class SingleLinkedList<E> {
  private Node<E> head;
   private int size;

    public SingleLinkedList() {
        this.size = 0;
        head = null;
    }

   private static class Node<E>{
       private E data;
       private Node<E> next;

       public Node(E data) {
           this.data = data;
           this.next=null;
       }
   }

    public int size() {
        return size;
    }

    public void add(E e) {
        addLast(e);
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null)
            head = newNode;
        else {
            Node<E> lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        size++;
    }

    public void addAt(int index, E e) {
        checkINdex(index);
        Node<E> newNode = new Node<>(e);
        Node<E> temp = head;
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
        if (head==null)
            return "[]";
        Node<E> curNode = head;
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

    public E getAt(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(index);
        else {
            Node<E> temp = head;
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
            Node<E> curNode = head;
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
           Node<E> curNode = head;
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
