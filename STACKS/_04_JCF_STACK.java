import java.util.Stack;
public class _04_JCF_STACK {

    public static void PushBottom(Stack<Integer> s , int data ){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }

        int value = s.pop();
        PushBottom(s,data);

        s.push(value);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        System.out.println("THE STACK AFTER THE PUSHING : ");

        PushBottom(s, 4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
