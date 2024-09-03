package com.paras;

public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.size = 0;
    }

    public void insertAtFirst(int value) {

        if(head == null) {

            Node node = new Node(value);
            head = node;
            head.next = head;
            tail = head;

            return;
        }

        Node node = new Node(value, head);
        head = node;
        tail.next = head;

        size++;

    }

    public void insertAtLast(int value) {

        if(tail == null) {
            insertAtFirst(value);
            return;
        }

        Node temp = new Node(value, tail.next);
        tail.next = temp;
        tail = tail.next;

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

        Node node = new Node(value);

        Node temp = head;
        for(int i = 1; i < index; i++) temp = temp.next;
        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public void deleteFirst() {

        head = head.next;
        if(tail == null) tail = head;
        tail.next = head;

        size--;

    }

    public void deleteLast() {

        if(size == 1) {
            deleteFirst();
            return;
        }

        Node temp = head;
        while(temp.next != tail) temp = temp.next;
        temp.next = tail.next;
        tail.next = null;
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

    public void display() {

        Node temp = head;

        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while(temp != head);

        System.out.println();

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
}
