import java.util.*;
public class CountSort {
    
    public static void countSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int count[] = new int[max+1];

        //store the count of each element
        for(int i = 0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        int j =0;
        for(int i = 0 ; i<count.length ; i++){
            while(count[i]>0){
                arr[j]=i;    
            j++;
            count[i]--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,9,1,4,3,5,6,10};
        countSort(arr);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
