import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{	
	public static void swap( ArrayList<Integer> arr, int i, int j) {
        	int temp = arr.get(i);
        	arr.set(i, arr.get(j));
        	arr.set(j, temp);
    	}

    	public static void reverse(ArrayList<Integer> arr, int i, int j) {
        	while(i < j)
            	swap(arr, i++, j--);
    	}
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) 
	{
		// int[] nums = new int[p.size()];
		// int k = 0;
		// for(int e : p) {
		// 	nums[k++] = e;
		// }
        int n = nums.size(), i, j;
        for(i = n - 2; i >= 0; i--) {
            if(nums.get(i) < nums.get(i + 1)) 
                break;
        }
        if(i < 0) 
            reverse(nums, 0, n - 1);
        else {
            for(j = n - 1; j >= i; j--) 
                if(nums.get(j) > nums.get(i)) 
                    break;
            swap(nums, i, j);
            reverse(nums, i + 1, n - 1);
        }

		return nums;
	}
}
