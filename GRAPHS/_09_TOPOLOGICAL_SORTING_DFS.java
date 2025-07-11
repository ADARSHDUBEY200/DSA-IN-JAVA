import java.util.ArrayList;
import java.util.Stack;

public class _09_TOPOLOGICAL_SORTING_DFS {

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

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1)); 
        graph[5].add(new Edge(5, 2, 1));

    }

    public static void TopologicalSort(ArrayList<Edge> graph []){
      Stack<Integer> s = new Stack<>();
      boolean vis[] = new boolean[graph.length];

      for(int i=0 ; i<graph.length;i++){
        if(!vis[i]){
            TopologicalSortUtil(graph,i,s,vis );
        }
      }

      while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
      }
    }

    public static void TopologicalSortUtil(ArrayList<Edge> graph [], int curr , Stack s, boolean vis []){

        vis[curr] = true ;

        for(int i=0 ; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.des]){
                TopologicalSortUtil(graph, e.des, s, vis);
            }
        }

        s.push(curr);


    }

    public static void main(String[] args) {

        int V =6 ;
        ArrayList<Edge> graph [] = new ArrayList[V];
        CreateGraph(graph);
        TopologicalSort(graph);
        
    }
    
}
