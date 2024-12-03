

public class _01_QUESTION {

    public static void main(String[] args) {
        int count =0;
        
        int [][] arr={
            {4,7,8},
            {8,8,7},
            {5,5,7}
           
        };

        //BRUTE FORCE //

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("THE TOTAL NUMBERS OF THE 7'S IN THE 2-D ARRAY IS : "+count);
    }
    
}
