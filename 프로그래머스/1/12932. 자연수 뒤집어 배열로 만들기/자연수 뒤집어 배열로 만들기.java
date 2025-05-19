class Solution {
    public int[] solution(long n) {
        int len = 0;
        long temp = n;

        // 자릿수 세기
        while (temp > 0) {
            temp /= 10;
            len++;
        }

        // 배열 생성 후 숫자 채우기
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }

        return answer;
    }
}
