
public class _03_PRACTICE {


    public static int Largest(int numbers []){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<=numbers.length-1;i++){

            if(numbers[i]>=max){
                max=numbers[i];
            }

            if(numbers[i]<=min){
                min=numbers[i];
            }

        }
        System.out.println("THE MINIMUM VALUE IS THE : "+min);
        return max;
    }

    public static void main(String[] args) {

        int numbers[]={2,3,5,6,7,8,12,14,15,10};

        int value=Largest(numbers);

        System.out.println("THE LARGEST VALUE IS IN THE ARRAY IS : "+value);
        
    }
    
}
