
import java.util.*;

class sumOfNat {
    public static void main(String args[]) {
        System.out.println("Enter the value of a number whose sum you want: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            i++;
        }

        System.out.println("Sum of natural numbers up to " + number + " is " + sum);

        sc.close();
    }
}
