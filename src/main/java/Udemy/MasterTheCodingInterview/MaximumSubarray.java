package Udemy.MasterTheCodingInterview;

public class MaximumSubarray {

/*    Given an integer array nums,
    find the subarray with the largest sum, and return its sum.
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6

    https://www.youtube.com/watch?v=86CQq3pKSUw
*/

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, -14, 4, -1, 2, 1, -5, 4, 3};

        int max_sum = nums[0];
        int current_sum = max_sum;

        for (int i = 0; i < nums.length; i++) {
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }

        System.out.println(max_sum);

    }


}
