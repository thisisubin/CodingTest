import java.util.Scanner;

//2025년 5월 21일
//공 바꾸기 문제
public class Main {
    public static void main(String[] args) {
        //바구니 개수 : n
        //교환 횟수 : m
        //입력1 입력2 : 두개의 입력한 숫자의 자리를 서로 바꾼다
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //바구니 개수만큼 배열 생성
        int[] basket = new int[n];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i+1;
        }
        for (int i = 0; i < m; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            //두 숫자의 자리를 바꾼다.
            int temp = basket[num2 - 1];
            basket[num2 - 1] = basket[num1 - 1];
            basket[num1 - 1] = temp;
        }
        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i]);
            if (i != basket.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
