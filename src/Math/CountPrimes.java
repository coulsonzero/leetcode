package Math;

import java.util.Arrays;

/**
 * @author coulson
 * @version 2021-06-08 12:56
 *
 * 计算质数(质数又称素数，一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数；否则称为合数)
 *
 * 首先排除0和1
 * 排除2、3、5、7、...的倍数
 * 剩下的为质数
 */
public class CountPrimes {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        execute();
        long end = System.currentTimeMillis();
        System.out.printf("执行时间: %d ms\n", end - start);
    }

    static void execute() {
        int num = 310000;
        System.out.println(countPrimes(num));
        // System.out.println(countPrimes2(num));
    }
    // 判断质数
    private static boolean isPrime(int num) {
        int max = (int)Math.sqrt(num);
        // 或者 "i*i <= num"
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        // 从 2 开始枚举到 sqrt(n)。
        for (int i = 2; i * i < n; i++) {
            // 如果当前是素数
            if (isPrime[i]) {
                // 就把从 i*i 开始，i 的所有倍数都设置为 false。
                for (int j = i * i; j < n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        // 计数
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int countPrimes2(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }


}
