
public class _07_PRACTICE {

    public static void Subarray(int numbers[]){

        int sum =0;
        int max =Integer.MIN_VALUE;
       
        for(int i=0;i<=numbers.length-1;i++){
            for(int j=i;j<=numbers.length-1;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }
                System.out.println("]"+" "+sum);

                if (sum>max) {
                    max=sum;
                    
                }

                sum=0;

            }


        }
        System.out.println("THE MAXIMUM SUBARRAY SUM IS : "+max);
    }
    public static void main(String[] args) {
        
        int numbers []={1,-2,6,-1,3};
        Subarray(numbers);
    }
    
}
