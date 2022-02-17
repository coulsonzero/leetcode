package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author CoulsonZero
 * @version 2021-05-21 0:47
 * @字符串反转
 * @题目描述：接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 */

public class ReverseStr {
    public static void main(String[] args) {
        System.out.println(reverseStr("hello"));
    }
    public static String reverseStr(String s) {
        return new StringBuffer(s).reverse().toString();
        // return new StringBuffer((new Scanner(System.in)).nextLine()).reverse().toString();
    }
    public static void reverseStr1() {
        //1.接收一个只包含小写字母的字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //2.然后输出该字符串反转后的字符串
        StringBuffer sb= new StringBuffer(str.toLowerCase());
        System.out.println(sb.reverse());


    }

    public static void reverseStr2() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=in.readLine())!=null){
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}




/**
 * python3解法：
 * print(input()[::-1])
 */

