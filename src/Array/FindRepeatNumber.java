package Array;

import java.util.Arrays;

/**
 * @author CoulsonZero
 * @version 2021-05-31 21:24
 * 查找重复元素
 *
 * Input: [2, 3, 1, 0, 2, 5, 3]
 * Output: 2 或 3
 */

class FindRepeatNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));  // 2
    }

    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) return nums[i];
        }
        return -1;
    }
}

