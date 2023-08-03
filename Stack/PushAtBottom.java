import java.util.*;
public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> s , int data){
        //using recursion
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
   public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    int data = 5;
    pushAtBottom(s,data);
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
   }    
}
