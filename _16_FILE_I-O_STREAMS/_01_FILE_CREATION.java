import java.io.File;
// import java.io.IOException;

public class _01_FILE_CREATION {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            if(file.createNewFile()){
            
            System.out.println("THIS FILE IS NOW GOING TO BE CREATED : "+ file.getName());
        }else{
            System.out.println("THE FILE IS ALREADY EXISTED : ");
            System.out.println(file.delete());
        }
        } catch (Exception e) {
            System.out.println("THIS IS THE EXCEPTION : " + e );
        }
    }
}
