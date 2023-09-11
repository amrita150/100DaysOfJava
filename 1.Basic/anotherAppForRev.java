import java.util.*;

class anotherAppForRev {
    public static void main(String args[]) {
        System.out.println("Enter the number you want to reverse: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int rev = 0;

        while (number > 0) {
            int dig = number % 10;
            rev = (rev * 10) + dig;
            number = number / 10;
        }

        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}
