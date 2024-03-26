package Leetcode;

import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {

        int[] nums = {3,0,6,1,5}; // 15 / 5 3,50

        //5,8,12,30,70  average = 25

        //0,1,3,5,6 average = 3

        // 1 2 4 5 6
        // 3 count ++ 3>>

        System.out.println(hIndex(nums));

    }

    static int hIndex(int[] citations) {

        Arrays.sort(citations);
        int z = citations.length, i;
        for (i = 1; i <= z; i++){ // good algorithm to get the first one under the average.
            if (citations[z-i] < i) break; // nums[6-1](6) < 1 = false, nums[5-2](3) < 2 = false,  nums[5-3](3) < 3 false, nums[5-4](1) < 4 = true;
        }
            return i - 1;
    }
}
