import java.util.*;
public class DeleteMid {
    public static void deleteMidStack(Stack<Integer> s , int size){
        int total = ((size-1)/2);
        if(size==(total)){
            s.pop();
            return;
        }
        int top = s.peek();
        s.pop();
        //recursive call
        deleteMidStack(s , total);
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
        deleteMidStack(s,s.size());

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }

    }
}

