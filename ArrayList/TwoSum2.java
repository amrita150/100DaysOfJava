import java.util.*;
class TwoSum2 {
    public static boolean twoSum(ArrayList<Integer> arr, int target){
        //find breaking pt.
        int right , left;
        int i ;
        int n = arr.size();
        for (i = 0; i < n - 1; i++) {
            if(arr.get(i)>arr.get(i+1))
            {
                break;
            }
        }
        right = i;
        left = i+1;

        while (left != right) {
            int sum = arr.get(left) + arr.get(right);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                // The sum is smaller than the target,
                // we need to increase the sum.
                left = (left + 1) % n;
            } else {
                // The sum is greater than the target,
                // we need to decrease the sum.
                right = (right - 1 + n) % n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        int target = 19;
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(twoSum(arr,target));
    }
}
