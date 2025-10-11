public class _4_CONSTRUCTORS {

    public static class Demo {
        String name ;
        int number;
        Demo(){ // noraml constructor
            System.out.println("MY NAME IS ADARSH DUBEY : ");
        }

        // Parametrized constructors
        Demo(String name , int number ){
            System.out.println("NOW PARAMETRIZED IS CALLED  : ");
            this.name = name;
            this.number = number;

        };

        //Copy constructors
        Demo(Demo d ){
            System.out.println("NOW THIS IS COPY CONSTRUCTOR CALLED : ");
            this.name = d.name;
            this.number = d.number;

        }
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo d1 = new Demo("adarsh", 200);
        Demo d2 = new Demo(d1);

        System.out.println(d1.name + " " + d1.number);
        System.out.println(d2.name + " " + d2.number);
    }
}
