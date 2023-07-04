import java.util.*;

public class addition{

    public static int calcSum(int a , int b ) //function declaration 
    {
        int sum = a+b;
        return sum;
    }


    public static void main(String args[]) {
        System.out.println("Enter value of a and b : ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();



       int add = calcSum(a,b); //function call

       System.out.println("sum is : " + add);

           sc.close();    
    }


}