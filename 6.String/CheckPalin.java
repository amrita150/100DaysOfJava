import java.util.*;
public class CheckPalin {

    public static boolean CheckPalin(String str){
     int n = str.length();
     for(int i = 0 ; i<n ; i++)
     {
        if(str.charAt(i)!=str.charAt(n-i-1))
        {
            return false;
        }
     }   
     return true;
    }
    public static void main(String[] args) {
        String str = new String();
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        if(CheckPalin(str))
        {
            System.out.println("Yes");
        }
        else
        {
           System.out.println("No");
        }
        
    }
}
