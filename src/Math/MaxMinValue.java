package Math;

import java.util.Arrays;
import java.util.Collections;

public class MaxMinValue {
    public static void main(String[] args) {
        Integer[] nums = { 8, 2, 7, 1, 4, 9, 5};
        System.out.println("最小值: " + min(nums));
        System.out.println("最大值: " + max(nums));
    }
    public static int min(Integer[] nums) {
        int min = (int) Collections.min(Arrays.asList(nums));
        return min;
    }
    public static int max(Integer[] nums) {
        int max = (int) Collections.max(Arrays.asList(nums));
        return max;
    }
}
