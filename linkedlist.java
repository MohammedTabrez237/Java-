public class linkedlist {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void deleteByKey(int key) {
        Node temp = head;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        Node prev = null;
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Linked List after inserting at the end:");
        list.printList();

        list.insertAtBeginning(5);
        System.out.println("Linked List after inserting at the beginning:");
        list.printList();

        list.insertAfter(list.head.next, 15);
        System.out.println("Linked List after inserting 15 after the second node:");
        list.printList();

        list.deleteByKey(20);
        System.out.println("Linked List after deleting node with data 20:");
        list.printList();
    }
}
