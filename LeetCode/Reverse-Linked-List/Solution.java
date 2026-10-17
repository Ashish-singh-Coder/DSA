1class Solution {
2    public ListNode reverseList(ListNode head) {
3        ListNode prev = null;
4        ListNode curr = head;
5        while (curr!= null){
6            ListNode next = curr.next;
7            curr.next = prev;
8            prev = curr;
9            curr = next;
10
11        }
12        return prev;
13    
14    }
15}