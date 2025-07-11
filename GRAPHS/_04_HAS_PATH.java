import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _04_HAS_PATH {

    static class Edge{
        int src ;
        int des ;
        int wht ;

        public Edge(int s , int d , int w ){
            this.src = s;
            this.des = d;
            this.wht = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph []){

        for(int i=0 ; i < graph.length; i++ ){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
       
    }

    public static void BFS(ArrayList<Edge> graph []){
        Queue<Integer> q = new LinkedList<>();
        boolean visited [] = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){

            int curr = q.remove();

            if(!visited[curr]){ // when current node is not visited 
                System.out.print(curr); // print the current node 
                visited[curr] = true; // visted true 

                for(int i=0 ; i< graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }

    public static boolean HASPATH(ArrayList<Edge> [] graph , int source , int destination, boolean visited[]){

        // IF MY SRC IS THE  DESTINATION 
        if(source == destination ){
            return true ;
        };

        visited[source] = true ;

        for(int i=0 ; i< graph[source].size(); i++){
            Edge e = graph[source].get(i);

            if(!visited[e.des] && HASPATH(graph, e.des, destination, visited)){
                return true ;
            }
        }

        return false ;
    }

    public static void main(String[] args) {
        int V = 7 ;
        ArrayList<Edge> [] graph = new ArrayList[V];
        boolean visited[] = new boolean[graph.length];
        CreateGraph(graph);
        // BFS(graph);
        boolean value = HASPATH(graph, 0, 7, visited);
        System.out.println(value);

        if (value) {

            System.out.println("THE PATH IS EXISTED NETWEEN THE SOURCE AND THE DESTINATION");
            
        }else{
            System.out.println("THE PATH IS NOT EXISTED BETWEEN THE SOURCE AND THE deastination");
        }
        
    }
    
}
