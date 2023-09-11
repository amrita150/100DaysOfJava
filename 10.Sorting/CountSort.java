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

/*
//another way
import java.util.*;

public class Solution {

    public static int[] sort(int n, int arr[]) {
        if (n <= 0) {
            return arr; // Return the array as is for empty or invalid input
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find the maximum and minimum values in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Create a count array with a size covering the range of values
        int range = max - min + 1;
        int count[] = new int[range];

        // Store the count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }

        int j = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[j] = i + min; // Adjust the value back to its original range
                j++;
                count[i]--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = {4, 2, 2, 8, 3, 3};
        arr = sort(n, arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */