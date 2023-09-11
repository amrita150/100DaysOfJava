import java.util.*;

public class Factorial{

    public static int calculateFactorial(int num )//function declaration 
    {
        int fact = 1;

        for(int i = num ; i>0  ; i--)
        {
                fact = fact*i;
        }

        return fact;
    }


    public static void main(String args[]) {
        System.out.println("Enter value of a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();



       int fact= calculateFactorial(num); //function call

       System.out.println("factorial is : " + fact);

           sc.close();    
    }


}