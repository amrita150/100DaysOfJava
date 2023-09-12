import java.util.Arrays;

class MissingElement{

    //naive approach O(n*log n) ti9me complexity
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int range = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) {
                range++;
            } else {
                return i;
            }
        }

        return range;
    }


    //optimized approach O(n) time
    public static int missingNumber1(int[] arr) {
        int n = arr.length;
        int actualSum = (n * (n + 1)) / 2;
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            sum = sum + arr[i];
        }

        return (actualSum - sum);
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missing = missingNumber1(nums);
        System.out.println("The missing number is: " + missing);
    }
}
