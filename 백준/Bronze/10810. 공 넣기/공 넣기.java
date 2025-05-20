import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            5 4 : 5개의 바구니가 있는데, 4번 공을 넣겠다.
            1 2 3 : 1번부터 2번까지 바구니에 공3을 넣겠다.
            3 4 4 : 3번부터 4번까지 바구니에 공4를 넣겠다.
            1 4 1 : 1번부터 4번까지 바구니에 공1을 넣겠다.
            2 2 2 : 2번부터 2번까지 바구니에 공2를 넣겠다.
            --> 1 2 1 1 0 출력 : 공의 번호 수
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //바구니의 수
        int m = sc.nextInt(); //몇 줄에 걸쳐서 넣을 건지
        // 바구니 배열
        int[] basket = new int[n];
        // 공을 어떻게 넣을건지 입력한다.
        // 시작 바구니 startB
        // 마지막 바구니 finishB
        // 볼 번호 numB
        int startB = 0;
        int finishB = 0;
        int numB = 0;
        for (int i = 1; i <= m; i++) {
            startB = sc.nextInt();
            finishB = sc.nextInt();
            numB = sc.nextInt();
            for (int j = startB; j <= finishB; j++) {
                basket[j-1] = numB;
            }
        }
        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i]);
            if (i != basket.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
