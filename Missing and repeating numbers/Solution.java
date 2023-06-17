import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        //assume x is the repeating one and y is the missing one
        //s - sum of arr, sn - sum of n, s2 - sum of squares of arr, s2n - sum of squares of n
        long n1 = (long) arr.size();
        long S = 0, S2 = 0;

        long SN = (n1 * (n1 + 1)) / 2;
        long S2N = (n1 * (n1 + 1) * (2 * n1 + 1)) / 6;
        for(int i = 0; i < n; i++) {
            S += arr.get(i);
            S2 += (long) arr.get(i) * (long) arr.get(i);
        }
        // x - y = S - Sn 
        long val1 = S - SN;
        // x^2 - y^2 = S2 - S2N
        // (x + y) (x - y) = S2 - S2N 
        // x + y = S2 - S2N/ val1 which is (x - y)
        long val2 = (S2 - S2N);

        val2 = val2 / val1;
        
        long x = (val1 + val2) / 2;

        long y = x - val1; 

        int[] ans = {(int)y, (int)x};
        return ans;
    }
}