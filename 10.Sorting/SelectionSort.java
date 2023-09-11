public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            int min = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //swap
            if(min!=i){
             int temp = arr[i];
             arr[i] = arr[min];
             arr[min] = temp;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,9,1,4,15,5,9,10};
        selectionSort(arr);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
