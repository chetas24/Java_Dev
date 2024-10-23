package DSA.Stack;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack <Integer> elements = new Stack<>();
        System.out.println(elements.isEmpty());
        elements.push(11);
        elements.push(22);
        elements.push(33);
        elements.push(44);
        System.out.println(elements);
        elements.pop();
        System.out.println(elements);
   }
}
