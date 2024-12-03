import java.util.*;


public class _03_PRACTICE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PRICE OF YOUR PENCIL");
        float pencil=sc.nextFloat();
        System.out.println("ENTER THE PRICE OF YOUR PEN");
        float pen =sc.nextFloat();
        System.out.println("ENTER THE PRICE OF YOUR ERASER");
        float eraser=sc.nextFloat();

        float gst = 0.18f;
        float totalPrice=pencil+pen+eraser;

        float total= (pencil+pen+eraser)*gst;

        System.out.println("SO YOUR TOTAL BILL IS : ");
        System.out.println(total+totalPrice);
        
    }
    
}
