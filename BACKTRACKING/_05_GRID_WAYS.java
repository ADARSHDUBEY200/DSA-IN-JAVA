public class _05_GRID_WAYS {

    public static int GridWays(int i , int j , int n , int m){
        // base case 

        if(i==n-1 && j ==m-1 ){
            return 1;
        }else if (i==n ||  j==m ) {

            return 0 ;

        }
        

        // work to done 
        int w1 = GridWays(i+1, j, n, m);
        int w2 = GridWays(i, j+1, n, m);

        return w1+w2;
        // believe in the inner function call 

    }

    public static void main(String[] args) {
        int n =3 , m=3 ;
        int value = GridWays(0,0,n,m);
        System.out.println("THE NO. OF THE WAYS IS : "+value);
    }
    
}
