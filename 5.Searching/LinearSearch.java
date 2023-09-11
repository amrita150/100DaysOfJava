public class LinearSearch {
    
    public static boolean linearSearch(int arr[] , int target){
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,12,34,43};
        int target = 3;
        if(linearSearch(arr , target)){
            System.out.println("present");
        } else{
            System.out.println("not-present");            
        }   
    }
}
