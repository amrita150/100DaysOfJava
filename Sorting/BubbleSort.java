class BubbleSort{

    public static void bubbleSort(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 1 ; j < (arr.length - i) ; j++){
                if(arr[j-1]>arr[j]){
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,9,1,4,15,5,9,10};
        bubbleSort(arr);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}