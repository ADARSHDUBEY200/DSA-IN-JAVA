;

public class _7_METHOD_OVERRIDING {
    public static class A {
        void say (){
            System.out.println("my name is adarsh dubey : ");
        }
    }

    public static class B extends A{
        @Override
        void say (){
            System.out.println("my name is B : ");
        }
    }
    public static void main(String[] args) {
        B b1 = new B();
        b1.say();
    }
}
