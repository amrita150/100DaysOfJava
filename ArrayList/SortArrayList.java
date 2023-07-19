import java.util.*;

 
class SortArrayList {
 public static void main(String args[]) {
        ArrayList <Integer> arr = new ArrayList<>();
        //  add elements to an arrayList , it takes O(1) time complexity
        arr.add(101);
        arr.add(32);
        arr.add(83);
        arr.add(40);
        arr.add(57);
        arr.add(69);

        System.out.println(arr);

        //  sort ascending
        Collections.sort(arr);
        System.out.println(arr);

        //  sort descending
        Collections.sort(arr , Collections.reverseOrder());
        System.out.println(arr);

    }
}