import java.util.*;
class SwapArrayList{
    public static void swap(ArrayList <Integer> arr , int idx1 , int idx2) //pass arraylist inside function param
    {
       int temp = arr.get(idx1);
       arr.set(idx1, arr.get(idx2));
       arr.set(idx2 , temp);

       System.out.println(arr);
    }
    public static void main(String args[])
    {
        ArrayList <Integer> arr = new ArrayList<>();
        //add elements to an arrayList , it takes O(1) time complexity
        arr.add(101);
        arr.add(32);
        arr.add(83);
        arr.add(40);
        arr.add(57);
        arr.add(69);

        System.out.println(arr);

        swap(arr,2,5);
    }
}