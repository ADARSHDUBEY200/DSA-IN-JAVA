import java.util.Scanner;

public class _07_PLUS {
    public static void plus(int n){
        
           
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++){
                    if(i==3){
                        System.out.print(" "+j);
                    }else if(j==3){
                        System.out.print(" "+i);
                    }else{
                        System.out.print("  ");
                    }
                }
    
                    System.out.println();
    
            }
            
        
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO ENTER ");
        int n= sc.nextInt();


    //     if(n%2==0){
    //         plus(n);
    //     }else{
    //     System.out.println("kindly enter the even number only ");
    //     int n1=sc.nextInt();
    //     while(n1%2!=0){
    //         System.out.println("ENTER THE EVEN NUMBER PLEASE again");
    //         n1=sc.nextInt();
    //     }

    //     plus(n1);
        
    // }
        
            

        for(int i=1;i<=n;i++){
            if(i==(n+1)/2){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }

            }else{
                for(int j=0;j<=n;j++){

                    if(j==n/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
           System.out.println();
        }
        
       
   
}
    
}
