/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // use set 
        // HashSet<ListNode> set = new HashSet<>();
        // ListNode current = head;
        // while(current != null){
        //     if(set.contains(current)){
        //         return true;
        //     }
        //     set.add(current);
        //     current = current.next;
        // }
        // return false;
        // use two pointer;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }

        }
        return false;
    }
}