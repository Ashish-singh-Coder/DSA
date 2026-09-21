1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3
4        PriorityQueue<Integer> pq = new PriorityQueue<>();
5
6        for (int num : nums) {
7            pq.add(num);
8
9            if (pq.size() > k) {
10                pq.poll();
11            }
12        }
13
14        return pq.peek();
15    }
16}