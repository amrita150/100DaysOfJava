import java.util.*;

class bitwiseOperator{

    public static void main(String args[])
    {
        System.out.println("Write value of a and b");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //and (&) operator 
        System.out.println( "a&b: " + (a&b));

        // or (|) operator
        System.out.println("a|b: " + (a|b));

        //XOR (^) operator
        System.out.println("a^b: " + (a^b));

        //NOT (~) operator
        System.out.println("~a: " + (~a));

        //Left shift (<<) operator
        System.out.println("a<<b: " + (a<<b));

        //Right shift (>>)  operator
        System.out.println("a>>b: " + (a>>b));

        sc.close();
    }
}