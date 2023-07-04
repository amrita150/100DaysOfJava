import java.util.*;

class BinarySearch{
    
    public static int binarySearch(int arr[] , int key) {
        int n = arr.length;
        int start = 0; 
       int end = n-1;
       
       while(start<=end)
       {
        int mid = (start+end)/2;
        if(arr[mid] > key)
        {
            end = mid-1;
        }

        else if(arr[mid] < key)
        {
            start = mid + 1;
        }

        else {
                 return mid;
             }
       }

       return -1;

       
    
        
    }


    public static void main(String args[]) {

        System.out.println("Enter elements of an array:  ");
        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i<arr.length ; i++)
        {
             arr[i]= sc.nextInt();
        } 
        

        // Sort the array (assuming it's not already sorted)
        Arrays.sort(arr); 
        
        System.out.println("Enter element ypu want to find : ");
        int key = sc.nextInt();



      int index =  binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Index is: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }

        sc.close();

        
    }
}