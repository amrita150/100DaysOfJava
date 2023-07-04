import java.util.*;

public class pattern4{

    public static void main(String args[]) 
    {
         System.out.println("enter number: ");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         char alpha ='A';
         
         for(int i = 1; i<=num ; i++)
         {
            for(int j = 1; j<=i ; j++)
            {
                System.out.print(alpha);
                alpha++;
            }

            System.out.println();
         }

         sc.close();
    }
}