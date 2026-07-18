// LeetCode 1351 - Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for(int[] row : grid){
            for(int num : row){
                count+=(num<0) ? 1 : 0;
            }
        }
        return count;
        
    }
}
