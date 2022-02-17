package Array;

/**
 *  @author coulson
 *  @version 2021-06-08 13:35
 *
 * 寻找数组的中心索引
 *
 * 输入：nums = [1, 7, 3, 6, 5, 6]
 * 输出：3
 * 解释：
 * 中心下标是 3 。
 * 左侧数之和 (1 + 7 + 3 = 11)，
 * 右侧数之和 (5 + 6 = 11) ，二者相等。
 */

class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex2(nums));  // 3
    }

    public static int pivotIndex(int[] nums) {
        if( nums.length == 0)
            return -1;
        int leftSum = 0, rightSum = 0;
        for( int i = 1; i < nums.length ; i++)
            rightSum += nums[i];
        if( leftSum == rightSum)
            return 0;
        for( int i = 1; i < nums.length ; i++){
            rightSum -= nums[i];
            leftSum += nums[i - 1];
            if( rightSum == leftSum)
                return i;
        }
        return -1;
    }

    public static int pivotIndex2(int[] nums) {
        int all = 0;
        for( int i = 0; i < nums.length ; i++) {
            all += nums[i];
        }
        int left = 0;
        for( int i = 0; i < nums.length ; i++){
            if (left*2 + nums[i] == all) {return i;}
            else {left += nums[i];}
        }
        return -1;
    }
}
