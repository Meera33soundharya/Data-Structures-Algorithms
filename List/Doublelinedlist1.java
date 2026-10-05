package List;

public class DoublyLinkedListAll {

    // Node
    class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


    // Head
    Node head;


    // Insert at Beginning
    void insertAtBeginning(int data) {

        Node newnode = new Node(data);

        if (head != null) {
            newnode.next = head;
            head.prev = newnode;
        }

        head = newnode;
    }


    // Insert at End
    void insertAtEnd(int data) {

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newnode;
        newnode.prev = current;
    }


    // Delete at Beginning
    void deleteAtBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }


    // Delete at End
    void deleteAtEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.prev.next = null;
    }


    // Display Forward
    void displayForward() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }

        System.out.println("NULL");
    }


    // Main
    public static void main(String args[]) {

        DoublyLinkedListAll list = new DoublyLinkedListAll();


        // Insert at End
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.displayForward();


        // Insert at Beginning
        list.insertAtBeginning(5);

        list.displayForward();


        // Delete at Beginning
        list.deleteAtBeginning();

        list.displayForward();


        // Delete at End
        list.deleteAtEnd();

        list.displayForward();
    }
}