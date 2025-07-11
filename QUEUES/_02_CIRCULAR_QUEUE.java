public class _02_CIRCULAR_QUEUE {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1 ;

        }

        // CHAECKING THAT OUR QUEUE IS EMPTY OR NOT
        public static boolean isEmpty() {
            if (rear == -1 && front == -1 ) {
                return true;
            } else {
                return false;
            }
        }


        // CHECKING THAT IS OUR QUEUE IS FULL OR NOT 
        public static boolean isFull(){
            if((rear +1 )%size == front){
                return true ;
            }else {
                return false ;
            }
        }

        // ADD THE ITEMS IN THE QUEUE
        public static void add(int data) {
            if (isFull()) {
                return;

            }
            
            // WHEN WE ADDING THE FIRST ELEMENT 

            if(front == -1){
                front = (front+1)%size ;
            }

            rear = (rear + 1)% size;
            arr[rear] = data;
            System.out.println("THE ELEMENT ADDED IS : " + arr[rear]);
        }

        // REMOVE THE ELEMENT FROM THE QUEUE
        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            
            int result = arr[front];
          
            if(front == rear ){
                front = rear = -1 ;
            }else {
                front = (front+1) %size ;
            }
            return result ;
        }

        // SEE THE PEEK ELEMENT
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

      while(!q.isEmpty()){
        System.out.println(q.remove());
      }
    }
}