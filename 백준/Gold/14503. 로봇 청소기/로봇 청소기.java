import java.util.*;
public class Main {
    static int n, m;
    static int[][] room; //전역정적배열로 선언
    static int r, c, d;
    // 북, 동, 남, 서
    static int[] dx = {-1, 0, 1, 0}; //북이면 행감소, 남이면 행증가
    static int[] dy = {0, 1, 0, -1}; //동이면 열증가, 서면 열감소

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt(); //방크기 설정
        r = sc.nextInt(); //현재 행
        c = sc.nextInt(); //현재 열
        d = sc.nextInt(); //방향

        room = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                room[i][j] = sc.nextInt(); //방 생성

        int count = 0;

        while (true) {
            // 1. 현재 칸 청소
            if (room[r][c] == 0) {
                room[r][c] = 2; // 청소했다는 2 표시
                count++;
            }
            // 2. 주변 4칸 확인 (반시계 방향으로 회전하면서 탐색)
            boolean moved = false; // 이동할 수 없는 상태였다가
            for (int i = 0; i < 4; i++) { // 4칸을 확인해야 하니까~
                d = (d + 3) % 4; // 방향 전환 해주고
                int nx = r + dx[d];
                int ny = c + dy[d];
                // 2-1. 청소되지 않은 칸이 있다면 이동
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && room[nx][ny] == 0) {
                    r = nx;
                    c = ny;
                    moved = true; // 이동했으니 true로 바꿔줌
                    break;
                }
            }
            // 3. 이동하지 못하는 경우
            if (!moved) {
                int back = (d + 2) % 4; // 반대 방향으로
                int bx = r + dx[back];
                int by = c + dy[back];
                // 3-1. 뒷칸이 벽이 아니라면 후진
                if (bx >= 0 && by >= 0 && bx < n && by < m && room[bx][by] != 1) {
                    r = bx;
                    c = by;
                } else {
                    break; //벽이면 작동 종료
                }
            }
        }

        System.out.println(count);
    }
}
