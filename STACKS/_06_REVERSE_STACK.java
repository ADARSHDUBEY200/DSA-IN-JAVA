import java.util.Stack;

public class _06_REVERSE_STACK {
    public static void PushBottom(Stack<Integer> s ,int data ){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }

        int top = s.pop();
        PushBottom(s,data);
        s.push(top);
}

    public static void reverseStack(Stack<Integer> s ){
        if (s.isEmpty()) {
            return ;
        }
     
        int value = s.pop();
        reverseStack(s);
        PushBottom(s,value);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        reverseStack(s);

        System.out.println("THE STACK AFTER THE POPING OF THE ELEMENT");

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
