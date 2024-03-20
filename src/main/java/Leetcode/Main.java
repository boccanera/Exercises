package Leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        int ipointer = m + n - 1;
        int n1pointer = m - 1;
        int n2pointer = n - 1;

        while (n1pointer >= 0 && n2pointer >= 0) {
            if (nums1[n1pointer] >= nums2[n2pointer]) {
                nums1[ipointer] = nums1[n1pointer];
                n1pointer--;
            } else {
                nums1[ipointer] = nums2[n2pointer];
                n2pointer--;
            }
            ipointer--;
        }

        while (n2pointer >= 0) {
            nums1[ipointer] = nums2[n2pointer];
            ipointer--;
            n2pointer--;
        }

        // Print the final sorted array nums1
        System.out.println(Arrays.toString(nums1));
    }
}

