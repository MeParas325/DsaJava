package com.paras;

public class DoublyCircularLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyCircularLinkedList() {
        this.size = 0;
    }

    public void insertAtStart(int value) {

        if(head == null) {

            Node node = new Node(value);
            node.next = node;
            node.previous = node;
            head = node;

            if(tail == null) tail = head;

            size++;
            return;

        }

        Node node = new Node(value, head, tail);
        tail.next = node;
        head = node;

        size++;
    }

    public void insertAtLast(int value) {

        if(head == null) {
            insertAtStart(value);
            return;
        }

        Node node = new Node(value, tail.next, tail);
        tail.next = node;
        tail = tail.next;

        size++;
    }

    public void insert(int value, int index) {

        if(index == 0) {
            insertAtStart(value);
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

        size++;
    }

    public void deleteAtFirst() {

        if(head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node temp = head;
        head = head.next;
        head.previous = tail;
        tail.next = head;
        temp.previous = null;
        temp.next = null;

        size--;
    }

    public void deleteAtLast() {

        if(head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node temp = tail;
        tail = tail.previous;
        tail.next = temp.next;

        temp.next = null;
        temp.previous = null;

        size--;
    }

    public void delete(int index) {

        if(head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if(index == 0) {
            deleteAtFirst();
            return;
        }

        if(index == size - 1) {
            System.out.println("Inside if");
            deleteAtLast();
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) temp = temp.next;

        Node deleteNode = temp.next;
        temp.next = deleteNode.next;
        deleteNode.next.previous = temp;

        deleteNode.next = null;
        deleteNode.previous = null;

        size--;
    }
    public void display() {
        System.out.println(size);
        if(head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        } while(temp != head);

        System.out.println(head.value);
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
