import java.util.Comparator;
import java.util.PriorityQueue;

public class _01_PRIORITY_QUEUE {

    public static void main(String[] args) {
        
        PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<String> pqs = new PriorityQueue<>();
        pq.add(10);
        pq.add(1);
        pq.add(2);
        pq.add(15);

        pqs.add("Adarsh");
        pqs.add("bhanu");
        pqs.add("Jatin");
        pqs.add("Abdu");


        while(!pq.isEmpty()){
            System.out.println(pq.peek()+" ");
            pq.remove();
        }

        while(!pqs.isEmpty()){
            System.out.println(pqs.peek());
            pqs.remove();
        };
    }
    
}
