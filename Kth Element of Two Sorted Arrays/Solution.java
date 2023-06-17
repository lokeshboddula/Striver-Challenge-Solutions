public class Solution {
    static int[] merge(int[] a, int[] b) {
        int len1 = a.length;
        int len2 = b.length;

        int[] arr = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < len1 && j < len2) {
            if(a[i] < b[j]) {
                arr[idx++] = a[i++];
            } else {
                arr[idx++] = b[j++];
            }
        }
        if(i < len1)
        while(i < len1) arr[idx++] = a[i++];

        if(j < len2)
        while(j < len2) arr[idx++] = b[j++];

        return arr;
    }
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        int[] merged = merge(row1, row2);
        
        return merged[k - 1];
    }
}
