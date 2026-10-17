1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3
4        List<List<Integer>> result = new ArrayList<>();
5
6        Arrays.sort(nums);
7
8        for (int i = 0; i < nums.length - 2; i++) {
9
10            if (i > 0 && nums[i] == nums[i - 1]) {
11                continue;
12            }
13
14            int left = i + 1;
15            int right = nums.length - 1;
16
17            while (left < right) {
18
19                int sum = nums[i] + nums[left] + nums[right];
20
21                if (sum == 0) {
22
23                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
24
25                    while (left < right && nums[left] == nums[left + 1]) {
26                        left++;
27                    }
28
29                    while (left < right && nums[right] == nums[right - 1]) {
30                        right--;
31                    }
32
33                    left++;
34                    right--;
35
36                } else if (sum < 0) {
37                    left++;
38                } else {
39                    right--;
40                }
41            }
42        }
43
44        return result;
45    }
46}