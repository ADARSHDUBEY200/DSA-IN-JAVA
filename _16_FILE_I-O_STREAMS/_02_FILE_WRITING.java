import java.io.FileWriter;
import java.util.Scanner;

public class _02_FILE_WRITING {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("example.txt",true);
            System.out.println("ENTER YOUR TEXT THAT YOU WANT : ");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            file.write(data);

            file.close();
        } catch (Exception e) {
            System.out.println("THERE IS AN EXCEPTION ION THE PROGRANM : " + e);
        }
    }
}
