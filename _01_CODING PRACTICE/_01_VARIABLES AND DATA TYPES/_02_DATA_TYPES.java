

public class _02_DATA_TYPES {

    public static void main(String[] args) {
        byte a=97;
        short b=53;//both contain numbers but differnt in memory stored for that variable 
        int c=100;
        long d=200;

// float e=10.3;  //this line give an error because as default java consider decimal numbers as double so if we store it in a float data type then it gives an error for avoid this we use following syntax.

        float e=10.3f;//now it behave as a flost data type 
        System.out.println(e);
    }
    
}
