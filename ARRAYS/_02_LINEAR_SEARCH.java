import java.util.Scanner;

public class _02_LINEAR_SEARCH {

    public static int LINEAR_SEARCH(int arr[],int n){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        

        int numbers []={10,20,44,35,46,70,90};

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF KEY YOU WANT TO FIND IN YOUR ARRAY");
        int key= sc.nextInt();

        int Found=LINEAR_SEARCH(numbers,key);
        if(Found==-1){
            System.out.println("THE VALUE YOU ENTERD IS NOT FOUND IN YOUR ARRAY");
        }else{
            System.out.println("THE GIVEN VALUE IS AT THE INDEX "+Found);
        }
    }
    
}
