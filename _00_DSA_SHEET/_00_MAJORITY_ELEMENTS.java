import java.lang.reflect.Array;
import java.util.Arrays;

public class _00_MAJORITY_ELEMENTS {

    // THIS IS OPTIMIZATION IN THE BRUTE FORCE APPROACH AND BY USING THE SORTING OF AN ARRAY 

    public static int majorityElementsSorting(int nums []){

        Arrays.sort(nums);// THIS SORTING TAKES THE O(NLOGN) TIME COMPLEXITY 
        int n = nums.length;
        int ans = nums[0];
        int  count =1;
        for(int i=1;i<nums.length;i++){
           
            if (nums[i]==nums[i-1]) {

                count ++;

            }else{

                count =1;
                ans=nums[i];
                System.out.println("checked");

            }

            System.out.println("checked");

            if (count > n/2) {

                return ans ;

            }
        }

        return -1 ;



    }

   
// THIS IS THE BRUTE FORCE APPROCH TO SOLVE THE MAJORITY ELEMNETS QUESTION BUT THIS GIVES THE TIME COMPLEXITY OF THE O(N^2)
    public static int  majorityElements(int nums []){

        int n= nums.length;

        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){

                if ( nums[i]==nums[j]){
                    count++;
                }

            }

             // AS WE KNOE THAT IF A ELEMENT IS REPEAT MORE THAN THE n/2 TIMES THEN THAT ELEMENT IS CALLED THE MAJORITY ELEMENT 

            if (count > n/2) {

                return nums[i];
                
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int nums []= {1};
       int value = majorityElements(nums);
       int value2 = majorityElementsSorting(nums);
       System.out.println("THE MAJORITY ELEMENT IS BY USING THE BRUTE FORCE APPROACH : "+value);
       System.out.println("THE MAJORITY ELEMENTS IS BY USING THE SORTING OPTIMIZATION IN THE BRUTE FORCE APPROACH : "+value2 );
    }
    
}
