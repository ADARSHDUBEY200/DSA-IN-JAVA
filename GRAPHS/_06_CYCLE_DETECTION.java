import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _06_CYCLE_DETECTION {

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
        // graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));

        // graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));

        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 3, 1));

    }

    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (detectCycleUtil(graph, visited, i , -1 )) {
                    return true;
                }
            }
        }

        return false ;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean visited[], int curr, int par) {

        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // CASE 1: IF NEIGHBOUR IS VISITED BUT NOT A PARENT ---> CYCLE DETECTED
            // CASE 2 : IF NEIGHBOUR IS VISITED AND PARENT ALSO -----> CONTINUE
            if (visited[e.des] && e.des != par) {

                return true;

            } else if (!visited[e.des]) {

                if (detectCycleUtil(graph, visited, e.des, curr)) {

                    return true;

                };
            }
            // CASE 3 : IF NEIGHBOUR IS NOT VISITED THEN VISIT IT

        }

        return false ;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        CreateGraph(graph);
        boolean value = detectCycle(graph);
        System.out.println("THE CYCLE IS DETECTED OR NOT IS : "+value);

    }

}
