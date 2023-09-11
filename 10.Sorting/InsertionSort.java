public class InsertionSort {

    public static void insertionSort(int arr[]){
        for(int i = 1 ; i<arr.length ; i++){
            int curr= arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>curr)
            {
               arr[j+1] = arr[j];
               j--; 
            }
            arr[j+1] = curr;
        }
    }
    public static void main(String args[]){
        int arr[] = {4,9,1,4,15,5,9,10};
        insertionSort(arr);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
