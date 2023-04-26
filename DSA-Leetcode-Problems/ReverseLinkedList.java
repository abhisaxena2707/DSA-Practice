/*
206. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
 */

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode next=null;
        while(head!=null) {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;

    }

    public static void main(String[] args) {
        ListNode h1=new ListNode(1);
        ListNode h2=new ListNode(2);
        ListNode h3=new ListNode(3);
        ListNode h4=new ListNode(4);
        ListNode h5=new ListNode(5);
        h1.next=h2;
        h2.next=h3;
        h3.next=h4;
        h4.next=h5;
        h5.next=null;
        ListNode reverse = reverseList(h1);
        while(reverse!=null){
            System.out.print(reverse.val+" ");
            reverse=reverse.next;

        }
    }
}
