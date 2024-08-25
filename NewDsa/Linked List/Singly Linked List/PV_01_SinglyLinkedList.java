public class PV_01_SinglyLinkedList{

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // insert at beginning
        list.insertAtFirst(1);
        list.insertAtFirst(53);
        list.insertAtFirst(23);
        list.insertAtFirst(547);

        // insert at last
        list.insertAtLast(11);
        list.insertAtLast(45);

        // insert at position
        // list.insertAtPosRec2(0, 456);
        list.insertAtPosRec2(2, 356);
        // list.insertAtPosRec2(4, 3564);
        // list.insertAtPosRec2(10, 1560);
        
        // delete at beginning
        // list.deleteAtBeginning();
        // list.deleteAtBeginning();

        // delete at last
        // list.deleteAtLast();
        // list.deleteAtLast();

        // delete at position
        // list.deleteAtPosition(0);
        // list.deleteAtPosition(3);
        // list.deleteAtPosition(1);

        list.display();
    }
}