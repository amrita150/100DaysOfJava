public class StringComparison {
    public static void main(String[] args) {
        String str1 = new String("Java program");
        String str2 = "Java program";
        String str3 = "Java program";

        //this print no bcoz str1 is object stored in heap and str2 is stored in pool
          System.out.println(str1==str2);  
        //this prints yea bcoz it(equals) is used to compare the actual content of objects, 
        //specifically for strings, to check if they have the same sequence of characters.
          System.out.println(str1.equals(str2));          
    }
}
