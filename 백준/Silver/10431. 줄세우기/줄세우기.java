import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //테스트 케이스 수
        //테스트 케이스 1 -> 20개의 양의 정수 : 줄서기 할 아이들의 키 오름차순
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); //테스트 케이스 수
        //t 만큼 반복
        for (int i = 1; i < t + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());
            int moveCount = 0;
            int[] arr = new int[20]; //20명 세울 배열 변수

            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < j; k++) {
                    if (arr[k] > arr[j]) {
                        moveCount += 1;
                    }
                }
            }
            System.out.println(i + " " + moveCount);
        }
    }
}
