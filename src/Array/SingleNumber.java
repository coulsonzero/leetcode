package Array;

/**
 * 只出现一次的数字
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int nums[]) {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
            result ^= nums[i];
        return result;
    }
}


/**
 * 1^1=0;
 * 1^0=1;
 * 0^1=1;
 * 0^0=0;
 * 也就说0和1异或的时候相同的异或结果为0，不同的异或结果为1，根据上面的规律我们得到
 * a^a=0；自己和自己异或等于0
 * a^0=a；任何数字和0异或还等于他自己
 * a^b^c=a^c^b；异或运算具有交换律
 */