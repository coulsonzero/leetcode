import java.util.Arrays;

/**
 * Array
 *
 * arr: 内存地址
 * arr[i]: 值
 * String.join('-', arr): 拼接为字符,不能用于char[]
 * Arrays.toString(): 输出数组
 */

public class ArrayDemo {
    public static void main(String[] args) {
        char[] charArr = new char[] { 'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr[2]);

        String[] strArr = {"coulson", "shville", "daliy"};
        System.out.println(String.join("-", strArr));

        System.out.println(Arrays.toString(strArr));
    }
}
