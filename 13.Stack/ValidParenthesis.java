import java.util.*;
public class ValidParenthesis {
    public static boolean isValidParenthesis(String str) {
        Stack <Character> s = new Stack<Character>();
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='(' ){
                s.push(str.charAt(i));
            }
            else if(s.empty()){
                return false;
            }
            else if(s.peek()=='[' && str.charAt(i)==']' ){
                s.pop();
            }
            else if(s.peek()=='{' && str.charAt(i)=='}' ){
                s.pop();
            }
            else if(s.peek()=='(' && str.charAt(i)==')' ){
                s.pop();
            }
            else{
                return false;
            }
        }
            return s.isEmpty();

    }

    public static void main(String[] args) {
        String str = new String("(({{[]}}))");
        System.out.println(isValidParenthesis(str));
    }
}