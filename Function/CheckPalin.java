import java.util.*;
public class CheckPalin {

    public static boolean checkPalin(int n ){
        int temp = n;
        int reverse = 0 ;
        while(temp>0)
        {
            int lastDig = temp%10;
            reverse =  reverse*10 + lastDig;
            temp = temp/10;
        }

        if(reverse==n)
        {
            return true;
        }

      return false;
    }


    public static void main(String args[])
    {
        System.out.println("Enter value of a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(checkPalin(num))
        {
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");

        }
    }
    
}
