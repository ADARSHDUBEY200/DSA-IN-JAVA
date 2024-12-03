

public class _03_DIRECTION {

    public static void main(String[] args) {
        
        String Direction="WNEENESENNN";

        int x=0;
        int y=0;


        for(int i=0;i<=Direction.length()-1;i++){

            if(Direction.charAt(i)=='N'){
                y++;

            }else if(Direction.charAt(i)=='S'){
                y--;

            }else if (Direction.charAt(i)=='E') {
                x++;
                
            }else if (Direction.charAt(i)=='W') {
                x--;
                
            }

        }

        //FORMULA FOR FINDING MINIMUM DISTANCE BETWEEN THE TWO COORDINATES QUADRATION SYSTEM ROOT OF((X2-X1)^2 + (Y2-Y1)^2)

        int x1=0;
        int y1=0;
        int x2=x;
        int y2=y;



        int minDistance=(int)Math.sqrt(((int)(Math.pow((x2-x1), 2))+(int)(Math.pow((y2-y1), 2))));

        System.out.println("THE MINIMUM DISTANCE IS : "+minDistance);


    }
    
}
