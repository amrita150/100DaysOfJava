import java.util.*;
class MaxiOfArrayList{
    public static void maximum(ArrayList <Integer> arr) //pass arraylist inside function param
    {
        int large = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.size() ;i++)
        {
            if(arr.get(i) > large)
            {
                large = arr.get(i);
            }
        }

         System.out.println(large);
        
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

        System.out.println(arr);

        maximum(arr);
    }
}