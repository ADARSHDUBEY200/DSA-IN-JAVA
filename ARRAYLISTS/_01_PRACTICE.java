import java.util.ArrayList;
import java.util.Collections;

public class _01_PRACTICE {

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        // add method in the arraylists
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(16);
        // list.set(6, 4);
        list.add(1, 9);// time complexity of the O(n)

        // remove method in the arraylists
        // list.remove(1);

        // GET ELEMEMNT IN THE ARRAYLISTS
        // System.out.println(list.get(0));
        // System.out.println(list);

        // //CONTAINS ELEMEMT IN THE ARRAYLISTS
        // System.out.println(list.contains(2));

        // SIZE IS A METHOD IN THE ARRAYLISTS

        // System.out.println(list.size());

        // ITERATION ON THE ARRAYLISTS
        // for(int i =0;i<list.size();i++){
        // System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // PRINT THE REVERSE OF THE ARRAYLISTS
        // System.out.println("REVERESE OF THE ARARYLISTS ");
        // // for(int i=list.size()-1;i>=0;i--){
        // // System.out.print(list.get(i)+" ");
        // // }

        // int max = Integer.MIN_VALUE;

        // for(int i=0;i<list.size();i++){
        // if (max<list.get(i)) {
        // max=list.get(i);

        // };
        // }
        // System.out.println("THE GREATEST VALUE INSIDE THE ARRAYLISTS IS THE : "+max);

        // BASICALLY I WANT TO SWAP TO NUMBERS OF THE ARRAYLISTS USING THE FUNCTIONS

        // int index1 = 1;
        // int index2 = 3;
        // System.out.println(list);
        // swap(list, index1, index2);
        System.out.println(list);
        Collections.sort(list);//ascending order

        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());//descending order 
        System.out.println(list);





















    }

    

}
