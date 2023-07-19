import java.util.*;
class ReverseOfArrayList{
    public static void reverse(ArrayList <Integer> arr) //pass arraylist inside function param
    {
        for(int i = arr.size()-1 ; i>=0 ;i--)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
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

        reverse(arr);
    }
}