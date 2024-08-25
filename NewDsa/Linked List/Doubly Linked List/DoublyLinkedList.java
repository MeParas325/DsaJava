public class DoublyLinkedList {
        
        private Node head;
        private Node tail;
        private int size;


        public DoublyLinkedList() {
            this.size = 0;
        }

        public void insertAtFirst(int data) {

            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            
            if(tail == null) tail = head;

            size++;

        }

        public void insertAtEnd(int data) {

            Node newNode = new Node(data);

            if(head == null) {
                newNode.next = head;
                head = newNode;
                tail = head;
                return;
            }


            tail.next = newNode;
            newNode.next = null;
            newNode.prev = tail;
            tail = tail.next;

            size++;
        }

        public void insertAtPosition(int position, int data) {

            if(head == null) {
                System.out.println("List is empty.");
                return;
            }

            if(position == 0) {
                insertAtFirst(data);
                return;
            }

            if(position == size) {
                insertAtEnd(data);
                return;
            }

            if(position > size) {
                System.out.println("Position is greater then the size of the list.");
                return;
            }

            Node temp = head;

            for(int i = 1; i < position; i++) temp = temp.next;

            Node newNode = new Node(data, temp, temp.next.next);
            temp.next = newNode;

            size++;

        }

        public void deleteFirst() {

            if(head == null) {
                System.out.println("List is empty.");
                return;
            }

            if(head.next == null) {
                head = null;
                return;
            }

            Node temp = head;

            temp = temp.next;
            temp.prev = null;
            head = temp;

            size--;
        }

        public void deleteLast() {

            if(head == null) {
                System.out.println("List is empty");
                return;
            }

            if(head.next == null) {
                head = null;
                tail = null;
                return;
            }

            tail = tail.prev;
            tail.next = null;

            size--;

        }

        public void deleteAtPosition(int position) {

            if(position == 0) {
                deleteFirst();
                return;
            }

            System.out.println("Size is: " + size);

            if(position == size) {
                deleteLast();
                return;
            }

            if(position > size) {
                System.out.println("Position is greater than the size of the linked list, Cannot perform delete operation");
                return;
            }

            Node temp = head;

            for(int i = 1; i < position; i++) temp = temp.next;

            temp.next = temp.next.next;
            temp.next.prev = temp;

            size--;

        }



        public void display() {

            if(head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;
            
            System.out.print("null" + " -> ");
            while(temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");


        }

        private class Node {
            private int data;
            private Node prev;
            private Node next;

            public Node(int data) {
                this.data = data;
            }

            public Node(int data, Node prev, Node next) {
                this.data = data;
                this.prev = prev;
                this.next = next;
            }

        }
    
}
