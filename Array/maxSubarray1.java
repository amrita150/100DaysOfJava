
public class maxSubarray1
{

    //brute force approach
    public static void maxSubarray(int arr[]) 
    {
       int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++)
        {
            int start = i;

            for(int j = i ; j<arr.length ; j++)
            {
                int end = j ;
                int currentSum = 0;

                for(int k = start ; k<=end ; k++)
                {
                   currentSum += arr[k] ;
                }

                if(maxSum < currentSum)
                {
                    maxSum = currentSum;
                }

            }

        

        }
        System.out.println("max sum is : " + maxSum);

        
    }

    public static void main(String args[]) {

        int array[] = {1,-2,4,-1,7};
        
        
        maxSubarray(array);
    }
}