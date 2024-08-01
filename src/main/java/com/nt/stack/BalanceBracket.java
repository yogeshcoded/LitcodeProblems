package com.nt.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBracket {
    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isCorrect(s));
    }

    public static boolean isBalanced(String string) {
        Stack<Character> st = new Stack();
        for (char c : string.toCharArray()) {
            if (c == '(') {
                st.push(c);
            } else {
                if (st.isEmpty())
                    return false;
                else if (st.peek() == '(')
                    st.pop();
            }
        }
        return st.isEmpty();
    }


    public static boolean isValid(String str) {
        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return str.isEmpty();
    }

    public static boolean isCorrect(String string){
       Map<Character,Character> hm=new HashMap<>();
          hm.put('(',')');
          hm.put('[',']');
          hm.put('{','}');

          Stack<Character> st=new Stack<>();
          for (char c:string.toCharArray()){
              if (hm.containsKey(c)){
                  st.push(c);
              } else if (hm.containsValue(c)) {
                  if (!st.isEmpty() && hm.get(st.peek())==c)
                      st.pop();
              }else
                  return false;
          }

        return st.isEmpty();
    }

}
