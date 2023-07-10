import java.util.*;

//to find nth fibonacci no.
class SumOfDigit{

    public static int sumOfDigit(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return sumOfDigit(n/10) + n%10;
    }

    public static void main(String args[])
    {
        System.out.println("Enter value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumOfDigit(n));


    }
}