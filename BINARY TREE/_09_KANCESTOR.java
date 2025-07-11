public class _09_KANCESTOR {

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

    
    public static Integer KANCESTOR(Node root , int n , int k){

        if(root == null){
            return -1 ;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = KANCESTOR(root.left , n, k);
        int rightDist = KANCESTOR(root.right , n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        // JAB MIL JAYE 
        int max = Math.max(leftDist, rightDist);

        if(max+1 == k){
            System.out.println(root.data);
        }

        return max+1;



    }





    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        KANCESTOR(root, 5, 1);
        
    }
    
}
