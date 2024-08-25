public class PV_01_DoublyLinkedList{

    public static void main(String args[]) {

        DoublyLinkedList dbLinkedList = new DoublyLinkedList();

        // insert at first
        dbLinkedList.insertAtFirst(15);
        dbLinkedList.insertAtFirst(145);
        dbLinkedList.insertAtFirst(5);

        // insert at end
        dbLinkedList.insertAtEnd(1);
        dbLinkedList.insertAtEnd(14);
        dbLinkedList.insertAtEnd(35);

        // insert at position
        dbLinkedList.insertAtPosition(0, 25);
        dbLinkedList.insertAtPosition(7, 67);
        dbLinkedList.insertAtPosition(4, 56);

        // delete at first
        dbLinkedList.deleteFirst();

        // delete at last
        dbLinkedList.deleteLast();
        dbLinkedList.deleteLast();

        // delete at position
        dbLinkedList.deleteAtPosition(0);
        dbLinkedList.deleteAtPosition(3);
        dbLinkedList.deleteAtPosition(1);

        dbLinkedList.display();
    }
}