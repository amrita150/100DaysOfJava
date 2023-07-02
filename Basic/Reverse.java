import java.util.*;

class reverse{
    public static void main(String args[])
    {
        System.out.println("Enter number which you want to reverse : ");
        Scanner sc= new Scanner(System.in);

        int number= sc.nextInt();

        while(number > 0)
        {
            int dig = number%10;
            System.out.print(dig);

            number=number/10;
        }


        sc.close();

    }
}