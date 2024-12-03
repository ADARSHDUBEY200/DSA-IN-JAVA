
public class _10_PRACTICE {

    public static int Sum(int n ){

        if (n==1) {
            return 1;
            
        }

        int value =Sum(n-1);

        int sum =n+value;
        return sum ;
    }

    public static int Sum2(int n,int N ){
        if (n==N) {
            return n;
            
        }

        int value =Sum2(n+1,N);

        int sum = n+value;
        return sum; 
    }


    public static void main(String[] args) {
        int n=1;
        
        int value =Sum(5);
        int value2=Sum2(n,5);
        System.out.println(value );
        System.out.println("Sum2 : "+value2);
    }
    
}
