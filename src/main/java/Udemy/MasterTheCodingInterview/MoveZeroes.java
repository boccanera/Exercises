package Udemy.MasterTheCodingInterview;

/*

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

 */

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        int n = nums.length;
        if (n < 2) return;
//define pointers
        int L = 0, R = 1;
//move zeros to the back
        while (R < n) {
            if (nums[L] != 0) {
                L++;
                R++;
            } else if (nums[R] == 0) {
                R++;
            } else {
                int temp = nums[R];
                nums[R] = nums[L];
                nums[L] = temp;
            }

        }
    }
}
