import java.util.*;
public class BinaryString {

    public static void binaryString(int n , int lastPlace , String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        binaryString(n-1,0,str + "0");
        if(lastPlace==0)
        {
            binaryString(n-1,1,str+ "1");
        }
    }

    public static void main(String args[])
    {
        System.out.println("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        binaryString(n,0,"");
        sc.close();
    }
}