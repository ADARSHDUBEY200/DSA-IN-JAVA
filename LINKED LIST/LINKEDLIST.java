
public class LINKEDLIST {

    class Node { // THIS IS BLUEPRINT OF THE INDIVIDUAL NODE OF THE LINKEDLIST
        int data; // THIS IS THE DATA STORED INSIDE THE NODE OF THE LINKEDLIST
        Node next; // THE REFERENCE POINTER THAT STORED THE ADDRESS OR REFER THE NEXT NODE INSIDE
                   // THE LINKED LIST

        public Node(int data) { // THIS CONSTRUCTOE IS USED FOR CREATING THE INVIDUAL NODES INTIALLY
            this.data = data;
            this.next = null;
        }
    }

    // IN EVERY LINKEDLIST THERE ARE TWO MAIN NODE IN THE LINKEDLIST ONE IS HEAD
    // NODE AND OTHER ONE IS THE TAIL NODE BEACUSE BY USING THE HEAD AND THE TAIL
    // NODE WE CAN TRAVERSE THE WHOLE LINKEDLIST NODE ONE BY ONE AND ACEESS THEM.

    public static Node head; // BY THIS REFERNCE POINTER WE REFER THE HEAD NODE OF THE LINKED LIST
    public static Node tail; // BY THIS REFERNCE POINTER WE REFER THE TAIL NODE OF THE LINKED LIST
    public static int size; // THIS VARIABLE IS USED FOR CALCULATING THE SIZE OF THE LINKELISTS

    // METHODS OF THE LINKED LIST

    public void addFirst(int data) { // THIS METHOS IS USED FOR VREATING THE NODE WHICH IS AT THE FIRST

        // STEP -1 : CREATE THE NEW NODE
        Node newNode = new Node(data);
        size++;

        if (head == null) { // THIS STEP IS FOR THE INITIAL AND THE FIRST NODE WE WANT TO CREATE
            head = tail = newNode;
            return;
        }

        // STEP -2 : LINK THE NEWNODE.NEXT TO HEAD
        newNode.next = head;

        // STEP -3 : NEWNODE = HEAD
        head = newNode;

    }

    public void addLast(int data) {
        // step -1 : CREATE A NEW NODE
        Node newNode = new Node(data);
        size++;
        if (tail == null) {

            head = tail = newNode;
            return;

        }

        // STEP -2 : TAIL.NEXT = NEWNODE
        tail.next = newNode;
        // STEP -3 : NEWNODE = TAIL
        tail = newNode;
    }

