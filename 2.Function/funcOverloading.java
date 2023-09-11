import java.util.*;

public class funcOverloading{

    public static int Sum(int a , int b ) //function declaration 
    {
        int sum = a+b;
        return sum;
    }
    
    public static int Sum(int a , int b , int c ) 
    //no. of parameters different 
    {
        int sum = a+b+c;
        return sum;
    }

    public static float Sum(float a , float b ) 
    //data type of parameters different
    {
        float sum = a+b;
        return sum;
    }



    public static void main(String args[]) {
        System.out.println("Enter value of a and b : ");
        Scanner sc = new Scanner(System.in);




       int add1 = Sum(2,3); //function call
       float add2 = Sum(2.5f, 9.6f); //function call
       int add3 = Sum(5,6,7); //function call


       System.out.println("sum is : " + add1);
       System.out.println("sum is : " + add2);

       System.out.println("sum is : " + add3);


           sc.close();    
    }


}