package com.paras;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public DoublyLinkedList() {
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

        Node node = new Node(value, null, tail);
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

        Node node = new Node(value, temp.next, temp);
        temp.next = node;
        node.next.previous = node;

        size++;
    }

    public void deleteFirst() {

        head = head.next;
        head.previous = null;

        size--;

    }

    public void deleteLast() {

        tail = tail.previous;
        tail.next.previous = null;
        tail.next = null;

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
        temp.next.previous = deleteNode.previous;
        deleteNode.next = null;
        deleteNode.previous = null;

        size--;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    private class Node {

        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

    }
}
