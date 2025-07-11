import java.util.ArrayList;

public class _11_ALL_PATHS_FROM_SOURCE_TO_DESTINATION {

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

        graph[0].add(new Edge(0, 3, 1));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

    }

    public static void PrintAllPaths(ArrayList<Edge> graph [] , int src , int des ,String path ){
        if(src == des ){
            System.out.println(path+src);
            return;
        }

       for(int i=0 ; i<graph[src].size(); i++){
        Edge e = graph[src].get(i);
        PrintAllPaths(graph, e.des, des, path+src);
       }

    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        PrintAllPaths(graph, 5, 1, "");
    }
    
}
