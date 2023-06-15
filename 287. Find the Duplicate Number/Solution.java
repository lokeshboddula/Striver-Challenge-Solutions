class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer, Integer> freq = new HashMap<>();
        // for(int i = 0; i < nums.length; i++) {
        //     freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        // }
        // for(Map.Entry<Integer, Integer> entry : freq.entrySet()) 
        //     if(entry.getValue() == 2) return entry.getKey();

        // return 0;

        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}