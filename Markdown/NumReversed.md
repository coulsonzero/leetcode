```
输入：1516000
输出：0006151
```
***
```java
import java.util.*;
public class Main {
    public static void main(LeeCode.A0908.StringSum[] args){
        //输入一个整数字符串的形式
        LeeCode.A0908.StringSum str = Integer.toString(new Scanner(System.in).nextInt());
        //逆序输出
        System.out.println(new StringBuffer(str).reverse());
    }
}
```
