/*
142. Linked List Cycle II
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

Input: head = [3,2,0,-4,2], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Input: head = [1,2,1], pos = 0
Output: 1
Explanation: There is a cycle in the linked list, where tail connects to the first node.

Input: head = [1], pos = -1
Output: null
Explanation: There is no cycle in the linked list.
 */
public class LinkedListCycle {

    public static ListNode detectCycle(ListNode head) {
        /*
        Solution is based on Floyd's cycle detection algorithm

        What is Floyd's Cycle-Finding algorithm ?
        It is also called Hare-Tortoise algorithm
        The algorithm works by using two pointers, a slow pointer and a fast pointer.
        Initially, both pointers are set to the head of the linked list.
        The fast pointer moves twice as fast as the slow pointer.
        If there is a cycle in the linked list, eventually, the fast pointer will catch up with the slow pointer.
        If there is no cycle, the fast pointer will reach the end of the linked list.

        Approach :
        When the two pointers meet, we know that there is a cycle in the linked list.
        We then reset the slow pointer to the head of the linked list and move both pointers at the same pace, one step at a time, until they meet again.
        The node where they meet is the starting point of the cycle.
        If there is no cycle in the linked list, the algorithm will return null.
         */
        ListNode slow=head;
        ListNode fast=head;
        if(head==null || head.next==null) return null;
        do{
            slow=slow.next;
            fast=fast.next.next;
            if(fast==null || fast.next==null) return null;
        }while(slow!=fast);
        slow=head;
        while(slow!=fast) {
            slow=slow.next;
            fast=fast.next;
        }
        return new ListNode(slow.val);
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
        h6.next=h4;
        ListNode startCycle = detectCycle(h1);
        System.out.println(startCycle.val);
    }
}
