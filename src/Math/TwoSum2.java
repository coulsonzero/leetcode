package Math;

import java.util.Arrays;

/**
 * 两数之和 （有序数组）
 * 返回有序数组两数之和的下标
 * input: [1, 2, 4, 5, 8, 10]  target: 7
 * output: [1, 3]
 */

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        int slow = 0, fast = nums.length - 1;
        while (slow < fast) {
            int res = nums[slow] + nums[fast];
            if (res == target) return new int[] {slow, fast};
            else if (res > target) fast--;
            else slow++;
        }
        return new int[] {0};
    }
}
