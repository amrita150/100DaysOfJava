

class RangeBitwiseOr {
    public static void main(String[] args) {
    long L = 1012;
    long R = 1023;
    
    long result = L;
    while(L<R)
    {
        result = L | (L+1); 
        L = result;
    }
     
    System.out.println(result);
        
    }

}