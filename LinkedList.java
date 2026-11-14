class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node n=insertAtFirst(head);
        printLinkedList(n);
        
    }

    public static void printLinkedList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static Node insertAtFirst(Node head) {
        Node newNode = new Node(40);
        newNode.next=head;
        head=newNode;
        return head;
    }
}
