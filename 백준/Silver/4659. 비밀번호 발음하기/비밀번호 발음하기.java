import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
 */
public class Main {
    public static boolean Accept (String line) {
        String aeiou = "aeiou";
        boolean hasAeiou = false;
        int aeiouCount = 0; //모음 개수
        int count = 0; //자음개수
        char prev = 0;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            //모음 포함 체크
            if (aeiou.indexOf(c) != -1) { // indexOf : 문자 c가 처음 등장하는 인덱스를 반환함 c가 aeiou에 없으면 -1 반환
                aeiouCount ++;
                hasAeiou = true;
                count = 0;
            } else {
                count ++;
                aeiouCount = 0;
            }

            //모음 3개 or 자음 3개 체크
            if (aeiouCount == 3 || count == 3) {
                return false;
            }
            //같은 글자 연속인지 체크
            if (i > 0 && c == prev && !(c =='e' || c == 'o')) {
                return false;
            }
            prev = c;
        }
        return hasAeiou;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            if (line.equals("end")) { //friend의 경우는 통과해야 하므로 contain이 아니라 equals 여야 함
                break;
            }
            
            if (Accept(line)) {
                System.out.println("<" + line + "> is acceptable.");
            }
            else {
                System.out.println("<" + line + "> is not acceptable.");
            }

        }
    }
}
