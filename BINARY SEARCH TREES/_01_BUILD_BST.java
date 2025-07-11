import java.util.ArrayList;

public class _01_BUILD_BST {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node Insert(Node root, int value) {

        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = Insert(root.left, value);
        } else {
            root.right = Insert(root.right, value);
        }

        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static boolean Serach(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return Serach(root.left, key);
        } else {
            return Serach(root.right, key);
        }
    }

    public static void printInRange(Node root, int k1, int k2) {

        if(root == null){
            return ;
        }

        if (root.data >= k1 && root.data <= k2) {

            printInRange(root.left, k1, k2);
            System.out.println(root.data + " ");
            printInRange(root.right, k1, k2);

        } else if (root.data < k1) {

            printInRange(root.right, k1, k2);

        } else if (root.data > k2) {

            printInRange(root.left, k1, k2);

        }
    }

    public static void print(ArrayList<Integer> path ){
       

        for(int i=0 ; i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void printPath(Node root , ArrayList<Integer> path){

        if(root == null){
            return ;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            print(path);
        }

        printPath(root.left, path);
        printPath(root.right, path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3 , 1, 4 , 6 , 10 , 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }

        Inorder(root);
        System.out.println();

        // boolean value = Serach(root, 7);

        // if (value) {

        //     System.out.println("THE KEY IS FOUND : ");

        // } else {

        //     System.out.println("THE KEY IS NOT FOUND : ");

        // }

        // System.out.println("THE VALUES IN RANGE IS : ");

        // printInRange(root, 5, 12);

        System.out.println("THE PATH FORM THE NODES ARE : ");
        printPath(root, new ArrayList<>());

    }

}
