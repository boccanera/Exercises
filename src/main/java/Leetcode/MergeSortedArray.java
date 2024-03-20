package Leetcode;

public class MergeSortedArray {


    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1pointer = m - 1;
        int n2pointer = n - 1;
        int ipointer = m + n - 1;

        while (n2pointer >= 0) {
            if (n1pointer >= 0 && nums1[n1pointer] > nums2[n2pointer]) {
                nums1[ipointer] = nums1[n1pointer];
                n1pointer--;
            } else {
                nums1[ipointer] = nums2[n2pointer];
                n2pointer--;
            }
            ipointer--;
        }
    }


}
