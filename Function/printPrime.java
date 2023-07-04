import java.util.*;


public class printPrime {




//optimized approach
public static boolean isPrime(int num) {
    

    // //corner cases

    // if(num==1 || num==2)
    // {
    //     return true;
    // }

    for(int i = 2 ; i<=(int)Math.sqrt(num) ; i++)  //sqrt takes double so type cast it to int
    {
        if((num%i)==0)
        {
            return false;
        }
    }

    return true;
    
}


public static void printPrimeNum(int num)
 {
    
    for(int i=1 ; i<=num ; i++)
    {
        if(isPrime(i))
        {
           System.out.println(i + "  ");
        }
    }
    
}


public static void main(String args[])
{
       System.out.println("Enter a number : ");
       Scanner sc = new Scanner(System.in);

       int number = sc.nextInt();



System.out.println("prime no. in range : " );
printPrimeNum(number);



 sc.close();      
}
    
}
