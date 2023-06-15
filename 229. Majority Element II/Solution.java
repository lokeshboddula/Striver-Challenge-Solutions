class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //boyer moore's algo
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int num1 = -1, num2 = -1, c1 = 0, c2 = 0;
        for(int num : nums) {
            if(num1 == num) c1++;
            else if(num2 == num) c2++;
            else if(c1 == 0) {
                num1 = num;
                c1 = 1;
            }
            else if(c2 == 0) {
                num2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int num : nums) {
            if(num == num1) c1++;
            else if(num == num2) c2++;
        }
        if(c1 > n / 3) ans.add(num1);
        if(c2 > n / 3) ans.add(num2);
        return ans;
    }
}