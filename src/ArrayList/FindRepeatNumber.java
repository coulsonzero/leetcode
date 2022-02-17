package ArrayList;

import java.util.*;

/**
 * @author CoulsonZero
 * @version 2021-05-28 13:49
 */

public class FindRepeatNumber {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 0, 2, 5, 3 };

        System.out.println(findRepeatNumber(nums));     // 2
        System.out.println(findRepeatNumber2(nums));    // [2, 3]
    }
    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=1; i<nums.length;i++){
            if (nums[i] == nums[i-1])
                return nums[i];
        }
        return -1;
    }
    public static List<Integer> findRepeatNumber2(int[] nums) {
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            if (!set.add(num)) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}
