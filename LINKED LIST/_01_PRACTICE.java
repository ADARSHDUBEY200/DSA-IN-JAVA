public class _01_PRACTICE {

    static class Linkedlist {

        // CREATING THE PARTICULAR NODE 

        class Node {
            int data ;
            Node next;

            public Node(int data){
                this.data = data ;
                this.next = null;
            }
        }

        // TWO SPECIAL POINTERS 
        public static Node head;
        public static Node tail;
    }

    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();
        ll.head = ll.new Node(1);
        ll.head.next= ll.new Node(2);
        
    }
    
}
