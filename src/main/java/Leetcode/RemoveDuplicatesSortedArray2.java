package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesSortedArray2 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 2, 3};

        HashMap<Integer, Integer> toRemove = new HashMap<>();

        removeDuplicates(nums);

        System.out.println("nums[]: " + Arrays.toString(nums));
        System.out.println("uniqueElements " + removeDuplicates(nums));
    }

    static Integer removeDuplicates(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 2 && nums[i] == nums[i + 2]) { // 1 == 2? insert 2 == 2? continue.
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}

//        int uniqueElements = 1;
//        for (int i = 1; i < nums.length - 1; i++) {
//            if (nums[i] != nums[i + 1]) { // way to get rid of array index out of bounds
//                nums[uniqueElements++] = nums[i + 1];
//            }
//        }
//
//        return uniqueElements;
//    }
//
//}
//        int uniqueElement = 0;
//        HashMap<Integer, Integer> toRemove = new HashMap<>();
//
//        for (int i = 0; i < nums.length - 1; i++){
//            if(!toRemove.containsValue(nums[i])){
//                toRemove.put(i,nums[i]);
//                System.out.println(!toRemove.containsValue(nums[i]));
//                System.out.println(i);
//                continue;
//            }
//            nums[i] = nums[i + 1];
//            uniqueElement++;
//            System.out.println("nums " + nums[i]);
//
//        }
//        return uniqueElement;
//    }

