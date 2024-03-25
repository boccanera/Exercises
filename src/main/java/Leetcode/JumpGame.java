package Leetcode;

public class JumpGame {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};

        jump(nums);

    }


    private static boolean jump(int[] nums) {

            int lastGoodIndexPosition = nums.length - 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (i + nums[i] >= lastGoodIndexPosition) {
                    lastGoodIndexPosition = i;
                }
            }
            return lastGoodIndexPosition == 0;
        }

    }


