

public class _5_INHERITANCE {

    public static class Parent {
        void bol () {
            System.out.println("I AM THE SUPER AND THE UPPER CLASS :");
        }

    }

    public static class child1 extends Parent {
        void childbol(){
            System.out.println("I AM THE CHILD1 CLASS : ");
        }
    }

    public static class child2 extends child1{
        void child2bol(){
            System.out.println("I AM THE CHILD2 CLASS : ");
        }
    }


    public static void main(String[] args) {

        child2 ch2 = new child2();

        ch2.child2bol();
        ch2.childbol();
        ch2.bol();

        
    }
}
