import java.util.HashSet;
import java.util.Iterator;

public class _06_ITERATION_ON_SET {

    public static void main(String[] args) {
        
        HashSet <String> set = new HashSet<>();
        set.add("delhi");
        set.add("mumbai");
        set.add("goa");
        set.add("jaipur");


        Iterator it = set.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }

        System.out.println("AFTER USING THE ADVANCED FOR LOOP");

        for(String city : set){

            System.out.println(city);
        }
    }
    
}
