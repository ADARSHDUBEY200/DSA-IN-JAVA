

public class _01_PRACTICE_QUESTION {
    public static void main(String[] args) {

       int arr[]={1,2,3,1};
        boolean isRepeat=false;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                System.out.println("run");
                if(i==j){
                    isRepeat=false;

                }else if (arr[i]==arr[j]){
                    isRepeat=true;
                    break;
                    
                }
            }
        }

        System.out.println(isRepeat);

        




    }
    
}
