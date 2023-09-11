import java.util.Scanner;

class TriangleArea{
    public static void main(String args[])
    {
        int base , height;
        double area;

        System.out.println("Enter base of triangle: ");
        Scanner sc = new Scanner(System.in);

        base = sc.nextInt();
        System.out.println("Enter height of triangle: ");
        height = sc.nextInt();


        area = 0.5*base*height;

        System.out.println("Area is : " + area);


        sc.close();



    }

}