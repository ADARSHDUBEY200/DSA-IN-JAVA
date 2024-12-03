
public class _06_PRACTICE {

    public static void Pairs(int numbers []){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<=numbers.length-1;j++){

                System.out.print("("+numbers[i]+","+numbers[j]+")"+" ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers []={2,4,6,8,10};
        Pairs(numbers);
    }
    
}
