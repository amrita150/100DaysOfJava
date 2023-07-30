import java.util.*;

class OddEven{

    public static boolean oddEven(int num)
    {
       int bitmask = 1;
       if((num & bitmask)==0)
       {
        return true;
       }
       
       return false;
    }

    public static void main(String args[])
    {
      System.out.println("Enter a number : ");
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();

      if(oddEven(a))
      {
        System.out.println("Number is even");
      }
      else
      {
        System.out.println("Number is odd");
      }
    }

    
}