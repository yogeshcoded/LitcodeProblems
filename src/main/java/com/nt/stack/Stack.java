package com.nt.stack;


/*Stack implementation using array*/
public class Stack {

    private int[] elementData;
    private int elementCount;

    public Stack() {
        this.elementData = new int[5];
        this.elementCount = 0;

    }

    public int size() {
        return elementCount;
    }

    public int capacity() {
        return elementData.length;
    }

    public void push(int x) {
        elementData[elementCount++] = x;
    }

    public void pop() {
        elementData[elementCount-1]=0;
        elementCount--;

    }



    public int search(int x) {
        for (int i = 0; i < elementCount; i++) {
            if (elementData[i] == x)
                return i;
        }
        return -1;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (elementCount == 0) {
            return "[]";
        } else {
            sb.append("[");
            for (int i = 0; i < elementCount; i++) {
                sb.append(elementData[i]).append(", ");
            }
            int start = sb.lastIndexOf(", ");
            int end = start + 2;
            sb.delete(start, end);
            sb.append("]");
        }

        return sb.toString();

    }

}