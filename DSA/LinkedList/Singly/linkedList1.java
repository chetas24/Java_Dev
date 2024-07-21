package DSA.LinkedList.Singly;


public class linkedList1 {

    //Instance Variable
    private ListNode head;

    private static class ListNode
    {
        @SuppressWarnings("unused")
        private int data;  // Generic Type
        @SuppressWarnings("unused")
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        linkedList1 linkedlist1 = new linkedList1();
        linkedlist1.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        linkedlist1.head.next = second;
        second.next = third;
        third.next = fourth;
    }
}
