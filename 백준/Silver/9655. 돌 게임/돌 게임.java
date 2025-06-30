import java.util.Currency;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //탁자 위에 돌 N개
        //상근이와 창영이가 턴을 번갈아가며 돌을 1개 또는 3개를 가져감
        //마지막 돌을 가져가는 사람이 게임 승 -> SK || CY 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 탁자 위에 있는 돌 개수
        //돌이 짝수개면 -> cy가 이김
        //돌이 홀수개면 -> sk가 이김
        if (n % 2 == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
