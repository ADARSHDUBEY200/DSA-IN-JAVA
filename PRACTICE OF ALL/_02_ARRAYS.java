import java.util.*;


public class _02_ARRAYS {

//-------------------------------------------------LINEAR SEARCH FUNCTION -----------------------------
    public static int  LINEARSEARCH(int arr[],int key){

        for(int i=0;i<=arr.length-1;i++){

            if(arr[i]==key){
                return i;
            }
        }

        return -1;
    }

//---------------------------------------------LARGEST IN ARRAY FUNCTION -------------------------------

         public static void LARGESTNUMBER(int arr[]){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;

            for(int i=0;i<=arr.length-1;i++){

                if(max<=arr[i]){
                    max=arr[i];
                }
                if(min>=arr[i]){
                    min=arr[i];
                }

            }

            System.out.println("SO THE LARGEST VALUE IN YOUR ARRAY IS : "+max);
            System.out.println("SO THE SMALLEST VALUE IN YOUR ARRAY IS : "+min);
         }

//-----------------------------------------------BINARY SEARCH FUNCTION --------------------------------

      public static void BINARYSEARCH(int arr[],int key){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key){
                System.out.println("YOUR KEY IS FOND AT INDEX : "+mid);
                break;
            }
            if(arr[mid]>key){
                high=mid-1;
            }
            if(arr[mid]<key){
                low=mid+1;
            }

        }
      }

//----------------------------------------------- REVERSE THE ARRAY FUNCTION ---------------------------


      public static void REVERSEARRAY(int arr[]){

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int temp =arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low=low+1;
            high=high-1;
        }


        System.out.println("YOUR GIVEN ARRAY AFTER THE RVERSE IS : ");
        System.out.print("[");

        for(int i=0;i<=arr.length-1;i++){
           
            
            System.out.print(arr[i]+" ");
        }

        System.out.println("]");


    
      }
// -------------------------------------------- PAIRS OF ARRAY FUNCTION --------------------------------

      public static void PAIRSARRAY(int arr[]){
        int sum=0;
        System.out.println("PAIRS OF THE ELEMENT OF YOUR ARRAY IS : ");
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                sum+=1;
            }
            System.out.println();
        }
        System.out.println("SO THE TOTAL NUMBER OF PAIRS OF THE ELEMENTS OF YOUR ARRAY IS : "+sum);
      }
      
// ------------------------------------------- SUBARRAYS OF THE ARRAY ----------------------------------

          public static void SUBARRAY(int arr[]){
            int sum=0;
            int totalSum=0;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;


            System.out.println("SO THE SUBARRAYS OF YOUR GIVEN ARRAY IS : ");
            for(int i=0;i<=arr.length-1;i++){
                for(int j=i;j<=arr.length-1;j++){
                    System.out.print("[");

                    for(int k=i; k<=j;k++){
                        System.out.print(arr[k]+" ");
                        totalSum=totalSum+arr[k];
                    }
                    if(max<totalSum){
                        max=totalSum;
                    }
                    if(min>totalSum){
                        min=totalSum;
                    }
                    System.out.println("] SUM OF THIS SUBARRAY IS : "+totalSum);
                    sum+=1;
                    totalSum=0;
                  
                }
            }
            System.out.println("SO THE TOTAL NUMBER OF SUBARRAYS IS : "+ sum);
            System.out.println("SO THE GRATEST SUM OF THE SUBARRAY IS : "+max);
            System.out.println("SO THE MINIMUM SUM OF THE SUBARRAYS IS : "+min);
          }

      


