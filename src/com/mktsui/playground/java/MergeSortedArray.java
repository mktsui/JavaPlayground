package com.mktsui.playground.java;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // pointer to insert from tail of nums1
        int ptr = m+n;
        
        if (m == 0)
            nums1 = nums2;
        
        while (n > 0) {
            if (m > 0) {   
                if (nums2[n-1] > nums1[m-1]) {
                    nums1[ptr-1] = nums2[n-1];
                    n--;                    
                } else {
                    nums1[ptr-1] = nums1[m-1];
                    m--;
                }
            } else {
                nums1[ptr-1] = nums2[n-1];
                n--;
            }
            ptr--;
        }
    }
}
