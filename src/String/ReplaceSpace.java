package String;

/**
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */

class ReplaceSpace {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }

    public static String replaceSpace(String s) {
        String str = s.replace(" ", "%20");
        return str;
    }
    public static String replaceSpace2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
