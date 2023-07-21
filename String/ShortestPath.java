import java.util.*;
public class ShortestPath {
    public static void shortestPath(String str) {
        int x = 0 ;
        int y = 0 ;
        int n = str.length();
        str = str.toLowerCase();
        for(int i = 0 ; i<n ; i++)
        {
            if(str.charAt(i)=='w'){
                x=x-1;
            }
           else if(str.charAt(i)=='e'){
                x=x+1;
            }
            else if(str.charAt(i)=='s'){
                y=y-1;
            }
            else{
                y=y+1;
            }
        }

        int path = (int)Math.sqrt(x*x + y*y);
        System.out.println(path);
    }

     public static void main(String[] args) {
        String str = new String();
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        shortestPath(str);
     }
}
