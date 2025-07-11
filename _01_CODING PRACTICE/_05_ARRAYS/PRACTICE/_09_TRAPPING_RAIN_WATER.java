public class _09_TRAPPING_RAIN_WATER {

    public static int TrappingRainWater(int arr []){

        // AUIXILARY ARRAY FOR LEFT BOUNDARY 
        int leftBoundary [] = new int[arr.length];
        for(int i = 0 ; i< arr.length ; i++){
            if(i==0){
                leftBoundary[i]= arr[i];
            }else{
                if(leftBoundary[i-1] < arr[i]){
                    leftBoundary[i]=arr[i];
                }else{
                    leftBoundary[i]= leftBoundary[i-1];
                }
            }

            System.out.print(leftBoundary[i]+" ");
        }
        System.out.println();

        // Auxiliary array for the right boundary 
        int rightBoundary [] = new int[arr.length];

        for(int i = arr.length-1; i>=0;i--){
            if(i==arr.length-1){

                rightBoundary[i]= arr[i];

            }else{
                if(rightBoundary[i+1] < arr[i]){
                    rightBoundary[i] =arr[i];
                }else{
                    rightBoundary[i]= rightBoundary[i+1];
                }
            }
            System.out.print(rightBoundary[i]+" ");
        }
        System.out.println();

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int volume =0 ;
        System.out.println();

        for(int i=0; i<arr.length; i++){
            int waterlevel = Math.min(leftBoundary[i], rightBoundary[i]);
            System.out.print(waterlevel+ " ");
            // System.out.print(arr[i]+" ");
            int waterHeight = waterlevel - arr[i];
            System.out.print(waterHeight+" ");
            int waterStored = waterHeight*1;
            System.out.print(waterStored+" ");

            volume = volume+ waterStored;
            System.out.println("THE VOLUME IS : "+volume );
            System.out.println();

        }
        System.out.println();

        return volume ;
    }

    public static void main(String[] args) {
        
        int arr [] = {4,2,0,6,3,2,5};
        int volume = TrappingRainWater(arr);
        System.out.println("THE TOTAL VOLUME STORED IN THE BUILDINGS IS : "+volume);

        
    }
    
}
