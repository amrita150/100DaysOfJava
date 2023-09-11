public class TotalOccurence {
    public static int firstOcc(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                if (mid == 0 || arr[mid] != arr[mid - 1]) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

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

    public static int totalOcc(int arr[] , int target){
        int first = firstOcc(arr,target);
        int last = lastOccurence(arr , target);
        int result = last - first + 1;
        if(last == -1){
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int target = 12;
        System.out.println(totalOcc(arr, target));
    }

}
