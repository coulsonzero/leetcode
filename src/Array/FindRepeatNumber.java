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
        System.out.println(findRepeatNumber1(nums));  // 2
        System.out.println(findRepeatNumber2(nums));
    }

    public static int findRepeatNumber1 (int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int findRepeatNumber2(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }
}

