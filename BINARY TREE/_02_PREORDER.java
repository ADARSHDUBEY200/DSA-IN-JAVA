import java.util.*;

public class _02_PREORDER {

    static class Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
            this.left = left ;
            this.right = right ;

        }
    }

    static class BinaryTree{
        static int idx = -1 ;
        public Node BuildTree(int nodes []){
            idx ++;

            if(nodes[idx] == -1){
                return null ;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right= BuildTree(nodes);

            return newNode ;

        }
        
        // PREORDER TRAVERSAL FUNCTION FOR PRINTING THE THE TREE 

        public void PredOrder(Node root){

            if(root == null){
                return ;
            }
             
            System.out.print(root.data + " "); // FIRST WE NEED TP PRINT THE ROOT 
            PredOrder(root.left);// THEN WE NEED TO PRINT THE LEFT PONTER 
            PredOrder(root.right);// THEN WE PRINT THE RIGHT OF THE TREE 

        }
    
      // THIS IS THE FUNCTION OF THE INORDER TRAVERSAL OF THE TREE
        public void InOrder(Node root){

          if(root == null ){
            return ;
          }
            
            InOrder(root.left);// FIRST WE PRINT THE LEFT NODE OF THE TREE 
            System.out.print(root.data+" ");// FIRST WE NEED TO PRINT THE ROOT NODE OF THE TREE 
            InOrder(root.right);// THEN WE NEED TO PRINT THE RIGHT OF  THE TREE 
        }

        // THIS IS THE FUNCTION FOR THE POSTORDER TRAVERSAL 

        public static void PostOrder(Node root){

            if(root == null ){
                return; 
            }

            PostOrder(root.left);// first we print left node of the tree 
            PostOrder(root.right);// then we print the right node of the tree 
            System.out.print(root.data + " ");
        }

        // THIS FUNCTION IS FOR THE LEVEL ORDER TRAVERSAL
        public static void LevelOrder(Node root){
            if(root == null ){
                return ;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();

                if(currNode == null ){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(currNode);
                    }
                }else{
                    System.out.print(currNode.data+" ");

                    if(currNode.left != null ){
                        q.add(currNode.left);
                    }

                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }


        // Calculating the height of the tree 

        public int HeightTree(Node root){

            if(root == null ){
                return 0; 
            }


            int lh = HeightTree(root.left);
            int rh = HeightTree(root.right);

            int total = Math.max(lh, rh)+1;

            return total;
        }

        public int CountNodes(Node root){
            if(root == null ){
                return 0;
            }

            int lh = CountNodes(root.left );
            int rh = CountNodes(root.right);

            int total = lh + rh +1 ;
            
            return total;
           
        }

        public int SumOfNodes(Node root){

            if(root == null ){
                return 0;
            }

            int lv = SumOfNodes(root.left);
            int rv = SumOfNodes(root.right);

            int total = root.data + lv + rv ;
            return total ;
        }

    }

    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        tree.PredOrder(root);
        System.out.println();
        System.out.println("THE INORDER TRAVERSAL IS : ");
        tree.InOrder(root);
        System.out.println();
        System.out.println("THE POSTORDER TRAVERSAL IS : ");
        tree.PostOrder(root);
        System.out.println();
        System.out.println("THE LEVEL ORDER TRAVERSAL OF THE TREE IS : ");
        tree.LevelOrder(root);
        System.out.println();
        System.out.println("THE HEIGHT OF THE TREE IS : ");
        int value = tree.HeightTree(root.right);
        System.out.println(value);
        System.out.println("THE COUNT OF THE TOTAL NODES IS : ");
        int Nodes = tree.CountNodes(root.right.right);
        System.out.println(Nodes);
        System.out.println("THE SUM OF THE NODES IN THE TREE IS : ");
        int Sum = tree.SumOfNodes(root.right );
        System.out.println(Sum);


    }
    
}
