package Array;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 反转字符数组
 *
 * input: ['h','e','l','l','o']
 * output: ['o','l','l','e','h']
 */

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    //双指针法(首尾交换)
    public static void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
