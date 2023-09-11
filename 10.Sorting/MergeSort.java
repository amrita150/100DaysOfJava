public class MergeSort {
    
    public static void mergeSort(int arr[] , int st , int end){
       
        if(st >= end){
            return;
        }
        int mid = st + (end - st)/2;
        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,st,mid,end);
    }

    public static void merge(int arr[] , int st , int mid ,int end){
        int temp[] = new int[end - st + 1];
        int i = st;
        int j = mid+1;
        int k = 0;
        
        while(i<=mid && j<=end){
            if(arr[i]>=arr[j]){
                temp[k] = arr[j];
                k++;
                j++;
            }
            else{
                temp[k] = arr[i];
                i++;
                k++;
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=end){
            temp[k++] = arr[j++];
        }

        //copy temp to original
        int h = st;
        for(int x = 0; x<(end - st + 1); x++){
            arr[h] = temp[x];
            h++;
        }
    }

    public static void main(String args[]){
        int arr[] = {4,9,1,4,15,5,9,10};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}

