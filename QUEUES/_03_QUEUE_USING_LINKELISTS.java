public class _03_QUEUE_USING_LINKELISTS {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    static class Queue {

        static Node head = null;
        static Node tail = null;

        // Checking that is our queue is empty or not
        public static boolean isEmpty() {
            if (head == null && tail == null ) {
                return true;
            } else {
                return false;
            }
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }


        public static int remove(){
            if(isEmpty()){
                return -1 ;
            }

            int result = head.data ;
            if(head == tail ){
                head = tail = null ;
            }else {
                head = head.next ;
            }
            return result ;
        }

        public static int peek(){
            if(isEmpty()){
                return -1 ;
            }
            return head.data ;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

}
