import java.io.BufferedReader;
import java.io.FileReader;

public class _03_FILE_READING {
    public static void main(String[] args) {
        try {
            // BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            // String line;

            FileReader file = new FileReader("example.txt");

            System.out.println(file.read());
            

            // while((line = br.readLine()) != null){
            //     System.out.println(line);
            // }
        } catch (Exception e) {
           System.out.println("THE EXCEPTION OCCURS IS : "+ e);
        }
    }
}
