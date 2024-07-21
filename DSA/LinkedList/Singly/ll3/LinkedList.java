package DSA.LinkedList.Singly.ll3;

public class LinkedList {
    private ListNode head;

    public LinkedList()
    {
        this.head = null;
    }

    public void insert(int data)
    {
        ListNode new_node = new ListNode(data);
        if (head == null) {
            head = new_node;
        }
        else
        {
            ListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new_node);
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");  // Print the data of the current node
            current = current.getNext();  // Move to the next node
        }
        System.out.println();  // Print a newline after displaying all nodes
    }
}
