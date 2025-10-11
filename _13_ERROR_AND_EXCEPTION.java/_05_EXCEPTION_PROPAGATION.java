public class _05_EXCEPTION_PROPAGATION {
    public static void method1 (){
        int  a = 10;
        int  b = 0;

        int c = a/b ;
    };

    public static void method2 (){
        method1();
    }

    public static void method3 (){
        try {
            method2();
        } catch (Exception e) {
            System.out.println("THERE IS AN ERROR OCCURS : "+ e);
        }
    }

    public static void main(String[] args) {
        method3();
        System.out.println("MY NAME IS ADARSH DUBEY : ");
    }
}
