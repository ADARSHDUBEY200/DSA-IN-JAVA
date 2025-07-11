
import java.util.HashSet;

public class _09_UNION_INTERSECTION {

    public static void main(String[] args) {
        
        int arr1 []= {6,3,9,2,9,4};
        int arr2 []= {7, 3, 9};
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0 ; i<arr1.length ; i++){
            set.add(arr1[i]);
        }

        for(int i=0 ; i< arr2.length ; i++){
            set.add(arr2[i]);
        }

        System.out.println("THE UNIONS IS : "+set.size());

        // INTERSECTION 

        set.clear();

        for(int i=0 ; i<arr1.length; i++){
            set.add(arr1[i]);
        }


        int count =0 ;
        for(int i=0 ; i< arr2.length; i++){

            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }

        System.out.println("THE INTERSECTIONS ELEMENT IS : "+count );
    }
    
}
