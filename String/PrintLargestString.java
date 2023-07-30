public class PrintLargestString {
   public static void largestString(String arr[]) {
    String largest = arr[0];
    for(int i = 1 ; i<arr.length ; i++)
    {
       if(largest.compareTo(arr[i]) < 0)
       {
        largest = arr[i];
       }
    }
      System.out.println(largest);
   }
   
    public static void main(String[] args) {
        String fruit[] = {"apple" , "banana" , "mango" ,  "mangoo" , "avocado"};
        largestString(fruit);
    }
}
