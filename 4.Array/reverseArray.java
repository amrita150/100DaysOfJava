import java.util.*;

public class reverseArray{
        

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        int temp;
        
      while(start<end)
      {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;

        start++;
        end--;
        
      }
        
    }
    public static void main(String args[]) {

        System.out.println("Enter elements of an array:  ");
        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);


        //take input
        for(int i = 0 ; i<arr.length ; i++)
        {
             arr[i]= sc.nextInt();
        } 
        
        //reverse array 
        reverse(arr);

        //print reverse array
        System.out.println("Reverse array is : ");
        for(int i = 0 ; i<arr.length ; i++)
        {
             System.out.println(arr[i]);
        } 

        sc.close();
        
    }
}