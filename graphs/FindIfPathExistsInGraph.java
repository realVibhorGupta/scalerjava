package graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[][] graph = new boolean[n][n];
        //nothing is connected initially
        for (boolean[] row : graph) {
            Arrays.fill(row, false);
        }
        // traversal
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            // the graph Is Bidirectional ::: Ask the Interviewer
            graph[v][u] = true;
            graph[u][v] = true;
        }

        //if Queue for BFS else skip
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(source);


        boolean[] isVisited = new boolean[n];

//        return bfs(n, destination, isVisited, queue, graph);


    }

//    private static boolean bfs(int n, int destination, boolean[] isVisited, Queue<Integer> queue, boolean[][] graph) {
//        for (int index = 0; index < n; index++) {
//            isVisited[index] = false;
//        }
//        while (!queue.isEmpty()) {
//            int current = queue.remove();
//            if (current == destination) {
//                return true;
//
//            }
//
//            for (int index = 0; index < n; index++) {
//                if (graph[current][index] && !isVisited[index]) {
//                    queue.add(index);
//                    isVisited[index] = true;
//                }
//            }
//        }
//        return false;
//    }
}
//        return dfs(graph, source, destination, isVisited, n);
//    }
//source can be written current
//    private boolean dfs(boolean[][] graph, int source, int destination, boolean[] isVisited, int n) {
//        if (source == destination) return true;
//        isVisited[source] = true;
//        for (int index = 0; index < n; index++) {
//            if (graph[source][index] && !isVisited[index]) {
//                if (dfs(graph, index, destination, isVisited, n)) return true;
//            }
//        }
//        return false;
//    }


//}
