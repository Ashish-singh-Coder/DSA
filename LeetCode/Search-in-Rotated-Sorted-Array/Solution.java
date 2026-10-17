1class Solution {
2    public int search(int[] nums, int target) {
3
4        int low = 0;
5        int high = nums.length - 1;
6
7        while (low <= high) {
8
9            int guess = (low + high) / 2;
10
11            if (nums[guess] == target)
12            {
13                return guess;
14            }
15            if (nums[low] <= nums[guess])
16             {
17
18          
19               if (nums[low] <= target && target < nums[guess])
20                {
21                    high = guess - 1;
22                } 
23                else {
24                    low = guess + 1;
25                }
26
27            } 
28           
29            else {
30
31               
32                if (nums[guess] < target && target <= nums[high]) {
33                    low = guess + 1;
34                } 
35                else {
36                    high = guess - 1;
37                }
38            }
39        }
40
41        return -1;
42    }
43}