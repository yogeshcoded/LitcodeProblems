package com.nt.stack;

public class Test {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(9);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(8);


        System.out.println(st);
        System.out.println("index at: " + st.search(3));
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);



    }
}
