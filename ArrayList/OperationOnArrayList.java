import java.util.*;
class OperationOnArrayList{
    public static void main(String args[])
    {
        ArrayList <Integer> arr = new ArrayList<>();
        //add elements to an arrayList , it takes O(1) time complexity
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr);

        //get value of an element at particular index , it takes O(1) time complexity
        int ele =arr.get(4);
        System.out.println(ele);

        //remove element at particular index from an arrayList , it takes O(n) time complexity
        arr.remove(2);
        System.out.println(arr);

        //set element at index , it takes O(n) time complexity
        arr.set(3,7);
        System.out.println(arr);

        //contain element , it will print true or false , it takes O(n) time complexity
        System.out.println(arr.contains(7));

        //we can add value at some index , it takes O(n) time complexity
        arr.add(4,8);
        System.out.println(arr);

        //to get size of an arrayList
        System.out.println(arr.size());

    }
}