package Leetcode;

public class JumpGame2 {

    int[] nums = {2, 3, 1, 1, 4};
    int[] nums1 = {1, 0, 3};

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int[] nums1 = {2, 3, 0, 1, 4};

        System.out.println(jump(nums));
        System.out.println(jump(nums1));
    }

    static int jump(int[] nums) {

        int totalJumps = 0;
// destination is last index
        int destination = nums.length - 1;
        int coverage = 0, lastJumpIdx = 0;
// Base case
        if (nums.length == 1) return 0;
// Greedy strategy: extend coverage as long as possible
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;
// check if we reached destination already
                if (coverage >= destination) {
                    return totalJumps;
                }
            }

        }
        return totalJumps;
    }
}