//-------------------------------------MAX SUBARRAY SUM THROUGH THE PREFIX SUM -------------------------
       public static void PREFIX_SUM_ARRAY(int arr[],int prefix[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
          for(int i=0;i<=arr.length-1;i++){
            for(int j=i;j<=arr.length-1;j++){
                if(i==0){
                    sum=prefix[j];
                }else{
                    sum= prefix[j]-prefix[i-1];

                }
             

                if(max<sum){ 
                    max=sum;
                }

                if(min>sum){
                    min=sum;
                }

                sum=0;
            }
            
          }

          System.out.println("SO THE GREATES SUM IN THE ARRAY IS : "+max);
          System.out.println("SO THE SMALLEST SUM IN THE ARRAYS IS : "+min);
       }









    public static void main(String[] args) {





//============================================ LINEAR SEARCH ========================================   
        
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("ENTER THE KEY YOU WANT TO SEARCH IN THE ARRAY");
    //     int key= sc.nextInt();
    //     int arr[]={1,4,5,6,7};

    //     int index=LINEARSEARCH(arr,key); // LINEAR SEARCH FUNCTION CALLING 
    //     if(index==-1){
    //         System.out.println("YOUR KEY IS NOT FOUND IN OUR ARRAY");

    //     }else{
    //     System.out.println("SO YOUR KEY IS AT THE INDEX : ");
    //     System.out.println(index);
    //     }
   

//============================================= LARGEST IN AN ARRAY ====================================

        //    int arr[]={2,4,6,8,10,12,14,16};
        //    LARGESTNUMBER(arr);





//============================================= BINARY SEARCH ==========================================

    //    int arr[]={2,4,6,8,10,12,14,16,18,20};
    //    Scanner sc= new Scanner(System.in);
    //    System.out.println("ENTER THE KEY YOU WANT TO SEARCH IN OUR ARRAY");
    //    int key = sc.nextInt();

    //    BINARYSEARCH(arr,key);



//============================================= REVERSE OF THE ARRAY ===================================


    //  int arr[]=new int[5];
    //  Scanner sc = new Scanner(System.in);

    //  for(int i=0 ;i<=arr.length-1;i++){
    //     System.out.println("ENTER THE VALUE OF "+i+" th INDEX OF YOUR ARRAY");
    //     arr[i]=sc.nextInt();
    //  }
    //  System.out.println("YOUR ENTERD ARRAY IS : ");
    //  System.out.print("[");

    //  for(int i=0;i<=arr.length-1;i++){
       
    //     System.out.print(arr[i]+" ");

    //  }
    //  System.out.println("]");

    //  REVERSEARRAY(arr);


//================================================ PAIRS OF THE ARRAY ==================================


        //   int arr[]=new int[5];
        //   Scanner sc = new Scanner(System.in);

        //   for(int i=0 ;i<=arr.length-1;i++){
        //      System.out.println("ENTER THE VALUE OF "+i+" th INDEX OF YOUR ARRAY");
        //      arr[i]=sc.nextInt();
        //   }
        //   System.out.println("YOUR ENTERD ARRAY IS : ");
        //   System.out.print("[");

        //   for(int i=0;i<=arr.length-1;i++){
  
        //      System.out.print(arr[i]+" ");
          
        //   }
        //   System.out.println("]");

        //   PAIRSARRAY(arr);

// ======================================= SUBARARY OF THE GIVEN ARRAYS ================================


        //   int arr[]=new int[5];
        //   Scanner sc = new Scanner(System.in);

        //   for(int i=0 ;i<=arr.length-1;i++){
        //      System.out.println("ENTER THE VALUE OF "+i+" th INDEX OF YOUR ARRAY");
        //      arr[i]=sc.nextInt();
        //   }
        //   System.out.println("YOUR ENTERD ARRAY IS : ");
        //   System.out.print("[");

        //   for(int i=0;i<=arr.length-1;i++){

        //          System.out.print(arr[i]+" ");

        //   }
        //   System.out.println("]");

        //   SUBARRAY(arr);

//============================================ SUM OF SUBARRAYS BY USING THE PREFIX ARRAY===============

         int arr[]={1,-2,6,-1,3};
         int prefix[]=new int[5];

         prefix[0]=arr[0];

         for(int i=1; i<=arr.length-1; i++){

            prefix[i]=prefix[i-1]+arr[i];

         };

         PREFIX_SUM_ARRAY(arr,prefix);









} 
}
