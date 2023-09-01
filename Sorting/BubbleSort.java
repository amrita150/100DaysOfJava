class BubbleSort{

    //its time complexity is O(n^2) at worst or best case
    // public static void bubbleSort(int arr[]){
    //     for(int i = 0 ; i<arr.length ; i++){
    //         for(int j = 1 ; j < (arr.length - i) ; j++){
    //             if(arr[j-1]>arr[j]){
    //                 //swap
    //                 int temp = arr[j-1];
    //                 arr[j-1] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    // }

    //its time complexity at worst case is O(n^2) and best case is O(n)
    public static void bubbleSort(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            boolean flag = false;
            for(int j = 1 ; j < (arr.length - i) ; j++){
                if(arr[j-1]>arr[j]){
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                break;
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