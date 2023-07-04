
public class maxSubarray2
{

    //optimized approach
    //time complexity is O(n2)
    public static void maxSubarray(int arr[]) 
    {
       int maxSum = Integer.MIN_VALUE;
       int prefixArr[] = new int[arr.length];
       prefixArr[0] = arr[0];
        for(int i = 1 ; i<prefixArr.length ; i++)
        {
            prefixArr[i]=prefixArr[i-1] + arr[i];
        }

        for(int i = 1; i<arr.length ; i++)
        {
            int current_sum =0;
            int start = i ;
            for(int j = i ; j<arr.length ; j++)
            {
                int end = j;

                current_sum = prefixArr[end]-prefixArr[start-1];
            }

            if(maxSum<current_sum)
            {
                maxSum=current_sum;
            }
        }
        System.out.println("max sum is : " + maxSum);
    }

    public static void main(String args[]) {

        int array[] = {1,-2,4,-1,7};
        
        
        maxSubarray(array);
    }
}