import java.util.LinkedList;
public class _JCF_LINKEDLIST {

    public static void main(String[] args) {
        
        // create 

        LinkedList<Integer> ll = new LinkedList<>();

        // add 
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(5);
        System.out.println(ll);

         // remove 
         ll.removeFirst();
         ll.removeLast();
         System.out.println(ll);
    }
    
}
