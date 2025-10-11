import java.io.IOException;

public class _03_THROW_AND_THROWS {

    public static int sum (int a, int b) throws ArithmeticException {
        int ar = a;
        int br = b;

        // throw new IOException("my name is adarsh"); compiler forces to handle it.

        try {
            throw new ArithmeticException("THIS IS AN ERROR");
        } catch (Exception e) {
            System.out.println("exception is : "+ e);
        }

        return 1; 
    };

    public static void main(String[] args) {
        sum(10, 5);
    }
}
