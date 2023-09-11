public class QuickSort {
    
    public static void quickSort(int arr[] , int st , int end){
        if(st>=end){
            return;
        }
        int pivot = partition(arr,st,end);
        quickSort(arr,st,pivot-1);
        quickSort(arr,pivot+1 , end);
    }

    public static int partition(int arr[] , int st , int end){
        int pivot = arr[end];
        int i = st - 1;
        for(int j = st ; j<end ; j++){
            if(arr[j]<=pivot){
                i++;
            //swap
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end]=arr[i];
        arr[i]=temp;

        return i;
    }

    public static void main(String args[]){
        int arr[] = {4,9,1,4,15,5,9,10};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
