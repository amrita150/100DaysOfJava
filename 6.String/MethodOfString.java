import java.util.*;
public class MethodOfString {
    public static void main(String[] args) {
        String str = new String(" Hello World");

        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        //it removes blank space
        System.out.println(str.trim());
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,9));
        System.out.println(str.replace('o', 'u'));
        System.out.println(str.charAt(5));
    }
}
