package com.paras;

import java.util.Stack;

public class InBuiltStack {

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();

        stack.push(45);
        stack.push(78);
        stack.push(2);
        stack.push(67);
        stack.push(90);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
