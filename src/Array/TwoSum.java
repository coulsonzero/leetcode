package Array;

import java.util.Arrays;
import java.util.HashMap;


public class TwoSum {
    public static void main(String[] args) {
        long start= System.currentTimeMillis();

        execute();

        long end = System.currentTimeMillis();
        System.out.printf("执行时间: %d ms\n", end-start);
    }

    private static void execute() {
        int[] nums = {1, 3, 6, 7};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.get(target - nums[i]) != null) {   // map.containsKey(...)
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    private static int[] play(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=1;j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}