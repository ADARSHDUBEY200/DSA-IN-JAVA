
public class _03_STACK_LINKEDLIST {

    static class Node {
        int data ;
        Node next ;

        Node(int data){
            this.data = data ;
            this.next = null;
        }
    }

    static class Stack {
        static  Node head = null ;

        public boolean isEmpty(){
            if(head == null ){
                return true  ;
            }

            return false ;  
        }

        // PUSH FUNCTION 
        public void push(int data ){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return ;
            }

            newNode.next = head ;
            head = newNode ;
        }

        // POP FUNCTION 

        public int pop(){
            if(isEmpty()){
                return -1 ;
            }

            int top = head.data ;
            head = head.next ;

            return top ;
        }

        // PEEK FUNCTION 
        public int peek(){
            if (isEmpty()) {

                return -1 ;
            }

            int top = head.data ;
            return top ;
        }
}


    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {

           System.out.println(s.peek());
           s.pop();
        }
        
    }
    
}
