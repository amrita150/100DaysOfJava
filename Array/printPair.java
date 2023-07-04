


public class printPair{

    public static void pairs(int arr[]) {
        for(int i = 0 ; i<arr.length-1 ; i++)
        {
            for(int j= i+1 ; j<arr.length ; j++)
            {
                System.out.print("(" + arr[i] + " , " + arr[j] + ") , " );
            }

            System.out.println();
        }
        
    }

    public static void main(String args[]) {

        int array[] = {1,2,4,6,7};
        System.out.println("pairs form by this array are: ");
        
        pairs(array);
    }
}