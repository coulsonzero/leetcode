package String;


/**
 * LC 5. 最长回文子串
 * Input: "abc1234321ab",12
 * Output: 7
 */

public class LongestPalindrom {
    public static String longestPalindrome(String s) {
        int maxLen = 1;
        int begin = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (j - i > 0 && validPalindromic(chars, i, j)) {
                    maxLen = j - i - 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public static boolean validPalindromic(char[] chars, int l, int r) {
        while (l < r) {
            if (chars[l] != chars[r])
                return false;
            l++;
            r--;
        }
        return true;
    }


    public static int longestPalindrome2(String A, int n) {
        // write code here
        char[] chars = A.toCharArray();

        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, getCount(chars, i, i));
            res = Math.max(res, getCount(chars, i, i + 1));
        }
        return res;
    }

    public static int getCount(char[] chars, int l, int r){
        while (l>=0 && r<chars.length && chars[l] == chars[r]){
            l--;
            r++;
        }
        return r - l - 1;
    }
}
