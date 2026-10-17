1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3     
4        int n = numbers.length;
5        int i = 0;
6        int j = n - 1;
7
8        while (i < j) {
9            int sum = numbers[i] + numbers[j];
10
11            if (sum == target)
12                return new int[] {i + 1, j + 1};
13
14            if (sum < target) {
15                i++;
16            } else {
17                j--;
18            }
19        }
20
21        return new int[] {-1, -1};
22    }
23}