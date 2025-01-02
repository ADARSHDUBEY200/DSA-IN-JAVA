import java.util.Arrays;

public class _02_MERGED_SORTED_ARRAY {

    public static void MergeSortedArray(int nums1[] , int m ,int nums2[] , int n){

        // AS WE KNOW THAT NUMS1 IS AN INCRESING ORDERE SORTED ARRAY SO WE DO NOT NEED TO ITERATE THIS 


        // BASICALLY THIS IS THE TWO POINTERS APPROACH TO SOLVE THE MERGING OF TWO SORTED ARRAYS  
        // IT TAKES TIME  COMPLEXITY OF THE O(N+M);
        // IT ALSO TAKES THE SPACE COMPLEXITY OF THE O(1); 
        int idx = m+n-1;
        int i = m-1;
        int j = n-1;

        while ( i >= 0 && j >= 0){

            if ( nums1[i]==nums2[j]){

                nums1[idx]= nums1[i];
                i--;
                idx--;

            }else if (nums1 [i]< nums2[j]){

                nums1[idx]= nums2[j];
                j--;
                idx--;

            }else{

                nums1[idx]=nums1[i];
                i--;
                idx--;

            }
        }

        while (j>=0 ){

            nums1 [idx] = nums2[j];
            j--;
            idx--;
        }

        // PRINT THE MERGED ARRAY 

        for(int k=0;k<m+n;k++){
            System.out.print(nums1[k]);
        }

    }

    public static void main(String[] args) {
      
        // THIS IS THE INFORMATION OF THE ARRAYS NUMS1 and NUMS2 
        int [] nums1 = {4,0,0,0,0,0};
        int [] nums2 = {1,2,3,4,5,6};

        // THIS IS THE NUMBER OF ELEMEMTS OF THE ARRAY NUMS1 ACCORDING TO THE QUESTION 
        int m =1 ;

        // THIS IS THE NUMBER OF THE ELEMEMETS OF THE ARRAY NUM2 ACCORDING TO THE QUESTION 
        int n = 5;

        MergeSortedArray(nums1, m, nums2, n);

    }
    
}
