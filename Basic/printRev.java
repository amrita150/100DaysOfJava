import java.util.*;

class printRev{
    public static void main(String args[])
    {
        System.out.println("Enter number which you want to reverse : ");
        Scanner sc= new Scanner(System.in);

        int number= sc.nextInt();
        int rev=0;

        for(int i = 1 ; i>0 ; i++)
        {
            int dig = number%10;
        
            rev = (rev*10) + dig;
            number=number/10;
        }


        sc.close();

    }
}