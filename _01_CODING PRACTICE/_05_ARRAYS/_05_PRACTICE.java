
public class _05_PRACTICE {

    public static void Reverse(int numbers[]){

        for(int i=0;i<=(numbers.length-1)/2;i++){
            int temp=numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;
        }
    }

    public static void main(String[] args) {
        int numbers[]={2,4,5,6,7,8,9};
        Reverse(numbers);

        for(int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+" ");

        }
    }
    
}
