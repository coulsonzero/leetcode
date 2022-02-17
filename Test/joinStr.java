import java.util.HashMap;
import java.util.LinkedList;

/**
 * ["ab", "2"] => "ab&&2"
 */
public class joinStr {
    public static void main(String[] args) {
        String[] arr = {"ab", "2", "c"};
        System.out.println(joinStr1(arr));
        System.out.println(joinStr2(arr));
        System.out.println(joinStr3(arr));
    }
    public static String joinStr1(String[] arr) {
        String res = String.join("&&", arr);
        return res;
    }
    public static String joinStr2(String[] arr) {
        String s = "";
        for(int i=0; i<arr.length; i++) {
            if (i==arr.length-1) s = s + arr[i];
            else s = s + arr[i] + "&&";
        }
        return s;
    }
    public static String joinStr3(String[] arr) {
        StringBuilder sb = new StringBuilder();
        int i;
        for ( i = 0; i < arr.length; i++)
            if (i<arr.length-1) {sb.append(arr[i]).append("&&");}
            else {sb.append(arr[i]);}
        return sb.toString();
    }
}
