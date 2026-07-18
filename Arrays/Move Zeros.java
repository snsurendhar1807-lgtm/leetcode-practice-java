// LeetCode 283 - Move Zeros

class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int size = nums.length;
        for(int i =0; i<size;i++){
            if(nums[i]!=0){
                nums[count] = nums[i];
                count++;
            }
        }
        while(count < size){
            nums[count] = 0;
            count++;
        }
    }
}
