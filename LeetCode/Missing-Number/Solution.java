1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            sum = sum + nums[i];
8        }
9
10        int expected = n * (n + 1) / 2;
11        int ans = expected - sum;
12        return ans;
13        
14    }
15}