package Math;

import java.util.Scanner;

/**
 * @author CoulsonZero
 * @version 2021-05-31 20:35
 * 找出不大于n的最大质数
 */
public class IsPrimeNum {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        System.out.println(printMaxPrimeNum(n));
    }
    //从后遍历
    public static int printMaxPrimeNum(int n) {
        for (int i = n; i >= 2; i--) {
            if (IsPrimeNum(i))
                return i;
        }
        return -1;
    }
    //判断是否为质数
    public static boolean IsPrimeNum(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                count += 1;
        }
        return count == 1;
    }
}
