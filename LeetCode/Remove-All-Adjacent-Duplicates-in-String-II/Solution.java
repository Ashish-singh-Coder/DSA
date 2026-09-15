1class Solution {
2    public String removeDuplicates(String s, int k) {
3        
4
5        Stack<int[]> stack = new Stack<>();
6
7        for (int i = 0; i < s.length(); i++) {
8
9            char ch = s.charAt(i);
10
11            if (!stack.isEmpty() && stack.peek()[0] == ch) {
12                stack.peek()[1]++;
13
14                if (stack.peek()[1] == k) {
15                    stack.pop();
16                }
17
18            } else {
19                stack.push(new int[]{ch, 1});
20            }
21        }
22
23        StringBuilder result = new StringBuilder();
24
25        for (int[] pair : stack) {
26            for (int i = 0; i < pair[1]; i++) {
27                result.append((char) pair[0]);
28            }
29        }
30
31        return result.toString();
32    
33    }
34}