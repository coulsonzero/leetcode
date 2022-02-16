import java.util.Arrays;

/**
 * String
 *
 * length(): 长度
 * charAt(i): 字符
 * indexOf(c): 索引
 * substring(i, j): 切片
 * toCharArray()
 * String.valueOf(obj): 转字符串
 * toUpperCase()
 * toLowerCase()
 * contact(s): 字符串拼接
 * split('-')
 * replace(c, c)
 *
 * contains(c)
 * startsWith()
 * endsWidth()
 */

public class StringDemo {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(s.charAt(1));
        System.out.println(s.toCharArray()[1]);
        System.out.println(s.indexOf('e'));
        System.out.println(String.valueOf(new char[]{'c', 'a'}));
        System.out.println(s.toUpperCase());
        System.out.println("GSASqw".toLowerCase());
        System.out.println(s.contains("w"));
        System.out.println(s.concat("!"));
        System.out.println(s.substring(5));
        System.out.println(s.substring(5, 7));
        System.out.println(s.replace('w', 'p'));
        System.out.println(s.startsWith("h"));
        System.out.println(s.endsWith("a"));


        // . 必须得加 转义字符\\
        for(String c : "192.168.1.1".split("\\.")){
            System.out.println(c);
        }



    }
}
