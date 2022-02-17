package String;

/**
 * 7. 整数反转
 *
 * 输入：x = 123
 * 输出：321
 *
 * 输入：x = -123
 * 输出：-321
 *
 * 输入：x = 120
 * 输出：21
 */

class $07__ReverseInteget {
    public static void main(String[] args) {
        System.out.println(reverse(120));    // 21
        System.out.println(reverse(123));    // 321
        System.out.println(reverse(-123));  // -321
    }
    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int) res == res ? (int) res : 0;
    }
}
