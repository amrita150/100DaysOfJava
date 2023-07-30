import java.util.*;

class updateBit{

    //set ith position to 1
    public static int setIthBit(int num , int pos)
    {
      int bitmask = 1<<pos;
      int newValue = num|bitmask;

      return newValue;
    }

    //ith position 0
    public static int clearIthBit(int num , int pos)
    {
      int bitmask = 1<<pos;
      int newValue = num&(~bitmask);
      return newValue;

    }

   public static int updateIthbit(int n , int i , int newBit){
      //1st approach

    //   if(newBit==0)
    //   {
    //     return clearIthBit(n,i);
    //   }
    //   else{
    //      return  setIthBit(n,i);
    //   }

      //2nd approach
      n = clearIthBit(n,i);
      int Bitmask = newBit<<i;
      return n|Bitmask;
      

   }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a number : ");
        int number = sc.nextInt();

        System.out.println("Enter ith position where you want to perform operation: ");
        int position = sc.nextInt();

        System.out.println("Enter new bit(0 or 1) you want to add at ith position: ");
        int newBit = sc.nextInt();

       System.out.println(updateIthbit(number , position , newBit)) ;

        sc.close();

    }

}