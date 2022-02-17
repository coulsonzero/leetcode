package Array;

/**
 * 删除排序数组中的重复项
 * input: [0, 1, 2, 2, 3, 3, 4]
 * output: [0, 1, 2, 3, 4]   length: 5
 */

public class SortedArrayDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) nums[i++] = nums[j];
        }
        return i;
    }
}