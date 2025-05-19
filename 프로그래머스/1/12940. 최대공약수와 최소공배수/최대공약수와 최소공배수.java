class Solution {
    public int[] solution(int n, int m) {
        int r = 0;
        int a = n;
        int b = m;
        while(true) {
            r = a % b;
            if (a % b == 0) {
                break; 
            }
            a = b; 
            b = r;
        }
        int t = (n * m) / b;
        int[] answer = {b, t};
        return answer;
    }
}