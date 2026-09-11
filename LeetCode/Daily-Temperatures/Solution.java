1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int[] answer = new int[temperatures.length];
4        Stack<Integer>  stack = new Stack<>();
5
6        for(int i = 0; i< temperatures.length; i++){
7
8        while(!stack.isEmpty() &&  temperatures[i] > temperatures[stack.peek()]){
9                 
10                 int index = stack.pop();
11                 answer[index] = i - index;
12        }
13
14            stack.push(i);
15        }
16        return answer;
17    }
18}