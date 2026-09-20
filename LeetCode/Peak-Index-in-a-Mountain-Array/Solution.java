1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3
4        int low = 0;
5        int high = arr.length - 1;
6
7        while (low < high) {
8
9            int mid = (low + high) / 2;
10
11            if (arr[mid] < arr[mid + 1]) {
12                low = mid + 1;
13            } 
14            else {
15                high = mid;
16            }
17        }
18
19        return low;
20    }
21}