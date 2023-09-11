import java.util.*;

public class Basic{
    public static void main(String args[])
    {
        //create a pen object p1
        Pen p1 = new Pen();
        System.out.println(p1.getcolor());

        p1.setColor("Blue");
        System.out.println(p1.color);

        
        p1.setColor("Yellow");
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Amrita0212";
                
        // //this will show error 
        // myAcc.password = "Hello_412";

        // //this will show error 
        // System.out.println(myAcc.password);

        System.out.println(myAcc.username);
        

    }
}
    class BankAccount{
        public String username;
        private String password;

    }

    class Pen{

        //properties 
        String color = "Red";
        int tip;

        //getter -> return the value
        String getcolor(){
            return this.color;
        }

        //setter -> set the value
        void setColor(String newColor){
            color= newColor;
        }

        void setTip(int newTip){
            tip = newTip;
        }
    }
