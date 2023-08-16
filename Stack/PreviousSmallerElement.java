import java.util.Stack;
public class PreviousSmallerElement {
    public static int[] previousSmaller(int arr[]) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int[] newArr = new int[arr.length];
        for(int i = 0 ; i<arr.length ; i++){
            int curr = arr[i];
            while(s.peek()>=curr){
                s.pop();
            }
            newArr[i]=s.peek();
            s.push(curr);
        }

        return newArr;
        
    }

    public static void main(String[] args) {
        int arr[] = {4,1,3,5,2,1,6,5};
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
         }
         System.out.println();
         int output[] = previousSmaller(arr);
         for(int i = 0 ; i<output.length ; i++){
            System.out.print(output[i] + " ");
         }

    }
}
