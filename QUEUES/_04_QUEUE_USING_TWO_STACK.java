import java.util.Stack;

public class _04_QUEUE_USING_TWO_STACK {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
       
        // for checking that is our queue is empty 
        public static boolean isEmpty(){
           return s1.isEmpty();
        }

        public static void add(int data){

           while(!s1.isEmpty()){
            s2.add(s1.pop());
           };

           s1.add(data);

           while(!s2.isEmpty()){
              s1.add(s2.pop());  
           }
        };

        // REMOVE THE ELEMENT FROM THE QUEUE 
        public static int remove(){
            return s1.pop();
        }

        // SEE THE PEEK ELEMENT OF THE QUEUE 
        public static int peek(){
            return  s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
