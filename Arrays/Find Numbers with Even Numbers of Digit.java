// Leetcode 1295 - Find Numbers with Even Numbers of Digit

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if((i > 9 && i < 100) || (i > 999 && i < 10000) || (i == 100000)){
                count+=1;
            }
        }
        return count;
    }
}
