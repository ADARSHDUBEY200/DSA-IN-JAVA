import java.util.ArrayList;

public class _03_CONTAINER_WITH_MOST_WATER {

    // THE 2 POINTER APPROACH FOR FINDING THE MAXIMUM WATER STORED INSIDE THE CONTAINER 
    public static int storeWater1 (ArrayList<Integer> height ){
        int maxWater=0;
        int LeftPointer = 0;
        int RightPointer = height.size()-1;

        while ( LeftPointer < RightPointer){
            int ht = Math.min(height.get(LeftPointer), height.get(RightPointer));
            int width = RightPointer-LeftPointer;
            int currWater= ht*width;
            maxWater= Math.max(maxWater, currWater);

            if (height.get(LeftPointer)< height.get(RightPointer)) {
                LeftPointer++;
                
            }else{
                RightPointer--;
            }
        }

        return maxWater;
    }


    // THIS IS THE BRUTE FORCE APPROACH FOR THE MAXIMUM WATER STORED IN THE CONTAINER 
    public static int storeWater(ArrayList<Integer> height ){

        int maxWater=0;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;

                int currWater = ht*width ;
                maxWater = Math.max(maxWater, currWater);

            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // THIS STATEMENT IS FOR THE BRUTE FORCE APPROACH OF THE STOREDWATER INSIDE THE CONTAINER 
        System.out.println("THE MAXIMUM WATER STORED IN THE CONTAINERS IS BY USING THE BRUTE FORCE APPROACH  : "+storeWater(height));
        System.out.println("THE MAXIMUM WATER STORED IN THE CONTAINERS IS BY USING THE 2 POINTER APPROACH : "+storeWater1(height));

    }
    
}
