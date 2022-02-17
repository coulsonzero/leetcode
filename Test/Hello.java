import java.util.HashMap;
import java.util.LinkedList;

public class Hello {
    public static void main(String[] args) {
        // ["ab", "2"] => "ab&&2"
        String[] arr = {"ab", "2", "c"};

        /**
         * String.join()
         */
        String res = String.join("&&", arr);
        System.out.println(res);

        /*
        String s = "";
        for(int i=0; i<arr.length; i++) {
            if (i==arr.length-1) s = s + arr[i];
            else s = s + arr[i] + "&&";
        }
        System.out.println(s);
        */

    }
}
