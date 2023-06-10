class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        //Kadane's Algorithm
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                //we don't carry negative sum
                sum = 0;
            }
        }
        return max;
    }
}