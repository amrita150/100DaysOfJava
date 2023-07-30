import java.util.*;

class ClearLastBit{

   
    
    public static int clearLastBit(int num , int i)
    {
      int bitmask =  (-1) << i;
      int newValue = num&(bitmask);
      return newValue;

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a number : ");
        int number = sc.nextInt();

        System.out.println("till which position you want to perform operation: ");
        int position = sc.nextInt();

        System.out.println(clearLastBit(number , position));


        sc.close();

    }

}