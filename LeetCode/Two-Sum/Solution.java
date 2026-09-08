1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3      
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int i = 0; i < nums.length;i++){
6            int seen =  target-nums[i];
7
8            if(map.containsKey(seen)){
9                return new int[]{map.get(seen), i};
10            }
11            else 
12                map.put(nums[i],i);
13
14        }
15        return new int[]{-1, -1};
16    }
17}