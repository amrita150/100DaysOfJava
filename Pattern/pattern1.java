import java.util.*;

public class pattern1{

    public static void main(String args[]) 
    {
         System.out.println("enter number: ");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         
         for(int i = 1; i<=num ; i++)
         {
            for(int j = 0 ; j<i ; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
         }

         sc.close();
    }
}