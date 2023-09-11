import java.util.*;

class PowerOfTwo{

    public static void powerOfTwo(int n)
    {
      if((n&(n-1))==0)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");

      }
    }

    public static void main(String args[])
    {
        System.out.println("Enter value of a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        powerOfTwo(num);
        sc.close();
    }
}