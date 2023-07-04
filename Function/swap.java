  import java.util.*;

public class swap{

    public static void swapFunc(int a , int b ) //function declaration 
    {
          int temp = a;
          a = b ;
          b = temp ; 

          System.out.println("After swapping value of a is "+ a + " and b is " + b);

    }


    public static void main(String args[]) {
      
        System.out.println("Enter value of a and b : ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();



       swapFunc(a,b); //function call

           sc.close();    
    }


}