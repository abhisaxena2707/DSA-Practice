/*
876. Middle of the Linked List
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class MiddleElementInLinkedList {

    public static ListNode middleNodeUsingLength(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int mid = len/2 +1;
        int i=0;
        while(head!=null){
            i++;
            if(i==mid) return head;
            head=head.next;
        }
        return null;
    }

    public static ListNode middleElementUsing2Pointers(ListNode head){
        ListNode slow=head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode h1=new ListNode(1);
        ListNode h2=new ListNode(2);
        ListNode h3=new ListNode(3);
        ListNode h4=new ListNode(4);
        ListNode h5=new ListNode(5);
        ListNode h6=new ListNode(6);
        h1.next=h2;
        h2.next=h3;
        h3.next=h4;
        h4.next=h5;
        h5.next=h6;
        ListNode middle = middleElementUsing2Pointers(h1);
        while(middle!=null){
            System.out.print(middle.val+" ");
            middle=middle.next;

        }
    }
}
