import java.util.ArrayList;

public class _08_CYCLE_DETECTION_DIRECTED {

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

        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 0, 1));

    }

    public static boolean isCycle(ArrayList<Edge> graph []){
        boolean vis [] = new boolean[graph.length];
        boolean stack [] = new boolean[graph.length];

        for(int i=0 ; i< graph.length; i++){

            if(!vis[i]){

                if(isCycleUtil(graph , i , vis , stack)){

                    return true ;

                }

            }
        }

        return false ;

    }

    public static boolean isCycleUtil(ArrayList<Edge> graph [] , int curr , boolean vis[] , boolean stack []){

        vis[curr] = true;
        stack[curr] = true ;

        for(int i=0 ; i<graph[curr].size(); i++){

            Edge e = graph[curr].get(i);
            if(stack[e.des]){ // cycle existed 
                return  true;
            }

            if(!vis[e.des] && isCycleUtil(graph, e.des, vis, stack)){
                return true ;
            }

        }
        stack[curr] = false ;
        return false ;

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        CreateGraph(graph);
        boolean value = isCycle(graph);
        System.out.println("THE CYCLE IS PRESNT IN THE GRAPH OR NOT : "+value);
    }
    
}
