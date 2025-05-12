class Solution {
    public int solution(int number, int limit, int power) {
        //배열의 전체 원소를 더할 변수 answer
        int answer = 0;
        //약수를 담을 배열변수
        int[] arr = new int[number];
        for (int i = 1; i <= number; i++) {//5 1 2(1 2) 3(1 2) 4(1 2 4) 5 (1 5)
            int count = 0;                  // 1 2      2      3        2
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) count++;
                }
            }
            if (count > limit) { //약수들이 limit을 넘으면 power
                arr[i - 1] = power;
            } else {
                arr[i - 1] = count;
            }
            answer += arr[i - 1];
        }
        return answer;
    }
}