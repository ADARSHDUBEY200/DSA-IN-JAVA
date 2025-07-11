import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _07_BIPARTITE_GRAPH {

     static class Edge {
        int src;
        int des;
        int wht;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wht = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        // graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 2, 1));
        // graph[4].add(new Edge(4, 3, 1));

    }

    public static boolean isBipartite(ArrayList<Edge> graph []){

        int col [] = new int[graph.length];

        for(int i =0 ; i<col.length;i++){
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i =0 ; i<graph.length; i++){
          
            //CASE 1 : IF NODE IS NOT COLOURED 
            if(col[i] == -1 ){
                q.add(i);
                col[i] = 0;

                while (!q.isEmpty()) {

                    int curr = q.remove();
                    for(int j=0 ; j< graph[curr].size(); j++){
                       Edge e = graph[curr].get(j);
                       if(col[e.des]== -1 ){
                        int nextCol = col[curr] == 0 ? 1 : 0;
                        col[e.des] = nextCol;
                        q.add(e.des);
                       }else if(col[e.des] == col[curr]){
                        return false ; // NOT BIPARTITE 
                       }

                    }
                    
                }

            }

            //CASE 2 : IF NODE IS COLOURED THEN GIVE DIFFERNT COLOR TO THE NEIGHBOURS OF THIS NODE

            //CASE 3 : IF NEIGHBOUR HAVE THE DIFFERENT COLOUR THEN COTINUE 
        }

        return true ;
    }

    // public static boolean isBipartiteUtil(ArrayList<Edge> graph [], int curr ){

    // }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        CreateGraph(graph);
        boolean value = isBipartite(graph);
        System.out.println("THE GRAPH IS BIPARATITE OR NOT IS : "+value);
    }
    
}
