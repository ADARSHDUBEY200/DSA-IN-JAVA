

public class _03_SUM {

    public static int Sum(int n ){
        if(n==0){
            return 0;
        }
        int sum =n+Sum(n-1);
        return sum;
    }

    public static void main(String[] args) {

        int Total=Sum(5);
        System.out.println("SUM OF THE 5 NATURAL NUMBERS IS : "+Total);
        

    }
    
}
