package Math;

import java.util.Arrays;

public class ExchangesValue {
    public static void main(String[] args) {
        int a = 5, b = 2;
        System.out.println(Arrays.toString(exchangesValue(a, b)));
    }

    public static int[] exchangesValue(int a, int b) {
        a = a ^ b;
        // System.out.println(a);  // 7
        b = a ^ b;
        // System.out.println(b);  // 5
        a = a ^ b;
        // System.out.println("a="+a+",b="+b);
        return new int[]{a, b};
    }
}
