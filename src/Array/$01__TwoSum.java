package Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 */

public class $01__TwoSum {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        execute();

        long end = System.currentTimeMillis();
        System.out.printf("执行时间: %d ms\n", end - start);
    }

    public static void execute() {
        int[] nums = {1, 3, 6, 7};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    /**
     * HashMap
     * .get()
     * .put()
     * .containsKey()
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {   // map.containsKey(...)
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    /**
     * 暴力解法
     */
    public static int[] play(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}