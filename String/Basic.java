import java.util.*;
class Basic{

    public static void main(String[] args) {
        //short way 
        String str1 = "Hello World";
        //create a string object
        String str2 = new String("Example");

        System.out.println(str1);
        System.out.println(str2);

        //initializing an of char and assign them to string
        char[] charArray = {'H','e','l','l','o',' ','W','o','r','l','d'};
        String str3 = new String(charArray);
        System.out.println(str3);


        //take string as input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String str = sc.nextLine();
        System.out.println(str);
    }
}