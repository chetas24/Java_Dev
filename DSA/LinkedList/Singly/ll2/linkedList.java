package DSA.LinkedList.Singly.ll2;

public class linkedList {

    private ListNode head;
    private ListNode tail;
    @SuppressWarnings("unused")
    private int size;
    
    public linkedList() {
        this.size = 0;
    }

    public void insertFirst(int data)
    {
        ListNode listNode = new ListNode(data);
        listNode.next = head;
        head = listNode;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void display()
    {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    private class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
        }

        @SuppressWarnings("unused")
        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
