package Leetcode;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(rotateArray(nums, 3)));

    }

    private static int[] rotateArray(int[] nums, int k) {

        int n = nums.length;
        k = k % n; // while k < nums.length, it will be K value. if > nums.length, it will take the rest 7 % 6 = 1.
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        return nums;
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

//        int holder;
//        int w = nums.length - 1;
//        int m = k - 1;
//
//        for (int i = 0; i < k; i++) { //1,2,3,4,5,6,7  7(l) - 3(k) = 4  // 4,
//                                      //5,6,7,1,2,3,4
//                                      //holder = nums[m]
//                                      //nums[w] = nums[m]
//                                      //nums[m] = holder
//
//            holder = nums[m]; //
//            nums[w] = nums[m]; //
//            nums[m] = holder; //
//            w--;
//            m--;
//
//        }
//
//        return nums;


//holder = nums[w+k];
//            nums[w+k] = nums[i]; // 1,
//            nums[i] = holder; // 5,
//            w++;