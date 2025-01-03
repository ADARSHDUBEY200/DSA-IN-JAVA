import java.util.Arrays;

public class _03_SINGLE_ELEMENT {

    // THIS IS THE BRUTE FORCE APPROACH FOR SOLVING THE SINGLE ELEMENT OF THE ARRAY WHICH NOT REPEATE TWICE IN THE ARRAY , SO THE TIME COMPLEXITY OF THIS ALGORITHM IS 0(N^2)
    public static int SingleElementBruteForce(int nums []){
        for ( int i=0 ;i<nums.length;i++){

            int count =0 ;
            for(int j=0; j<nums.length; j++){

                if (nums[i]==nums[j]){
                    count ++;
                }
            }

            if (count !=2 ) {

                return nums[i];
                
            }
        }

        return -1 ;
    }

    // THIS METHOD IS TAKE THE TIME COMPLEXITY OF THE O(NLOGN)
    public static int SingleElement(int nums []){

        Arrays.sort(nums);

        int ans=0;

        for(int i =0; i<nums.length;i++){
            if ( nums.length==1 ){
                ans = nums[i];
            }
            else if ((i==0) && (nums[i]!=nums[i+1])){
                ans = nums[i];
                
            }else if ((i==0) && (nums[i] == nums[i+1])){
                continue;
            }
            else if((i==nums.length-1) && (nums[i] != nums[i-1])) {
                ans = nums[i];

            }else if ((i==nums.length-1) && (nums[i] == nums[i-1])){

                break ;

            }else if ( (nums [i] != nums[i-1]) && (nums[i] != nums[i+1]) ){

                  ans = nums [i];

            }

        }

        return ans ;

    }

    public static void main(String[] args) {

        int nums[] = { 2, 2, 1 };

        int value = SingleElement(nums);
        int value1 = SingleElementBruteForce(nums);

        System.out.println("THE SINGLE ELEMEMT IS BY USING SORTING METHOD : "+value );
        System.out.println("THE SINGLE IS BY USING THE BRUTE FORCE APPROACH : " +value1);
    }

}
