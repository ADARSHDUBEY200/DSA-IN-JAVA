import java.util.ArrayList;
public class _02_STACK_ARRAYLIST {

    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            if(list.size()==0){
                return true ;
            }

            return false;
        }

        // PUSH FUNCTION 
        void push(int value ){
            list.add(value);
        }

        // POP FUNCTION 
        int  pop(){
            if (isEmpty()) {

                return -1 ;
                
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }

        // PEEK FUNCTION 
        int peek(){
            if (isEmpty()) {

                return -1 ;
                
            }
            int top = list.get(list.size()-1);
            return top ;
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        // s.push(2);
        // s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
