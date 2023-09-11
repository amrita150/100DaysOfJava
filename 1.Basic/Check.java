import java.util.*;

class Check{
    public static void main(String args[])
    {
        System.out.println("Enter you marks : ");
        Scanner sc= new Scanner(System.in);

        int marks= sc.nextInt();

        String result = (marks>=33)?"Pass":"Fail";

        System.out.println("Your Result is: "+ result);

        sc.close();

    }
}