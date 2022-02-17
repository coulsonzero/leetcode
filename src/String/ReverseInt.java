package String;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args){
        //输入一个整数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //将这个整数以字符串的形式
        String str = Integer.toString(num); //可直接使用sc.nextLine()输入一个数字内容的字符串
        //逆序输出
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
