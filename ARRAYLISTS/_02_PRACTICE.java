import java.util.ArrayList;


// LEARNING OF THE MULTI DIMENSIONAL ARRAY LISTS 
public class _02_PRACTICE {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        mainList.add(list);
        mainList.add(list2);

        list.add(2);
        list.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(9);

        System.out.println(mainList);

        //for loop for accessing all the elememts of the multidimensional arraylists 

        for(int i =0; i<mainList.size();i++){
            for(int j=0;j<mainList.get(i).size();j++){
                System.out.print(mainList.get(i).get(j)+" ");
            }
            System.out.println();
        }
        
    }
}
