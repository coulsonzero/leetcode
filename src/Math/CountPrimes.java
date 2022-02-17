package Math;

import java.util.Arrays;

/**
 * @author coulson
 * @version 2021-06-08 12:56
 * 计算质数(质数又称素数，一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数；否则称为合数)
 * 首先排除0和1, 排除2、3、5、7、...的倍数, 剩下的为质数
 */
public class CountPrimes {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        execute();
        long end = System.currentTimeMillis();
        System.out.printf("执行时间: %d ms\n", end - start);
    }

    static void execute() {
        int num = 31000000;
        // System.out.println(countPrimes1(num));  // 7489 ms
        System.out.println(countPrimes2(num));  // 192 ms

    }



    /**
     *  i <= num
     *  i * i <= num
     *  i <= (int)Math.sqrt(num)
     */
    private static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) return false;
        }
        return true;
    }

    // 1. 暴力算法
    public static int countPrimes1(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) count++;
            // count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    // 2. 埃式筛选法
    public static int countPrimes2(int n) {
        boolean[] isPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) {
                count++;
                for (int j = 2 * i; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        return count;
    }


}
