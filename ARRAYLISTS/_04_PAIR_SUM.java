import java.util.ArrayList;

public class _04_PAIR_SUM {


    // THE 2 POINTER APPROACH FOR FINDING THE TARGET ELEMENT FROM THE PAIR OF THE ARRAYLIST

    public static boolean PAIRSUM2(ArrayList<Integer> list ,int target ){

        int LeftPointer =0 ;
        int RightPointer = list.size()-1;

        while(LeftPointer <= RightPointer){

            if (list.get(LeftPointer)+list.get(RightPointer)==5) {

                return true ;
                
            }else if(list.get(LeftPointer)+list.get(RightPointer)>target){

                RightPointer--;

            }else if ( list.get(LeftPointer)+list.get(RightPointer)< target){
                LeftPointer++;
            }

        }

        return false ;
    }

    // THE BRUTE FORCE APPROACH FOR THE FINDING THE TARGET ELEMENT FROM THE PAIR OF THE ARRAYLIST 

    public static boolean PAIRSUM1 (ArrayList<Integer> list , int target){

        for(int i=0; i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if (list.get(i)+list.get(j)==target) {

                 return true ;
                    
                }
            }
        }

        return false ;

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target= 5 ; 
       
        // THIS IS THE BRUTE FORCE APPROACH FUNCTION 
        boolean value = PAIRSUM1(list,target);

        System.out.println("THE VALUE IS EXISTED OR NOT IT IS GIVEN THAT by using the BRUTE FORCE APPROACH  : "+value );
        
        // THIS IS THE 2 POINTER APPROACH FUNCTION 
        boolean value2 = PAIRSUM2(list,target);

        System.out.println("THE VALUE IS EXISTED OR NOT IT IS GIVEN THAT BY USING THE 2 POINTER APPROACH  : "+value2 );




        
    }
    
}
