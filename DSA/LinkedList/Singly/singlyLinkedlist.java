package DSA.LinkedList.Singly;

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    private Node head;

    public void insertAtFront(int data)
    {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void insertAtEnd(int data)
    {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void delete(int data)
    {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not Found");
        }
        else
        {
            temp.next = temp.next.next;
        }
    }
    
    public void printlist()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class singlyLinkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtFront(3);
        ll.insertAtFront(2);
        ll.insertAtFront(1);

        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.printlist();
        ll.delete(2);
        System.out.println();
        ll.printlist();
    }
}
