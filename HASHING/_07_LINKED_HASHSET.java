import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _07_LINKED_HASHSET {

    public static void main(String[] args) {
        
        LinkedHashSet <Integer> hs = new LinkedHashSet<>();
        hs.add(2);
        hs.add(1);
        hs.add(4);
        hs.add(5);
        hs.add(6);

        System.out.println(hs);

        System.out.println("USING THE TREE HASHSET");

        TreeSet <Integer> set = new TreeSet<>();
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.println(set);
    }
    
}
