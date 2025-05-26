import java.util.*;
public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int vertexNum; //정점 개수
    static int edgeNum; //간선 개수
    static int startVertex; //시작정점

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vertexNum = sc.nextInt();
        edgeNum = sc.nextInt();
        startVertex = sc.nextInt();

        graph = new ArrayList[vertexNum + 1];
        for (int i = 1; i <= vertexNum; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edgeNum; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(u, v);
        }
        for (int i = 1; i <= vertexNum; i++) {
            Collections.sort(graph[i]); // 정점 번호가 작은 것부터 방문하기 위해 정렬
        }

        visited = new boolean[vertexNum + 1];
        dfs(startVertex);
        System.out.println();
        visited = new boolean[vertexNum + 1];
        bfs(startVertex);
    }
    public static void addEdge(int u, int v) {
        graph[u].add(v);
        graph[v].add(u); // 양방향 추가
    }
    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int next : graph[node]) {
            if (!visited[next]){
                dfs(next);
            }
        }
    }
    public static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll(); //큐에서 꺼낸다
            System.out.print(current + " ");

            for (int next : graph[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}
