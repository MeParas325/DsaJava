package com.paras;

import java.util.ArrayDeque;
import java.util.Deque;

public class inBuiltDequee {

    public static void main(String args[]) {

        Deque<Integer> arrDeque = new ArrayDeque<>();

        arrDeque.add(45);
        arrDeque.addLast(67);
        arrDeque.addFirst(23);
        arrDeque.removeFirst();

        System.out.println(arrDeque);
    }
}
