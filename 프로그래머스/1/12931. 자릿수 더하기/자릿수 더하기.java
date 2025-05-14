import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0; //나머지를 저장할 변수
        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}