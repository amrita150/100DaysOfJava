import java.util.*;

class operationsOnBits{

    //get ith position whether it is 0 or 1

    public static void getIthBit(int num , int pos)
    {
       int bitmask = 1<<pos;
       
       if((num & bitmask)==0)
       {
        System.out.print( "0");
       }
       else
       {
        System.out.print( "1");
       }
    }

    //set ith position to 1
    public static void setIthBit(int num , int pos)
    {
      int bitmask = 1<<pos;
      int newValue = num|bitmask;

      System.out.println(newValue);
    }

    //ith position 0
    public static void clearIthBit(int num , int pos)
    {
      int bitmask = 1<<pos;
      int newValue = num&(~bitmask);
      System.out.println(newValue);

    }


    public static void main(String args[])
    {
        System.out.println("Select which option you want to perform: ");
        System.out.println("1. Get ith bit" + "\n" + "2. Set ith bit" + "\n" + 
        "3. Clear ith bit" );

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        System.out.println("Enter value of a number : ");
        int number = sc.nextInt();

        System.out.println("Enter ith position where you want to perform operation: ");
        int position = sc.nextInt();

        switch (choice) {
         case 1: 
            getIthBit(number , position);
            break;
            
         case 2:
            setIthBit(number , position);
            break;

         case 3:
            clearIthBit(number , position);
            break;
        
      }
        
            

    }
}