
public class _01_PRACTICE {
    public static void main(String[] args) {

        Printing p1 = new Printing();
        p1.DecreasingOrder(8);
        System.out.println();
        System.out.println("after the using of the recursion ");
        Recursion r1 = new Recursion();
        r1.recurrdec(10);
        System.out.println("The number printing after using increasing recursion");
        r1.recurrinc(1);

    }

}

class Printing {
    void DecreasingOrder(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
        }

    }

}

class Recursion {
    void recurrdec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n);
        recurrdec(n - 1);
    }

    void recurrinc(int n) {
        if (n == 10) {
            System.out.print(n);
            return;

        }
        System.out.print(n);
        recurrinc(n + 1);
    }
}
