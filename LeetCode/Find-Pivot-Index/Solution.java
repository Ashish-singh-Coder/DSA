1class Solution {
2    public int pivotIndex(int[] nums) {
3
4        int total = 0;
5        for (int i = 0; i<nums.length; i++){
6            total += nums[i];
7
8        }
9        int left = 0;
10        for (int i = 0; i<nums.length; i++){
11           int  right = total - left - nums[i];
12
13            if (left == right) return i;
14            else left += nums[i];
15
16
17
18        }return -1;
19    }
20}