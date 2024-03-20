package Leetcode;

import java.util.Arrays;

public class RemoveElement {

    int[] nums = {1,2,3};
    int val = 2;
    int i = 0;

    int pointer = nums.length - 1;
    int k = 0;

    int count = 0;

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int val = 2;
        int i = 0;

        int pointer = nums.length - 1;
        int k = 0;

        RemoveElement re = new RemoveElement();

        re.removeElement(nums, 2);


    }

    public int removeElement(int[] nums, int val){

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
