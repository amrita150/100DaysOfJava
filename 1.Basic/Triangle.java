import java.util.Scanner;

class Triangle{

    public static void main(String args[])
    {
        int a , b , c ;
        System.out.println("Enter all sides of triangle: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        double s = 0.5*(a+b+c);

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));


        System.out.println("Area is : " + area);


        sc.close();

    }
}