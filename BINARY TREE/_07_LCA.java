import java.util.ArrayList;

public class _07_LCA {

 
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


    public static boolean getpath(Node root , int n , ArrayList path){

        if(root == null ){
            return false;
        }

        path.add(root.data);

        if(root.data == n){
            return true ;
        }

        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);

        if(foundleft || foundright){
            return true ;
        }

        path.remove(path.size()-1);
        return false;
    }
    public static int LCA(Node root, int n1, int n2){
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();

        getpath(root , n1 , path1);
        getpath(root , n2 , path2);

        int i=0 ;
        for(; i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        return path1.get(i-1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        int n1 = 4 , n2 = 6; 
        System.out.println(LCA(root, n1 , n2 ));

    }

}
