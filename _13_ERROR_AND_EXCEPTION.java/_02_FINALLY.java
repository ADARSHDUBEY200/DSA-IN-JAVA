public class _02_FINALLY {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // try {
        //     int c = a/b;
        // } catch (Exception e) {
        //     System.out.println("THE ERROR IS COMING :");
        // }finally{
        //     System.out.println("MY NAME IS ADARSH DUBEY : ");
        // }

        try{
            int c = a/b;
            System.out.println(c);
        }finally{
            System.out.println("THIS IS THE FINALLY BLOCK AND GOING TO BE RUN EVERY TIME :");
        }
    }

    
    
}
