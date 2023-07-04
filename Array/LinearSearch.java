import java.util.Scanner;

class LinearSearch {
    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1; // Key not found
    }

    public static void main(String args[]) {
        int arr[] = new int[7];

        System.out.println("Enter values of array elements:");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of the element whose index you want to find:");
        int key = sc.nextInt();

        int index = search(arr, key);
        if (index != -1) {
            System.out.println("Index is: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }

        sc.close();
    }
}
