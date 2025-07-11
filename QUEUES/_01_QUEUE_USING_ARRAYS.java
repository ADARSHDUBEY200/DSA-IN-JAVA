
public class _01_QUEUE_USING_ARRAYS {

    static class Queue {
        static int arr[];
        static int size ;
        static int rear ;

        Queue(int n ){
            arr = new int[n];
            size =n ;
            rear = -1 ;
        }

        // FOR ANALYSING THE QUEUE 
        public static boolean isEmpty(){
            if(rear == -1 ){
                return true ;
            }else{
                return false ;
            }
        }

        // add Element in the queue 
        public static void add(int data ){
               if(rear == size -1 ){
                System.out.println("queue is full ");
                return;
               }
               
               rear = rear + 1 ; // firstly increarse the rear 
               arr[rear] = data ;// then add the data 
              

        }

        // remove data from the queue 
        public static int remove(){
            if(isEmpty()){
                return -1 ;
            }

            int front = arr[0];
            for(int i =0 ; i < rear ; i++){
                arr[i]= arr[i+1];
            }
            rear = rear -1 ;
            return front ;
        }

        // peek function in the queue 
        public static int peek(){
            if(isEmpty()){
                System.out.println("THE QUEUE IS EMPTY ");
                return -1 ;
            }

            int front = arr[0];

            return front ;
        }

        
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("THE REMOVED ELEMENT IS : "+q.remove());
        System.out.println("THE PEEK ELEMENT IS : "+q.peek());

        // PRINT THE QUEUE 
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
