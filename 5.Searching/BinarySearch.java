public class BinarySearch {
    
    public static boolean binarySearch(int arr[] , int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
        int mid = (left + right)/2;
            if(arr[mid]==target){
                return true;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,12,34,43};
        int target = 3;
        if(binarySearch(arr , target)){
            System.out.println("present");
        } else{
            System.out.println("not-present");            
        }   
    }
}
