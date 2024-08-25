public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void insertAtFirst(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if(tail == null) tail = head;

        size += 1;
    }

    public void insertAtLast(int data) {

        if(tail == null) insertAtFirst(data);

        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;

        size += 1;
    }

    public void insertAtPosition(int position, int data) {

        if(position == 0) {
            insertAtFirst(data);
            return;
        }

        if(position == size) {
            insertAtLast(data);
            return;
        }

        if(position > size) {
            System.out.println("Position is greater then the size of the list.");
            return;
        }

        Node temp = head;

        for(int i = 1; i < position; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(data, temp.next);
        temp.next = newNode;

        size += 1;
    }

    public void insertAtPosRec(int position, int data) {

        if(position == 0) {
            insertAtFirst(data);
            return;
        }

        if(position == size) {
            insertAtLast(data);
            return;
        }

        if(position > size) {
            System.out.println("Position is greter than the size of list, Cannot perform insert operation");
            return;
        }
        Node temp = head;
        insertPosRecHelper(position, data, temp, 1);

        size += 1;
    }

    public void insertPosRecHelper(int position, int data, Node temp, int currentPosition) {

        if(currentPosition == position) {
            Node newNode = new Node(data, temp.next);
            temp.next = newNode;
            return;
        }

        temp = temp.next;

        insertPosRecHelper(position, data, temp, ++currentPosition);
        
    }

    public Node insertAtPosRec2(int position, int data) {

        if(position == 0) {
            Node newNode = new Node(data, head);
            head = newNode;
            return head;
        }

        if(position == size) {
            Node newNode = new Node(data, null);
            tail.next = newNode;
            tail = newNode;

            return head;
        }

        if(position > size) {
            System.out.println("Position is greter than the size of list, Cannot perform insert operation");
            return head;
        }
        Node temp = head;
        head = insertPosRecHelper2(position, data, temp, 0);

        size += 1;
        return head;
    }

    public Node insertPosRecHelper2(int position, int data, Node temp, int currentPosition) {

        if(currentPosition == position - 1) {
            System.out.println(temp.data);
            System.out.println(temp.next.data);
            Node newNode = new Node(data, temp.next);
            temp.next = newNode;
            return temp;
        }

        temp = temp.next;

        temp.next = insertPosRecHelper2(position, data, temp, currentPosition + 1);
        System.out.println(currentPosition);
        return temp;
        
    }

    public void deleteAtBeginning() {

        if(head == null) {
            System.out.println("List is empty, Cannot perform delete operation.");
            return;
        }

        head = head.next;

        size--;
    }

    public void deleteAtLast() {


        if(head == null) {
            System.out.println("List is empty, Cannot perform delete operation.");
            return;
        }

        if(head.next == null) {
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;

        size--;
    }

    public void deleteAtPosition(int position) {

        if(position == 0) {
            deleteAtBeginning();
            return;
        }


        if(position == size) {
            deleteAtLast();
        }

        Node temp = head;

        for(int i = 1; i < position; i++) temp = temp.next;

        Node deleteNode = temp.next;
        temp.next = temp.next.next;
        deleteNode.next = null;

        size--;
    }

    public void display() {

        Node temp = head;

        if(temp == null) {
            System.out.println("Linked List is empty");
            return;
        }

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
