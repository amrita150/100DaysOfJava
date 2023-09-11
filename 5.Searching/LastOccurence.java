public class LastOccurence {

    // using binarySearch
    public static int lastOccurence(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                if (mid == arr.length -1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int target = 5;
        System.out.println(lastOccurence(arr, target));
    }
}

      
    
        
    
    
        
    
    
            
            
         
             
        
    

     

            
            
    