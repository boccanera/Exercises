package Udemy.MasterTheCodingInterview;

import java.util.Arrays;

public class RotateArray {

    //Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    //
    //Example 1:
    //
    //Input: nums = [1,2,3,4,5,6,7], k = 3
    //Output: [5,6,7,1,2,3,4]


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        5, 2, 3, 4, 1, 6, 7
        //5, 6, 3, 4, 1, 2, 7
        //5, 6, 7, 4, 1, 2, 3
        int n = nums.length;
        int module = 3 % n;

        RotateArray.reverse(nums, 0, n-1);
        RotateArray.reverse(nums, 0, module-1);
        RotateArray.reverse(nums, module, n-1);
        System.out.println(Arrays.toString(nums));

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}


//
//        int leftPointer = 0;
//        int rightPointer = Math.abs(n - k);
//        int leftPointer1 = Math.abs(k - 1);
//        int rightPointer2 = Math.abs(n - k);
//        int holder;
//        int holder1;
//
//        for (int i = 0; i < k; i++) {
//            System.out.println(rightPointer);
//            holder = nums[leftPointer];
//            nums[leftPointer] = nums[rightPointer];
//            nums[rightPointer] = holder;
//            leftPointer++;
//            rightPointer++;
//        }
//
//        for (int i = 0; i < k + 1; i++) {
//            holder1 = nums[leftPointer1];
//            nums[leftPointer1] = nums[rightPointer2];
//            nums[rightPointer2] = nums[holder1];
//            leftPointer1++;
//            rightPointer2++;
//        }
//
//        System.out.println(Arrays.toString(nums));




