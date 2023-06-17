class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 1;
        int longest = 0;
        for(int num : nums) set.add(num);

        for(int num : set) {

            if(set.contains(num - 1)) {
                continue;
            }
            while(set.contains(num + 1)) {
                num++;
                count++;
            }
            longest = Math.max(longest, count);
            count = 1;
        }
        return longest;
    }
}