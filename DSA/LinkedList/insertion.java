package DSA.LinkedList;

class Node {
    int data;
    Node next;    

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class insertion {
    public static void main(String[] args) {
        // creating Nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linkiing Nodes
        first.next = second;
        second.next = third;

        // printing the List
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data +  " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
