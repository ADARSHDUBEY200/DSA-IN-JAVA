public class _10_TRANSFORM_A_SUM_TREE {

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


    public static int TransformAsumTree(Node root){

        if(root == null){
            return 0;
        }

       int leftSubtreeSum = TransformAsumTree(root.left);
       int rightSubtreeSum = TransformAsumTree(root.right);

       int data = root.data ;
       int newLeft = root.left == null ? 0 : root.left.data;
       int newright = root.right == null ? 0 : root.right.data;


       root.data = newLeft+ leftSubtreeSum + newright + rightSubtreeSum;
        
        return data;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int value = TransformAsumTree(root);
        System.out.println(root.data);

        
    }
    
}
