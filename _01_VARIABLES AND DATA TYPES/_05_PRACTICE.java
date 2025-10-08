import java.util.Scanner;

public class _05_PRACTICE {
    public static void main(String[] args) {

        // for teh type conversion we need to have the type compatibility.
        int a = 2;
        long b = a;

        System.out.print(b); // implicit type conversion done by the java itself. widening conversion so
                             // that's why it is called the type coneversion

        long c = 3;
        int d = (int) c;// explicirt type conevrsion and the concept of the narrowing.
        System.out.print(d);

        int x = 97;
        char ch = (char) x;
        System.out.print(ch);

        char ch1 = 'a';
        int a1 = ch1;
        System.out.print(a1);// implicit type conversion

        // boolean bool = true;
        // int ne = bool;

        // Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();
        // sc.nextLine();
        // String name = sc.nextLine(); // may skip input

        // System.out.println(age);
        // System.out.print(name);

        // System.out.println("my name is adarsh dubey : "+ args[0]);
        // System.out.println("my age is "+ args[1]);

        // char ch3 = 'a' - 'b';

        // System.out.println(ch3);


    }
}
