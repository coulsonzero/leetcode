package String;


/**
 * NC 141  判断回文字符串
 * Input: "randnar"
 * Output: true
 */

public class IsPalindromeString {
    public static boolean isPalindromeString(String str) {
        // write code here
        for(int i=0, j=str.length()-1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }

    public static boolean isPalindromeString2(String str) {
        for (int i = 0; i < str.length(); i++) {
            return str.charAt(i) == str.charAt(str.length() - i - 1);
        }
        return false;
    }

    public static boolean isPalindromeString3(String str) {
        int i=0, j=str.length()-1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }
}
