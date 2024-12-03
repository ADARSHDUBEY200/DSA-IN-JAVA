
public class _01_PRACTICE {
    public static void Change (int numbers [],int nonchangeable ){
        nonchangeable=10;
        for(int i=0;i<=numbers.length-1;i++){
            numbers[i]=numbers[i]+1;

        }
    }

    public static void main(String args []){
        int marks []=new int[5];
        int numbers []={1,2,3,4,5,6};
        String fruits []={"mango","apple","orange"};
        int nonchangble=5;

        Change(numbers, nonchangble);

        for(int i=0;i<=numbers.length-1;i++){
            System.out.println(numbers[i]);
        }

        System.out.println("the value of the nonchangeable is : "+nonchangble);


    }
    
}
