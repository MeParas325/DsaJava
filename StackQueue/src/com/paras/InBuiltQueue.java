package com.paras;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {

    public static void main(String args[]) {

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(5);
        queue.add(6);
        queue.add(57);
        queue.add(2);
        queue.add(34);

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
