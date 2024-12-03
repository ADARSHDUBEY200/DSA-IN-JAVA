import java.util.Scanner;

public class _03_QUESTION_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PRICE OF THE PEN");
        float pen= sc.nextFloat();
        System.out.println("ENTER THE PRICE OF THE PENCIL");
        float pencil=sc.nextFloat();
        System.out.println("ENTER THE PRICE OF THE ERASER");
        float eraser=sc.nextFloat();

        float gst=(18f/100)*(pen+pencil+eraser);
        System.out.println(gst);

        float Total=gst+(pencil+pen+eraser);
        System.out.println("SP THE TOTAL BILL IS : "+Total);

        
    }
    
}
