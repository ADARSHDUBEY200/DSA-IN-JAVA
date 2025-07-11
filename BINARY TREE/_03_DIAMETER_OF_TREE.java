public class _03_DIAMETER_OF_TREE {

    static class Node{
        int data ;
        Node left ;
        Node right ;

        Node(int data ){
            this.data = data ;
            this.left = left ;
            this.right = right ;
        }
    }

    static class BinaryTree{

        static int idx = -1 ;

        public Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1 ){
                return  null ;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode ;
        }

        // HEIGHT OF THE TREE 
        public int Height(Node root){

            if(root == null ){
                return 0 ;
            }

            int lh = Height(root.left);
            int rh = Height(root.right);

            int total =Math.max(lh, rh)+1;

            return total;

        }

        public int Diameter(Node root){
            if(root == null ){
                return 0 ;
            }

            int lh = Height(root.left);
            int rh = Height(root.right);
            int selfDiameter = lh + rh + 1; 

            int leftDiameter = Diameter(root.left);
            int rightDiameter = Diameter(root.right);

            int subDiameter = Math.max(leftDiameter, rightDiameter);
            int Diameter = Math.max(selfDiameter, subDiameter);

            return Diameter;
        }

        public static boolean isIdentical(Node root , Node subtree){
                if(root == null && subtree == null ){
                    return true ;
                }else if(root == null || subtree == null || root.data != subtree.data){
                   
                    return false ;
                }

                if(!isIdentical(root.left, subtree.left)){
                  
                    return false;
                }

                if(!isIdentical(root.right, subtree.right)){
                  
                    return false ;
                }

                return true ;
        }

        public static boolean SubTree(Node root , Node subtree){
            if(root == null){
                System.out.println("THIS IS RUNNING 1 ");
                return false ;
              
            }

            if(root.data == subtree.data ){

                if(isIdentical(root , subtree)){
                    return true ;
                }
            }

            boolean leftAns = SubTree(root.left, subtree);
            boolean rightAns = SubTree(root.right, subtree);

            return leftAns || rightAns;
        }


    }

    public static void main(String[] args) {

        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        int nodes1 [] = {2,4,-1,-1,5,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        BinaryTree.idx = -1 ;
        Node subtree = tree.BuildTree(nodes1);
        System.out.println("THE ROOT  DATA OF THE TREE IS : "+root.data );
        System.out.println("THE LEFT PART DATA OF THE TREE : "+root.left.data);
        System.out.println("THE RIGHT PART DATA OF THE SUBTREE IS : "+root.left.left.data);
        System.out.println("THE LEFT PART DATA OF THE "+root.left.right.data);
        boolean value = tree.SubTree(root, subtree);
        System.out.println("THE SUBTREE IS EXISTED OR NOT : "+value);
       
        
    }
    
}
