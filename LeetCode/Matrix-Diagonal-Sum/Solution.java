1class Solution {
2    public int diagonalSum(int[][] mat) {
3
4          int n = mat.length;
5        int sum1 = 0; 
6        int sum2 = 0;   
7
8       
9        for (int i = 0; i < n; i++) {
10            for (int j = 0; j < n; j++) {
11                if (i == j) {
12                    sum1 = sum1 + mat[i][j];
13                }
14            }
15        }
16
17        for (int i = 0; i < n; i++) {
18            for (int j = 0; j < n; j++) {
19                if (i + j == n - 1) {
20                    sum2 = sum2 + mat[i][j];
21                }
22            }
23        }
24
25        int total = sum1 + sum2;
26
27        
28        if (n % 2 == 1) {
29            total = total - mat[n / 2][n / 2];
30        }
31
32        return total;
33        
34    }
35}