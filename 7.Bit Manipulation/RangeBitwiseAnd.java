

class RangeBitwiseAnd {
    public static void main(String[] args) {
    int left = 1012;
    int right = 1023;
    

    //brute force approach
    int result = left;
    for(int i = left ; i<right ; i++)
    {
        result = result&(i+1);
    }

    //optimized approach
    while(right>left){
        result = right & (right - 1);
        right = result;
        }
     
    System.out.println(result);
        
    }

}