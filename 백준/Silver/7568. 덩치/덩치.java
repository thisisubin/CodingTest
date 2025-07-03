import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //전체 사람의 수
        //몸무게 키
        //각 덩치 등수 공백 일렬 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] person = new int[n][2]; //
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            person[i][0] = Integer.parseInt(st.nextToken()); //몸무게 입력
            person[i][1] = Integer.parseInt(st.nextToken()); //키 입력
        }

        //등수 계산
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (person[j][0] > person[i][0] && person[j][1] > person[i][1]) {
                    rank ++;
                }
            }
            System.out.print(rank + " ");
        }

    }
}
