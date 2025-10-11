import java.util.*;

public class _08_PRACTICE {

    public static int ShortestPath(String str ){

        int x=0;
        int y=0;

        for(int i=0;i<=str.length()-1;i++){

            if (str.charAt(i)=='N') {

                y++;
            }else if (str.charAt(i)=='S'){
                y--;
            }else if (str.charAt(i)=='E'){
                x++;
            }else{
                x--;
            }

        }

        int value =(int)Math.sqrt(((x*x)+(y*y)));
        return value;

    }
    

    public static void main(String[] args) {

        String str= "WNEENESENNN";
        
        int value = ShortestPath(str);
        System.out.println("THE SHORTEST PATH IS : "+value );
    }
    
}
