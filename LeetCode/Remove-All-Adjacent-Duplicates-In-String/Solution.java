1class Solution {
2    public String removeDuplicates(String s) {
3
4        Stack<Character> stack = new Stack<>();
5
6        for (int i = 0; i < s.length(); i++) {
7
8            char ch = s.charAt(i);
9
10            if (!stack.isEmpty() && stack.peek() == ch) {
11                stack.pop();
12            } else {
13                stack.push(ch);
14            }
15        }
16
17        StringBuilder result = new StringBuilder();
18
19        for (char ch : stack) {
20            result.append(ch);
21        }
22
23        return result.toString();
24    }
25}