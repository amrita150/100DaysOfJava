import java.util.*;

class CountSetBits{

    public static void countSetBits(int num)
    {
        int count = 0;
        int bitmask = 1;
        while(num!=0)
        {
         if((num & bitmask)==1)
        {
          count++;
        }
                  num = num>>1;

        }

        System.out.println(count);
        
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a number : ");
        int number = sc.nextInt();

        countSetBits(number);


    }
}