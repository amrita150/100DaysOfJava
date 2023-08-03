import java.util.*;
public class ReverseString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int i = 0 ;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            result.append(s.pop());
        }
        str = result.toString();
        return str;

    }
    public static void main(String[] args) {
        String str = new String("abc");

        System.out.println(str);
        String newStr = reverse(str);
        System.out.println(newStr);


    }
}
