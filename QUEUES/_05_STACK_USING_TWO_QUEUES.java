import java.util.LinkedList;
import java.util.Queue;

import javax.management.QueryEval;

public class _05_STACK_USING_TWO_QUEUES {

    static class Stack{
       static Queue q1 = new LinkedList<>();
       static Queue q2  = new LinkedList<>();

        // CHECKING THAT IS OUR STACK IS EMPTY OR NOT
        public static boolean isEmpty(){
           return  q1.isEmpty();
        };

        // PUSH FUNCTION FOR THE STACK
        public static void push(int data){
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }

            q1.add(data);

            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        // POP FUNCTION FOR THE STACK 
        public static Integer pop(){
            return  q1.remove();
        }

        // PEEK FUNCTION FOR THE STACK 
        public static int peek(){
            
        }

    }
    
    public static void main(String[] args) {
        
    }
}
