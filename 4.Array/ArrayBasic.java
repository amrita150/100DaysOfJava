import java.util.Scanner;

class ArrayBasic{

    public static void printArray(int arr[] ) 
    {
         for(int i = 0 ; i<arr.length ; i++)
     {
        System.out.println(arr[i]);
     }
        
    }
    public static void main(String args[]) {
     
        int arr[] = new int[5];

  System.out.println("Enter values of array elements : ");
  Scanner sc = new Scanner(System.in);

  for(int i = 0 ; i< arr.length ; i++)
  {
    arr[i]= sc.nextInt();
  }

  printArray(arr);

    sc.close();    
        
    }
}