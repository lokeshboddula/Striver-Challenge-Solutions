class Solution {
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
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        double ans = 0.0;
        int[] merged = merge(nums1, nums2);
        int l = merged.length;
        if((len1 + len2) % 2 == 0) 
            return ((double)(merged[(l / 2) - 1] + merged[l / 2]) / 2);
        else return merged[l / 2];
    }
}