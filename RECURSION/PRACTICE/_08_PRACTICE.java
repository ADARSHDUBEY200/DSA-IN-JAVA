
public class _08_PRACTICE {

    public static void PrintInc(int n ){

        if (n==1) {
            System.out.println(n);
            return;
            
        }

        PrintInc(n-1);
        System.out.println(n);



    }

    public static void main(String[] args) {
        PrintInc(10);
    }
    
}
