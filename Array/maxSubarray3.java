//kadane's algo
public class maxSubarray3
{

    //optimized approach
    //time complexity is O(n)
  public static void Kadane(int arr[]) 
    {
       int maxSum = Integer.MIN_VALUE;
       int current_sum=0;

       for(int i =0 ; i<arr.length ; i++)
       {
         current_sum = arr[i] + current_sum;

         if(current_sum<0)
         {
            current_sum =0;
         }
       }

       if(maxSum<current_sum)
       {
        maxSum = current_sum;
       }

       System.out.println("Max sum is:" + maxSum);
    }

public static void main(String args[]) {
        
    int array[] = {1,-2,4,-1,7};
    
    Kadane(array);

    }
}