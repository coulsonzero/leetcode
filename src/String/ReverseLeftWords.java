package String;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 */

public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
