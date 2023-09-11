import java.util.*;

public class BinomialCoff{

    public static int Factorial(int num )//function declaration 
    {
        int fact = 1;

        for(int i = num ; i>0  ; i--)
        {
                fact = fact*i;
        }

        return fact;
    }

	public static void calculateBinomial(int n , int r) {

		int fact_n = Factorial(n);
		int fact_r = Factorial(r);
		int fact_nmr = Factorial(n-r);

		int binoCof = (fact_n)/(fact_r*fact_nmr);

	System.out.println("binomial coefficient is : " + binoCof);

	}


    public static void main(String args[]) {
        System.out.println("Enter value of n : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Enter value of r : ");

		int r = sc.nextInt();




    calculateBinomial(n,r); //function call


           sc.close();    
    }


}