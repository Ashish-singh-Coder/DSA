1
2class Solution {
3    public int maximum69Number (int num) {
4        char[] arr = String.valueOf(num).toCharArray();
5
6        for (int i = 0; i < arr.length; i++) {
7            if (arr[i] == '6') {
8                arr[i] = '9';
9                break;
10            }
11        }
12
13        return Integer.parseInt(new String(arr));
14    }
15}
16