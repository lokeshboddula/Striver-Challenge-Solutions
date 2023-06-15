class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if(n == 0) return res;
        Arrays.sort(nums);
        
        for(int i = 0; i < n; i++) {
            
            for(int j = i + 1; j < n; j++) {
                int target_2 = target - nums[j] - nums[i];

                int front = j + 1;
                int back = n - 1;

                while(front < back) {
                    if(nums[front] + nums[back] > target_2) back--;
                    else if(nums[front] + nums[back] < target_2) front++;
                    else {

                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);

                        while(front < back && nums[front] == quad.get(2)) front++;
                        while(front < back && nums[back] == quad.get(3)) back--;
                    }
                }

                while(j + 1 < n && nums[j] == nums[j + 1]) j++;
                while(i + 1 < n && nums[i] == nums[i + 1]) i++;

            }
        }

        return res;
    }
}