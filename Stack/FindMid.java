import java.util.*;
public class FindMid {

    public static void midOfStack(Stack<Integer> s , int size){
        int total = ((size-1)/2);
        if(size==(total)){
            System.out.print(s.peek());
            return;
        }
        int top = s.peek();
        s.pop();
        //recursive call
        midOfStack(s , total);
        //backtrack
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(10);
        s.push(1);
        s.push(5);
        s.push(15);
        midOfStack(s,s.size());

    }
}
