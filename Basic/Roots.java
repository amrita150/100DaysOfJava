import java.util.Scanner;

class Roots{
    public static void main(String args[])
    {
        int a , b , c;
        System.out.println("Enter values of a , b, c: ");
        Scanner sc = new Scanner(System.in);

        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        double r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("Roots of equation are " + r1 + "  and  " + r2);

        sc.close();


        
    }
}