import java.util.Arrays;

public class MissingNumber {
    /**
     * 二分法
     */
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(nums[m] == m) l = m + 1;
            else r = m - 1;
        }
        return l;
    }

    /**
     * 统计和差
     */
    public int missingNumber2(int[] nums) {
        // 计算 n*(n+1)/2
        return nums.length * (nums.length + 1) / 2 - sum(nums);
        // return nums.length * (nums.length + 1) / 2 - Arrays.stream(nums).sum();
    }
    public static int sum(int[] nums) {
        int res = 0;
        for(int n : nums) {
            res += n;
        }
        return res;
    }

    /**
     * 比对索引值
     */
    public int missingNumber3(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
