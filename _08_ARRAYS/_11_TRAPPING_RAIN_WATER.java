public class _11_TRAPPING_RAIN_WATER {

    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};

        // AUXILIARY ARRAYS //
        int left_max[]=new int[7];
        int right_max[]=new int[7];

        // LEFT MAX BOUNDARY AUXILARY ARRAY //

         left_max[0]=arr[0];

         for(int i=1;i<=arr.length-1;i++){

            if(arr[i]<left_max[i-1]){
                left_max[i]=left_max[i-1];
            }else{
                left_max[i]=arr[i];
            }

         }

       // LETF AUXILIARY ARRAY PRINTING //

       System.out.println("YOUR LEFT AUXILARY ARRAY IS : ");
       System.out.print("[");
       
       for (int i=0;i<=arr.length-1;i++){

        System.out.print(left_max[i]+",");

       }

       System.out.println("]");
       
       
       //RIGHT BOUNDARY AUXILIARY ARRAY//

       right_max[arr.length-1]=arr[arr.length-1];
       
       for(int i=arr.length-2;i>=0;i--){

         if(arr[i]<right_max[i+1]){
            right_max[i]=right_max[i+1];
         }else{
            right_max[i]=arr[i];
         }
       }

       // PRINTING OF RIGHT AUXILARY ARRAY //
       
       System.out.println("YOUR RIGHT AUXILARY ARRAY IS : ");
       System.out.print("[");
       
       for (int i=0;i<=arr.length-1;i++){

        System.out.print(right_max[i]+",");

       }

       System.out.println("]");

       // WATER TRAPPED = (WATERLEVEL-BAR HEIGHT)*WIDTH
       // WATER LEVEL= (MINIMUM(MAXIMUM RIGHT BOUNDARY,MAXIMUM LEFT BOUNDARY));

       int total_water_trapped=0;
       int WIDTH=1;

       for(int i=0;i<=arr.length-1;i++){
          int  WATERLEVEL=Math.min(left_max[i],right_max[i]);
          int bar_height=arr[i];
          int water_trapped=(WATERLEVEL-bar_height)*WIDTH;
          total_water_trapped = total_water_trapped + water_trapped;
       }

       System.out.println("SO THE TOTAL WATER TRAPPED FOR THE GIVEN HEIGHT OF THR BUILDINGS IS : "+total_water_trapped);













    }

  

   
    
}
