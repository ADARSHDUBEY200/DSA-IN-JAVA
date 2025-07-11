import java.util.ArrayList;

public class _01_CREATING_GRAPH {

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

    public static void main(String[] args) {
        // int [] arr = new int[5];

        // WE CREATE A ADJENCENCY LIST FOR THE GRAPH 
        int V = 5 ;
        ArrayList<Edge> [] graph = new ArrayList [V]; // --> the arraylist is empty because of null 

        for(int i = 0 ; i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        // 0 VERTEX 
        graph[0].add(new Edge(0, 1, 5));

        // 1 VERTEX 
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 VERTEX 
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 VERTEX 
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 VERTEX 
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbour 

        for(int i =0 ; i< graph[2].size() ; i++){
            System.out.println(graph[2].get(i).des);
        }

        
    }

    
}