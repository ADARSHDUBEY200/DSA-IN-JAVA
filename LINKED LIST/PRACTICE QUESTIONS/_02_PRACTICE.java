
public class _02_PRACTICE {

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        // ll.addFirst(10);
        // ll.print();
        // ll.addFirst(9);
        // ll.print();
        // ll.addFirst(8);
        // ll.print();
        // ll.addFirst(7);
        // ll.print();
        // ll.addFirst(6);
        // ll.print();
        // ll.addFirst(5);
        // ll.print();
        // ll.addFirst(4);
        // ll.print();
        // ll.addFirst(3);
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        ll.print();
        ll.size();
        // ll.question1(3, 3);
        // ll.print();
        // ll.question2(2, 4);
        // ll.print();
    }

}

class Linkedlist {

    class Node {
        int data;
        Node next;
    }

    public Node head;
    public Node tail;

    // METHODS

    public void addFirst(int data) {

        Node newNode = new Node();

        if (head == null) {
            newNode.data = data;
            head = tail = newNode;
            return;
        }
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void question1(int M, int N) {
        Node prev = null;
        Node temp = head;

        int M1 = 0;
        while (M1 <= M) {
            if (temp == null) {
                break;
            }
            if (M1 == M) {
                int N1 = 1;
                while (N1 <= N) {
                    if (prev.next.next == null) {
                        prev.next = null;
                        print();
                        break;
                    }
                    prev.next = temp.next;
                    temp = temp.next;
                    N1++;
                    print();
                }
                print();
                M1 = 0;
                continue;

            }
            print();
            prev = temp;
            temp = temp.next;
            M1++;

        }
    }

    public void question2(int x, int y) {
        Node prevx = null;
        Node tempx = head;
        Node prevy = null;
        Node tempy = head;
        int x1 = 1;
        int y1 = 1;
        while (x1 < x) {

            prevx = tempx;
            tempx = tempx.next;
            x1++;

        }

        while (y1 < y) {
            prevy = tempy;
            tempy = tempy.next;
            y1++;
        }

        prevx.next = tempy ;
        prevy.next = tempx ;
        tempx.next = tempy.next ;
        tempy.next = prevy ;
       
    }

    public void size (){
        Node temp = head ;
        int size =0 ;
        while(temp != null ){
            size++;
            temp = temp.next ;
        }
        System.out.println("THE SIZE OF THE LINKEDLIST IS : "+size);
    }

    public void print() {
        if (head == null) {
            System.out.println("THE LINKEDLIST IS EMPTY : ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
