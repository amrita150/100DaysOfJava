import java.util.*;


public class checkPrime {


    //brute force approach
// public static boolean isPrime(int num) {
    

//     // //corner cases

//     // if(num==1 || num==2)
//     // {
//     //     return true;
//     // }

//     for(int i = 2 ; i<=(num-1) ; i++)
//     {
//         if((num%i)==0)
//         {
//             return false;
//         }
//     }

//     return true;
    
// }



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


public static void main(String args[])
{
       System.out.println("Enter a number : ");
       Scanner sc = new Scanner(System.in);

       int number = sc.nextInt();

      if(isPrime(number))
      {
               System.out.println("It is prime ");

      }
      else
      {

                       System.out.println("It is not prime ");

      }






 sc.close();      
}
    
}
