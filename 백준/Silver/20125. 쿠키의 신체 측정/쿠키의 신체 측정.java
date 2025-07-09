import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] cookie = new char[n][n];

        for (int i = 0; i < cookie.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < cookie[i].length; j++) {
                cookie[i][j] = line.charAt(j);
            }
        }
        
        //1. 심장 찾기 (heartX, heartY)
        int heartX = 0;
        int heartY = 0;
        outer:
        for (int i = 0; i < cookie.length; i++) {
            for (int j = 0; j < cookie[i].length; j++) {
                if (cookie[i][j] == '*') {
                    heartX = i+1;
                    heartY = j;
                    break outer;
                }
            }
        }
        System.out.println((heartX + 1) + " " + (heartY + 1));

        //2. 왼팔 찾기 leftArm 행고정 열감소
        int leftArm = 0;
        for (int i = heartY-1; i >= 0 && cookie[heartX][i] == '*'; i--) {
            leftArm++;
        }

        //3. 오른팔 찾기 rightArm 행고정 열증가
        int rightArm = 0;
        for (int i = heartY+1; i < n && cookie[heartX][i] == '*' ; i++) {
            rightArm++;
        }

        //4. 허리찾기 waist
        int waist = 0;
        int waistX = heartX + 1;
        for (int i = waistX; i < n && cookie[i][heartY] == '*'; i++) {
            waist++;
            waistX++;
        }

        //5. 왼다리 찾기 leftLeg
        int leftLeg = 0;
        for (int i = waistX; i < n && cookie[i][heartY-1] == '*'; i++) {
            leftLeg++;
        }

        //6. 오른다리 찾기 rightLeg
        int rightLeg = 0;
        for (int i = waistX; i < n && cookie[i][heartY + 1] == '*'; i++) {
            rightLeg++;
        }

        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
    }
}
