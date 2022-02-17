package Array;

import java.util.Arrays;

/***************************
 *         移除零           *
 ***************************/


class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] != 0) {
                nums[j++] = nums[i];    //交换到前面去,相当于num[j]=nums[i];j++
            }
        }
        while (j < nums.length) {   //j是非0的个数
            nums[j++] = 0;  //让j后面的值全为0
        }
    }
}