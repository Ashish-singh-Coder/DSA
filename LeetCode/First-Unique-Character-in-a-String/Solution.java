1class Solution {
2    public int firstUniqChar(String s) {
3        
4        HashMap<Character ,Integer> map = new HashMap<>();
5        for(int i = 0; i < s.length(); i++){
6            char c = s.charAt(i);
7                map.put(c, map.getOrDefault(c, 0) + 1);
8        }
9
10        for (int i = 0; i < s.length(); i++) {
11            char ch = s.charAt(i);
12
13            if (map.get(ch) == 1) {
14                return i;
15            }
16        }
17
18        return -1;
19        }
20
21    }
22