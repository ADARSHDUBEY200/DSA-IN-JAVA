import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _01_ACTIVITY_SELECTION {

    public static void main(String[] args) {
        
        int start [] = {1,3,0,5,8,5};
        int end []  = {2,4,6,7,9,9};

        // IF MY ENDING TIME IS NOT SORTED ON THE BASIS OF THE ENDING TIME 
        int activities [] [] = new int[start.length][3];
        
        for(int i=0 ; i < start.length; i++){

            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];

        } 

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        
        ArrayList<Integer> ans = new ArrayList<>();

        int  maxAct = 1;

        ans.add(activities[0][0]);

         int lastEnd = activities[0][2];

         for(int i=1 ; i<end.length; i++){

            if(activities[i][1] >= lastEnd){
                maxAct++;

                ans.add(activities[i][0]);
                lastEnd= activities[i][2];

            }
        }

         System.out.println("THE ACTIVITES WE HAVE DONE IS : "+maxAct);

         for(int i=0 ; i<ans.size(); i++){

            System.out.print("A"+ans.get(i)+" ");
         }

    }
    
}
