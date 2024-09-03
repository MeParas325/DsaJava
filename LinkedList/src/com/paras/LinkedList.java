package com.paras;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertAtFirst(int value) {
        Node node = new Node(value, head);
        head = node;

        if(tail == null) tail = head;

        size++;
    }

    public void insertAtLast(int value) {

        if(tail == null) {
            insertAtFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int value, int index) {

        if(index == 0) {
            insertAtFirst(value);
            return;
        }

        if(index == size) {
            insertAtLast(value);
            return;
        }

        Node temp = head;

        for(int i = 1; i < index; i++) temp = temp.next;

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public void insertRec(int value, int index) {

        head = insertRec(value, index, head);

    }

    private Node insertRec(int value, int index, Node node) {

        if(index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(value, --index, node.next);
        return node;
    }

//    public void insertRec(int value, int index) {
//
//        Node temp = head;
//        insertRec(value, index, head);
//    }
//
//    private void insertRec(int value, int index, Node node) {
//
//        if(index == 0) {
//            insertAtFirst(value);
//            return;
//        }
//
//        if(index == size) {
//            insertAtLast(value);
//            return;
//        }
//
//        if(index == 1) {
//            Node temp = new Node(value, node.next);
//            node.next = temp;
//            size++;
//            return;
//        }
//
//        insertRec(value, --index, node.next);
//    }

    public void removeDuplicates() {

        removeDuplicates(head);

    }

    private void removeDuplicates(Node node) {

       while(node.next != null) {

           if(node.value == node.next.value) {
               node.next = node.next.next;
               size--;
           }
           else node = node.next;
       }

        tail = node;
    }

    public void deleteFirst() {
        head = head.next;
        if(head == null) tail = null;

        size--;
    }

    public void deleteLast() {
        if(size == 1) {
            deleteFirst();
        }

        Node temp = head;

        while(temp.next != tail) temp = temp.next;

        temp.next = null;
        tail = temp;

        size--;
    }

    public void delete(int index) {

        if(index == 0) {
            deleteFirst();
            return;
        }

        if(index == size - 1) {
            deleteLast();
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) temp = temp.next;

        Node deleteNode = temp.next;
        temp.next = deleteNode.next;
        deleteNode.next = null;

        size--;
    }

    static LinkedList merge(LinkedList list1, LinkedList list2) {

        LinkedList list3 = new LinkedList();

        if(list1 == null && list2 == null) {
            System.out.println("Both lists are empty");
            return null;
        }

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        Node head1 = list1.head;
        Node head2 = list2.head;

        while(head1 != null && head2 != null) {

            if(head1.value < head2.value) {
                list3.insertAtLast(head1.value);
                head1 = head1.next;
            } else {
                list3.insertAtLast(head2.value);
                head2 = head2.next;
            }
        }

        while(head1 != null) {
            list3.insertAtLast(head1.value);
            head1 = head1.next;
        }

        while(head2 != null) {
            list3.insertAtLast(head2.value);
            head2 = head2.next;
        }

        return list3;

    }

    public int middleEle() {

        if(head == null) return 0;

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

        }

        return slow.value;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {


        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insertAtLast(1);
        list1.insertAtLast(4);
        list1.insertAtLast(7);
        list1.insertAtLast(9);
        list1.insertAtLast(24);

        list1.display();

        list2.insertAtLast(2);
        list2.insertAtLast(6);
        list2.insertAtLast(6);
        list2.insertAtLast(12);
        list2.insertAtLast(15);
        list2.insertAtLast(20);
        list2.insertAtLast(21);

        list2.display();

        LinkedList list3 = merge(list1, list2);
        list3.display();
        System.out.println(list3.middleEle());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        Collections.sort(list);
        System.out.println(list.get(0));

    }
}
