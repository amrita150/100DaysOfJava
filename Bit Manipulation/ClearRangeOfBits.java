import java.util.*;

class ClearRangeOfBits{
    
    public static void clearRangeOfBits(int num , int i ,int j )
    {
         //first half
         int a = (~1)<<j+1;
         //second half
         int b = (1<<i)-1;
         //merge first half and second half
         int n = a|b;
         //new number
         int new_num = n&num;

         System.out.println("New number is : " + new_num);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a number : ");
        int number = sc.nextInt();

        System.out.println("which position you want to start clear bits: ");
        int position_ith = sc.nextInt();

        
        System.out.println("until which position you want to start clear bits: ");
        int position_jth = sc.nextInt();

        clearRangeOfBits(number , position_ith , position_jth);


        sc.close();

    }

}