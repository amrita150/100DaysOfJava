import java.util.*;

public class SumOfNat {

    public static int sumOfN(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return sumOfN(n-1)+n;


    }

    public static void main(String args[])
    {
        int n = 5;
        System.out.println(sumOfN(n));
    }
}
