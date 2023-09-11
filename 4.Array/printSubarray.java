


public class printSubarray
{

    //brute force approach
    public static void subarray(int arr[]) 
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            int start = i;

            for(int j = i ; j<arr.length ; j++)
            {
                int end = j ;

                for(int k = start ; k<=end ; k++)
                {
                    System.out.print(arr[k] + "   ");
                }
                System.out.print("  ");

            }
            System.out.println();

        }
        
    }

    public static void main(String args[]) {

        int array[] = {1,2,4,6,7};
        System.out.println("subarrays of this array : ");
        
        subarray(array);
    }
}