    public void addMiddle(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        size++;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // i----> index-1
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("THE LINKELIST IS EMPTY");
            return -1;
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        Node prev = head;
        if (head == null) {
            System.out.println("THE LINKEDLST IS EMPTY : ");
            return -1;
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        while (prev.next != tail) {
            prev = prev.next;
            System.out.println("chala");
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int Serach(int key) {
        Node temp = head;
        int i = 0;

        while (temp.next != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int RecursiveSearch(Node temp, int key, int index) {

        // base case

        if (temp == null) {
            return -1;
        }

        // work
        if (temp.data == key) {

            return index;

        }

        index++;
        // belive in the inner function
        int value = RecursiveSearch(temp.next, key, index);
        return value;
    }

    // Another way of doing the recursice serach

    public int helper(Node head, int key) {

        // base case
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return idx;
        }
        return idx + 1;

    }

    public int recSearch(int key) {
        int index = helper(head, key);
        return index;
    }

    public void ReverseLinkedList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public int NthNodeRemove(int index1) {

        int i = 0;
        int index = size - index1;
        Node temp = head;
        Node prev = null;

        while (i != index) {
            prev = temp;
            temp = temp.next;

            i++;

        }
        ;

        if (temp == null) {
            System.out.println("THERE IS NO REMOVAL HAPPEN IN THE LINKED LISTS ");
        }

        if (temp == head) {
            head = temp.next;
            int value = temp.data;
            temp.next = null;
            return value;
        }

        // MAIN WORK
        int value = temp.data;
        prev.next = temp.next;
        temp.next = null;

        return value;

    }

    // FINDING THE PALINDROME IN THE LINKEDLIST
    // WE NEED TO FOLLOW THE 3 STEPS

    // STEP 1 : FIND THE MIDDLE NODE IN THE LINKEDLISTS
    // STEP 2 : REVERSE THE HALF OF THE LINKEDLISTS FROM THE MIDDLE NODE BY SLOW AND
    // FAST METHOD
    // STEP 3 : COMAPRE THE 1ST HALF AND THE 2ND HALF IN THE LINKEDLISTS

    public Node findMid(Node head) {// THIS METHOD IS CALLED SLOW AND THE FAST METHOD

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;

    }

    // FUNCTION FOR FINDING THE PALINDROME

    public boolean checkPalindrome() {

        // if there is only one node
        if (head == null || head.next == null) {
            return true;
        }

        // finding the mid node

        Node midNode = findMid(head);

        // Reverese the linked lists from the middle node

        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Comapre the left and the right half of the linkedlist

        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;

    }

    // DETECTING THE CYCLE IN THE LINKEDLISTS BY USING THE FLOYD'S CYCLE FINDING
    // ALGORITHM

    // 1. IF WE HAVE THE LINKEDLIST AND IF IT IS LINEAR THEN IF WE USE THE SLOW AND
    // THE FAST METHOD THEN SLOW AND FAST CAN NEVER EQUAL AFTER STARTING THE LOOP .

    // 2. IF THERE IS EXISTS A LOOP INSIDE THE LINKED LISTS AT SOME POINT THE SLOW
    // AND THE FAST ARE GOING TO BE EQAUL TO EACH OTHER

    // 3. ACCORDING TO THE FLOYD'S AFTER THE FIRST JUMP THE DISTANCE BETWEEN THE
    // SLOW AND THE FAST IS 1 AND THEN AFTER THE SECOND JUMP THE DISTANCE IS BECOME
    // 2 AND INCREASED BY 1 AFTER THE EVERY JUMP AND IF THERE IS CYCLE THEN WE CAN
    // SAY THE AFTER SOME TIME THE DISTANCE BETWEEN THE SLOW AND FAST IS BECOME ZERO
    // FROM ONE AND EQUAL TO THE LENGTH OF THE CYCLE EXISTS IN THE LINKEDLIST FROM
    // OTHER SIDE.

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // FOR REMOVING THE CYCLE IN THE LINKEDLIST
    // 1 . FIND THE LAST NODE OF THE CYCLE FROM WHERE THEY ARE MAKING CYCLE
    // 2 . lastnode.next == null

    // FOR FINDING THE LAST NODE WHERE OUR LINKEDLIST IS CONNECTED WE NEED TO FOLLOW
    // SOME STEPS

    // 1. USE SLOW AND FAST METHOD WE NEED TO MOVE OUR SLOW AND THE FAST AND WHEN
    // THEY ARE GOING TO MEET AT THE SOME POINT .

    // 2. AFTER MEETING AT THE SOME POINT WE NEED TO RE INTIALIZE OUR SLOW TO HAED
    // AND THEN MOVE SLOW BY ONE AND HEAD BY ONE BY MATEMATICALLY THEY BOTH MEET AT
    // THE POINT WHERE THE LINKEDLIST IS INTERSECT EACH OTHER OR WE CAN SAY THE
    // POINT WHERE LINKEDLIST MAKE THE CYCLE

    public static void removeCycle() {

        Node slow = head;
        Node fast = head;
        boolean exists = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                exists = true;
                break;

            }
        }

        if (!exists) {
            return;
        }

        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }

        prev.next = null;
    }

    // NOW WE WANT TO WRITE THE CODE PF THE MERGE SORT IN THE LINKEDLIST

    private Node getMid(Node head ) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node head1, Node head2) {

        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;

            } else if (head1.data > head2.data) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        // for remaining left part of the linkedlist

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;

    }

    public Node mergeSort(Node head) {

        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // WE NEED TO FIND OUT THE MID NODE
        Node midNode = getMid(head);
        Node righthead = midNode.next;
        midNode.next = null;

        // CALL THE MERGESORT FUNCTION FOR LEFT AND THE RIGHT PART OF THE LINKEDLIST
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);

        // WE NEED TO CALL THE MERGE TO REJOIN THE PARTS OF THE LINKEDLIST IN SORTED
        // MANNER

        return merge(newLeft, newRight);
    }

    // NOW WE WANT TO CONVERT THE lINKED LIST INTO THE ZIG ZAG FORMAT 

    public void  ZigZag(){

        // Find the Mid Node by using the slow and fast method 

        Node slow = head ;
        Node fast = head.next ;

        while( fast != null && fast.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;

        }
        System.out.println("my khatam");

        Node midNode = slow ;

        // REVERESE 2nd half of the THE LINKED LIST 
        Node curr = midNode.next;
        midNode.next = null ;
        Node prev = null ;
        Node next ;

        while(curr != null ){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr= next ;

        }


        // THEN WE NEED TO MERGE THE LINKEDLIST ALTERNATIVELY 
        Node right = prev ;
        Node left = head ;
        Node nextL , nextR;

        while(right != null && left != null ){
            nextL = left.next ;
            nextR = right.next ;
            left.next = right ;
            right.next = nextL ;

            //update 
            left = nextL ;
            right = nextR ;

        }


    }

    public void print() {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println(temp);
    }

    public static void main(String[] args) {

        LINKEDLIST ll = new LINKEDLIST();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();
        ll.ZigZag();
        ll.print();
        // head = ll.new Node(1);
        // head.next = ll.new Node(2);
        // head.next.next = ll.new Node(3);
        // head.next.next.next = head ;
        // System.out.println("THIS CYCLE IS PRESENT OR NOT IS : "+isCycle());
        // removeCycle();
        // System.out.println("THE CYCLE IS EXIST OR NOT : "+isCycle());
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addMiddle(5, 0);
        // ll.print();
        // ll.addFirst(9);
        // ll.print();
        // int value = ll.NthNodeRemove(2);
        // System.out.println("THE NTH VALUE WHIH IS REMOVED FROM THE LINKED LISTS :
        // "+value);
        // ll.print();
        // ll.ReverseLinkedList();
        // ll.print();
        // int value = ll.removeFirst();
        // System.out.println("THE REMOVED VALUE IS : "+value);
        // ll.print();
        // int value = ll.removeLast();
        // System.out.println("THE REMOVED VALUE IS : " + value);
        // ll.print();
        // System.out.println(head);
        // System.out.println(tail);
        // int index = ll.Serach(3);
        // int index2 = ll.RecursiveSearch(head, 3, 0);
        // int index3 = ll.recSearch(3);
        // if (index == -1) {
        // System.out.println("THE KEY IS NOT FOUND ");

        // } else {

        // System.out.println("THE KEY IS FOUND AT THE INDEX : " + index);

        // }

        // if (index2 == -1) {

        // System.out.println("THE KEY IS NOT FOUND ");

        // } else {

        // System.out.println("THE KEY IS FOUND AT THE INDEX : " + index2);

        // }

        // if (index3 == -1) {

        // System.out.println("THE KEY IS NOT FOUND : ");

        // } else {

        // System.out.println("THE KEY IS FOUND AT THE INDEX : " + index3);

        // }
        // System.out.println("THE SIZE OF THE LINKEDLIST IS : " + ll.size);

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(1);

        // boolean value = ll.checkPalindrome();
        // System.out.println("THE LINKEDLIST IS : PALIDROME : "+value);

    }

}
