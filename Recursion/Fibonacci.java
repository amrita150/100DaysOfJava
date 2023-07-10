import java.util.*;

//to find nth fibonacci no.
class Fibonacci{

    public static int fib(int n)
    {
        if(n==0)
        {
            return 0; 
        }
        if(n==1)
        {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String args[])
    {
        System.out.println("Enter value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));


    }
}