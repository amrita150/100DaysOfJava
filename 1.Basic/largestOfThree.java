import java.util.*;

class largestOfThree{

    public static void main(String args[]) {
        System.out.println("Enter value of a , b ,c ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a>=b) && (a>=c))
        {
            System.out.println(a + " is largest them all");

        }
        else if(c>=b)
        {
            System.out.println(c + " is largest them all");

        }
        else
        {
            System.out.println(b + " is largest them all");

        }

        sc.close();
        
    }
}