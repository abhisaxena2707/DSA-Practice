/*
21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Input: list1 = [], list2 = []
Output: []
 */
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,null);
        list1.next=new ListNode(2,null);
        list1.next.next=new ListNode(4,null);

        ListNode list2 = new ListNode(1,null);
        list2.next=new ListNode(3,null);
        list2.next.next=new ListNode(4,null);

        ListNode merged = mergeTwoLists( list1, list2);

        while(merged!=null){
            System.out.print(merged.val+" ");
            merged=merged.next;
        }


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);
        ListNode result=merged;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                merged.next=new ListNode(list1.val);
                list1= list1.next;
            }
            else  {
                merged.next=new ListNode(list2.val);
                list2=list2.next;
            }
            merged=merged.next;
        }
        if(list1!=null){
            merged.next=list1;
        }
        else {
            merged.next=list2;
        }
        return result.next;
    }

//    public static ListNode mergeTwoListsUsingRecursion(ListNode list1, ListNode list2){
//
//        while(list1!=null){
//
//        }
//
//    }
}
