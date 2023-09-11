import java.util.*;

class incomeTax{

    public static void main(String args[]) {

        System.out.println("Income Tax Calculator");

        System.out.println("Enter your income in lakhs : ");
        Scanner sc = new Scanner(System.in);

        int income= sc.nextInt();

        if(income<5)
        {
            System.out.println("You don't have to pay any tax");
            System.out.println("You income after tax deduction: "+ income);
        }

        else if(5>=income && income<10)
        {            
            System.out.println("You income after tax deduction: ");
            double newInc= income - (income*0.2);
              
            System.out.println(newInc);
        }
        else
        {
            
            System.out.println("You income after tax deduction: ");
            double newInc= income - (income*0.3);
              
            System.out.println(newInc);

        }




  sc.close();

        
    }
}