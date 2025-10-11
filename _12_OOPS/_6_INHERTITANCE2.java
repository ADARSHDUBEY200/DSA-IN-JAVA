

public class _6_INHERTITANCE2 {

    public static class A {

        String name = "adarsh";
        A(String number){
            System.out.println("I AM THE A CLASS : ");
        }
        
    }

    public static class B  extends A{
       
        B(){
            super("2");
            System.out.println("I AM THE B CLASS : ");
        }

    }

    public static class C extends B{
        C(){
            System.out.println(super.name);
            System.out.println("I AM THE C CLASS : ");
           

        }
    }
    public static void main(String[] args) {
        C b1 = new C ();
        
    }
}
