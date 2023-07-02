import java.util.*;

class evenOdd{
    public static void main(String arg[]) {
        System.out.println("Enter a no.  ");
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Number is Even!");

        }
        else
        {
            System.out.println("Number is Odd!");

        }

        sc.close();
        
    }
}