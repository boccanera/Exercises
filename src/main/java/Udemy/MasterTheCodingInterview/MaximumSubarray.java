package Udemy.MasterTheCodingInterview;

public class MaximumSubarray {

//    Given an integer array nums,
//    find the subarray with the largest sum, and return its sum.
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int helper = 0;
        int higher = 0;


        for (int num : nums) {

            if (num != helper && num > helper && num + helper > sum) {
                helper = num;
                sum = num + helper;
                System.out.println(helper);
            }

//                    int[] a = {-2, -3, 4, -1, -3};
//        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
//    }
//    static int maxSubArraySum(int a[]) {
//        int size = a.length;
//        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
//        for (int i = 0; i < size; i++) {
//            max_ending_here = max_ending_here + a[i];
//            if (max_so_far < max_ending_here) max_so_far = max_ending_here;
//            if (max_ending_here < 0) max_ending_here = 0;
//        }
//        return max_so_far;

        }

        System.out.println(sum);


    }


}
