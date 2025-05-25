import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//영역 구하기 문제
public class Main {
    static int[][] map;
    static boolean[][] visited;

    static int M, N, K;
    static ArrayList<Integer> areaList = new ArrayList<>(); //정렬할 영역의 넓이 리스트
    static int[] dx = {0, 0, -1, 1}; // 상하좌우
    static int[] dy = {-1, 1, 0, 0};
    static int areaSize;

    //직사각형 좌표 받아서 map에 색칠 (1로 표시)
    //전체 map을 돌면서 방문 안 했고 0인 칸에서 DFS 시작
    //DFS 돌 때마다 넓이(areaSize)를 계산해 저장
    //넓이들을 오름차순 정렬 후 출력

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();

        map = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            //사각형 영역 색칠하기 (1 : 색칠된 영역)
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = 1;
                }
            }
        }

            for (int y = 0; y < M; y++) {
                for (int x = 0; x < N; x++) {
                    if (!visited[y][x] && map[y][x] == 0) {
                        //방문하지 않았고, 색칠되지 않았다면
                        areaSize = 0;
                        dfs(y, x);
                        areaList.add(areaSize);
                    }
                }
            }
            Collections.sort(areaList);
            System.out.println(areaList.size());
            for (int area : areaList) {
                System.out.print(area + " ");
            }
        }
    public static void dfs(int y, int x) {
        visited[y][x] = true;
        areaSize++;
        for (int i = 0; i < 4; i++) { //상하좌우
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny >= 0 && nx >= 0 && ny < M && nx < N) {
                if (!visited[ny][nx] && map[ny][nx] == 0) {
                    dfs(ny, nx);
                }
            }
        }
    }
}
