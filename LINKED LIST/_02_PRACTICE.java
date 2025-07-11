public class _02_PRACTICE {

    static class Linkedlist{

        class Node {
            int data ; 
            Node next ;

            Node (int data){
                this.data = data ;
                this.next = null ;
            }
        }

        public static Node head;
        public static Node tail;

        // METHODS IN THE LINKEDLISTS 

        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }

            newNode.next = head;

            head = newNode;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode; 
                return;
            }

            newNode.next = null;

            tail = newNode;
        }

        public void print(){

            if(head == null ){
                System.out.println("LL IS EMPTY");
                return ;
            }

            Node temp = head ;

            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }

            System.out.println();
        }


    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.head = ll.new Node(1);
        ll.head.next = ll.new Node(2);

    }
    
}
