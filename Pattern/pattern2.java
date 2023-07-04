import java.util.*;

public class pattern2{

    public static void main(String args[]) 
    {
         System.out.println("enter number: ");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         
         for(int i = 1; i<=num ; i++)
         {
            for(int j = num ; j>=i ; j--)
            {
                System.out.print("* ");
            }

            System.out.println();
         }

         sc.close();
    }
}