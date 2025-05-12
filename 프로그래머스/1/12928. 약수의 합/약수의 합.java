class Solution {
     public int solution(int n) {
        //약수들을 누적 덧셈할 변수
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}