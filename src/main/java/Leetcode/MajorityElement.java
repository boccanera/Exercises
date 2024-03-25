package Leetcode;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {6,6,6,7,7};
        majorityElement(nums);
        System.out.println(majorityElement(nums));

    }

    private static int majorityElement(int[] nums) {

        int cand = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                cand = nums[i];
            }

            if (cand == nums[i]) {
                count++;
                continue;
            }

            count--;

        }
        return cand;

//        Arrays.sort(nums);
//        int count = 0;
//        int theNumber = 0;
//
//        if (nums.length == 1){
//            return nums[0];
//        }
//
//        for (int i = 0; i < nums.length - 1; i++) {
//
//            if (nums[i] == nums[i + 1]){
//                count++;
//            } else {
//                count = 0;
//            }
//
//            if (count == nums.length / 2){
//                theNumber = nums[i];
//                return theNumber;
//            }
//
//        }
//
//        return theNumber;

    }

}
