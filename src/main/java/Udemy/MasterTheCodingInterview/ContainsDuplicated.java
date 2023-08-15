package Udemy.MasterTheCodingInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicated {

    public static void main(String[] args) {

        //BRUTE FORCE SOLUTION
//        int[] nums = {1,2,3,1};
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < n; j++) {
//                if (nums[i] == nums[j]){
//                    System.out.println(nums[i] + " " + nums[j] + " " + true);
//                }
//
//            }
//        }

        //BEST FOR TIME COMPLEXITY
//        int[] nums = {1,2,3,1};
//        int n = nums.length;
//        Map<Integer, Boolean> map = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            if (!map.containsKey(nums[i])){
//                map.put(nums[i], true);
//            }
//            else System.out.println(true);
//        }

        //BEST FOR SPACE COMPLEXITY
        int[] nums = {1,2,3,5,1};
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println(nums[i] + " " + nums[i+1] + " " +  true);
            }
            else System.out.println(nums[i] + " " + nums[i+1] + " " + false);
        }

    }

}
