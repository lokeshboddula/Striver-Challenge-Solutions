class Solution {
    public void sortColors(int[] nums) {
        int ones = 0;
        int twos = 0;
        int zeros = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) zeros++;
            if(nums[i] == 1) ones++;
            if(nums[i] == 2) twos++;
        }
        for(int i = 0; i < nums.length; i++) {
            if(zeros-- > 0) nums[i] = 0;
            else if(ones-- > 0) nums[i] = 1;
            else if(twos-- > 0) nums[i] = 2;
        }
    }
}