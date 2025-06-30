import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //H행 W열 N세로 M가로
        //br, bw 사용해보기
        //10 20 30 등과 같이 공백으로 구분된 숫자는 StringTokenizer st 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken()); //세로 간격
        int m = Integer.parseInt(st.nextToken()); //가로 간격

        int row = (int) Math.ceil((double)h / (n + 1));
        int col = (int) Math.ceil((double)w / (m + 1));

        System.out.println(row * col);
        
    }
}
