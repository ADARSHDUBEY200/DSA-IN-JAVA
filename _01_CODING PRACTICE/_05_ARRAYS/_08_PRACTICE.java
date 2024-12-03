
public class _08_PRACTICE {

    public static void Prefix(int prefix []){

        int max =Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<=prefix.length-1;i++){
            for(int j=i;j<prefix.length;j++){
                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if (max<sum) {
                    max=sum;
                    
                }
                sum=0;
            }
           
        }
        System.out.println("the maximum sum of the subarray is : "+max);

    }

    public static void main(String[] args) {
        
        int numbers []={1,-2,6,-1,3};
        int prefix[]=new int[numbers.length]; 

        prefix[0]=numbers[0];

        for(int i=1;i<=numbers.length-1;i++){

            prefix[i]=prefix[i-1]+numbers[i];

        }
        Prefix(prefix);
    }
    
}
