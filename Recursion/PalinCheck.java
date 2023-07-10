import java.util.*;

public class PalinCheck {

    public static boolean isPalin(String s , int i , int n )
    {
       
        if(i>=n)
        {
            return true;
        }
        return (s.charAt(i)==s.charAt(n)) && isPalin(s,i+1,n-1);

        
    }
    public static void main(String args[])
    {
        System.out.println("Enter word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int i = 0;
        int n = word.length()-1;
        if(isPalin(word , i , n))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        
    }
    
}
