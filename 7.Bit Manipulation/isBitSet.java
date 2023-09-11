import java.util.*;

class isBitSet{
   public static int isBitSet(int N){
        if(N==0){
         return 0; 
        }

        while (N > 0) {
        if ((N & 1) == 0) {
            return 0;
        }
        N >>= 1;
        }
            return 1;
        }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a number : ");
        int number = sc.nextInt();

        System.out.println(isBitSet(number));

    }
}